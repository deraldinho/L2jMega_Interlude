package com.l2jmega.gameserver.skills.effects;

import com.l2jmega.gameserver.model.L2Effect;
import com.l2jmega.gameserver.skills.Env;
import com.l2jmega.gameserver.templates.skills.L2EffectType;

public class EffectDebuff extends L2Effect
{
	public EffectDebuff(Env env, EffectTemplate template)
	{
		super(env, template);
	}
	
	@Override
	public L2EffectType getEffectType()
	{
		return L2EffectType.DEBUFF;
	}
	
	@Override
	public boolean onActionTime()
	{
		return false;
	}
}