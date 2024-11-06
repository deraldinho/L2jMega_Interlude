package com.l2jmega.gameserver.scripting.quests;

import com.l2jmega.gameserver.model.actor.Npc;
import com.l2jmega.gameserver.model.actor.instance.Player;
import com.l2jmega.gameserver.scripting.Quest;
import com.l2jmega.gameserver.scripting.QuestState;

public class Q607_ProveYourCourage extends Quest
{
	private static final String qn = "Q607_ProveYourCourage";
	
	// Items
	private static final int HEAD_OF_SHADITH = 7235;
	private static final int TOTEM_OF_VALOR = 7219;
	private static final int KETRA_ALLIANCE_3 = 7213;
	
	public Q607_ProveYourCourage()
	{
		super(607, "Prove your courage!");
		
		setItemsIds(HEAD_OF_SHADITH);
		
		addStartNpc(31370); // Kadun Zu Ketra
		addTalkId(31370);
		
		addKillId(25309); // Shadith
	}
	
	@Override
	public String onAdvEvent(String event, Npc npc, Player player)
	{
		String htmltext = event;
		QuestState st = player.getQuestState(qn);
		if (st == null)
			return htmltext;
		
		if (event.equalsIgnoreCase("31370-04.htm"))
		{
			st.setState(STATE_STARTED);
			st.set("cond", "1");
			st.playSound(QuestState.SOUND_ACCEPT);
		}
		else if (event.equalsIgnoreCase("31370-07.htm"))
		{
			if (st.hasQuestItems(HEAD_OF_SHADITH))
			{
				st.takeItems(HEAD_OF_SHADITH, -1);
				st.giveItems(TOTEM_OF_VALOR, 1);
				st.rewardExpAndSp(10000, 0);
				st.playSound(QuestState.SOUND_FINISH);
				st.exitQuest(true);
			}
			else
			{
				htmltext = "31370-06.htm";
				st.set("cond", "1");
				st.playSound(QuestState.SOUND_ACCEPT);
			}
		}
		
		return htmltext;
	}
	
	@Override
	public String onTalk(Npc npc, Player player)
	{
		String htmltext = getNoQuestMsg();
		QuestState st = player.getQuestState(qn);
		if (st == null)
			return htmltext;
		
		switch (st.getState())
		{
			case STATE_CREATED:
				if (player.getLevel() < 75)
					htmltext = "31370-03.htm";
				else if (player.getAllianceWithVarkaKetra() >= 3 && st.hasQuestItems(KETRA_ALLIANCE_3) && !st.hasQuestItems(TOTEM_OF_VALOR))
					htmltext = "31370-01.htm";
				else
					htmltext = "31370-02.htm";
				break;
			
			case STATE_STARTED:
				htmltext = (st.hasQuestItems(HEAD_OF_SHADITH)) ? "31370-05.htm" : "31370-06.htm";
				break;
		}
		
		return htmltext;
	}
	
	@Override
	public String onKill(Npc npc, Player player, boolean isPet)
	{
		for (Player partyMember : getPartyMembers(player, npc, "cond", "1"))
		{
			if (partyMember.getAllianceWithVarkaKetra() >= 3)
			{
				QuestState st = partyMember.getQuestState(qn);
				if (st.hasQuestItems(KETRA_ALLIANCE_3))
				{
					st.set("cond", "2");
					st.playSound(QuestState.SOUND_MIDDLE);
					st.giveItems(HEAD_OF_SHADITH, 1);
				}
			}
		}
		
		return null;
	}
}