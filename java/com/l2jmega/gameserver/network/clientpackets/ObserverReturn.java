package com.l2jmega.gameserver.network.clientpackets;

import com.l2jmega.gameserver.model.actor.instance.Player;

public final class ObserverReturn extends L2GameClientPacket
{
	@Override
	protected void readImpl()
	{
	}
	
	@Override
	protected void runImpl()
	{
		final Player activeChar = getClient().getActiveChar();
		if (activeChar == null)
			return;
		
		if (activeChar.isInObserverMode())
			activeChar.leaveObserverMode();
	}
}