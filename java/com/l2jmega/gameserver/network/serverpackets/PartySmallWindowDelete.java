package com.l2jmega.gameserver.network.serverpackets;

import com.l2jmega.gameserver.model.actor.instance.Player;

public class PartySmallWindowDelete extends L2GameServerPacket
{
	private final Player _member;
	
	public PartySmallWindowDelete(Player member)
	{
		_member = member;
	}
	
	@Override
	protected final void writeImpl()
	{
		writeC(0x51);
		writeD(_member.getObjectId());
		writeS(_member.getName());
	}
}