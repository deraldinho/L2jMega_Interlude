package com.l2jmega.gameserver.skills.effects;

import com.l2jmega.gameserver.model.L2Effect;
import com.l2jmega.gameserver.skills.AbnormalEffect;
import com.l2jmega.gameserver.skills.Env;
import com.l2jmega.gameserver.templates.skills.L2EffectType;

/**
 * @author LBaldi
 */
public class EffectBigHead extends L2Effect
{
	public EffectBigHead(Env env, EffectTemplate template)
	{
		super(env, template);
	}
	
	@Override
	public L2EffectType getEffectType()
	{
		return L2EffectType.BUFF;
	}
	
	@Override
	public boolean onStart()
	{
		getEffected().startAbnormalEffect(AbnormalEffect.BIG_HEAD);
		return true;
	}
	
	@Override
	public void onExit()
	{
		getEffected().stopAbnormalEffect(AbnormalEffect.BIG_HEAD);
	}
	
	@Override
	public boolean onActionTime()
	{
		return false;
	}
}