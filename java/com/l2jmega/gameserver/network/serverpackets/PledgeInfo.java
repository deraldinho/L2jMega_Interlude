package com.l2jmega.gameserver.network.serverpackets;

import com.l2jmega.gameserver.model.pledge.Clan;

public class PledgeInfo extends L2GameServerPacket
{
	private final Clan _clan;
	
	public PledgeInfo(Clan clan)
	{
		_clan = clan;
	}
	
	@Override
	protected final void writeImpl()
	{
		writeC(0x83);
		writeD(_clan.getClanId());
		writeS(_clan.getName());
		writeS(_clan.getAllyName());
	}
}