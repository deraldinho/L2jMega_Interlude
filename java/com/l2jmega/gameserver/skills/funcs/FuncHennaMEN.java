package com.l2jmega.gameserver.skills.funcs;

import com.l2jmega.gameserver.model.actor.instance.Player;
import com.l2jmega.gameserver.skills.Env;
import com.l2jmega.gameserver.skills.Stats;
import com.l2jmega.gameserver.skills.basefuncs.Func;

public class FuncHennaMEN extends Func
{
	static final FuncHennaMEN _fh_instance = new FuncHennaMEN();
	
	public static Func getInstance()
	{
		return _fh_instance;
	}
	
	private FuncHennaMEN()
	{
		super(Stats.STAT_MEN, 0x10, null, null);
	}
	
	@Override
	public void calc(Env env)
	{
		final Player player = env.getPlayer();
		if (player != null)
			env.addValue(player.getHennaStatMEN());
	}
}