package com.l2jmega.gameserver.handler.voicedcommandhandlers;

import com.l2jmega.Config;
import com.l2jmega.gameserver.handler.IVoicedCommandHandler;
import com.l2jmega.gameserver.model.actor.instance.Player;
import com.l2jmega.gameserver.network.serverpackets.NpcHtmlMessage;

import java.util.StringTokenizer;

import Dev.AutoFarm.AutofarmManager;

public class VoicedAutofarm implements IVoicedCommandHandler 
{
    private final String[] VOICED_COMMANDS = 
    {
    	"autofarm",
    	"startautofarm",
    	"stopautofarm"
    };

    @Override
    public boolean useVoicedCommand(final String command, final Player player, final String args)
    {
    	if (command.startsWith("autofarm"))
    	{
    		if(Config.ENABLE_COMMAND_VIP_AUTOFARM)
        	{
        		if(!player.isVip())
        		{
        			VoicedMenu.showMenuHtml(player);
        			player.sendMessage("You are not VIP member.");
        			return false;
        		}
        	}
    		
    		if (!player.isAutoFarm())
    			showAutoFarm(player);
    		else
    			showAutoFarmActive(player);
    	}
		if (command.startsWith("startautofarm"))
		{ 
			
			if(Config.ENABLE_COMMAND_VIP_AUTOFARM)
        	{
        		if(!player.isVip())
        		{
        			VoicedMenu.showMenuHtml(player);
        			player.sendMessage("You are not VIP member.");
        			return false;
        		}
        	}
	        

			StringTokenizer st = new StringTokenizer(command);
			st.nextToken();
			try
			{
				String type = st.nextToken();
				
				 if (type.startsWith("300"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius300(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("400"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius400(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("500"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius500(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("600"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius600(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("700"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius700(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("800"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius800(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("900"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius900(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1000"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1000(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1100"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1100(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1200"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1200(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1300"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1300(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1400"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1400(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1500"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1500(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1600"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1600(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1700"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1700(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1800"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1800(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("1900"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius1900(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("2000"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius2000(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("2100"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius2100(true);
					showAutoFarmActive(player);
				}
				else if (type.startsWith("2200"))
				{
					AutofarmManager.INSTANCE.startFarm(player);
					player.setAutoFarm(true);
					player.setAutoFarmRadius2200(true);
					showAutoFarmActive(player);
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		if (command.startsWith("stopautofarm"))
		{
			if(Config.ENABLE_COMMAND_VIP_AUTOFARM)
        	{
        		if(!player.isVip())
        		{
        			VoicedMenu.showMenuHtml(player);
        			player.sendMessage("You are not VIP member.");
        			return false;
        		}
        	}
	        

			if (player.isAutoFarm() || player.isAutoFarmRadius300() || player.isAutoFarmRadius400() || player.isAutoFarmRadius500() || player.isAutoFarmRadius600() || player.isAutoFarmRadius700() || player.isAutoFarmRadius800() || player.isAutoFarmRadius900() || player.isAutoFarmRadius1000() || player.isAutoFarmRadius1100() || player.isAutoFarmRadius1200() || player.isAutoFarmRadius1300() || player.isAutoFarmRadius1400() 
				|| player.isAutoFarmRadius1500() || player.isAutoFarmRadius1600() || player.isAutoFarmRadius1700() || player.isAutoFarmRadius1800() || player.isAutoFarmRadius1900() || player.isAutoFarmRadius2000() || player.isAutoFarmRadius2100() || player.isAutoFarmRadius2200())
			{
				AutofarmManager.INSTANCE.stopFarm(player);
				player.setAutoFarm(false);
				player.setAutoFarmRadius300(false);
				player.setAutoFarmRadius400(false);
				player.setAutoFarmRadius500(false);
				player.setAutoFarmRadius600(false);
				player.setAutoFarmRadius700(false);
				player.setAutoFarmRadius800(false);
				player.setAutoFarmRadius900(false);
				player.setAutoFarmRadius1000(false);
				player.setAutoFarmRadius1100(false);
				player.setAutoFarmRadius1200(false);
				player.setAutoFarmRadius1300(false);
				player.setAutoFarmRadius1400(false);
				player.setAutoFarmRadius1500(false);
				player.setAutoFarmRadius1600(false);
				player.setAutoFarmRadius1700(false);
				player.setAutoFarmRadius1800(false);
				player.setAutoFarmRadius1900(false);
				player.setAutoFarmRadius2000(false);
				player.setAutoFarmRadius2100(false);
				player.setAutoFarmRadius2200(false);
				showAutoFarm(player);
			}
		}

        return false;
    }
    
	private static final String ACTIVED = "<font color=00FF00>STARTED</font>";
	private static final String DESATIVED = "<font color=FF0000>STOPPED</font>";
	
	public static void showAutoFarm(Player activeChar)
	{
		if(Config.ENABLE_COMMAND_VIP_AUTOFARM)
    	{
    		if(!activeChar.isVip())
    		{
    			VoicedMenu.showMenuHtml(activeChar);
    			activeChar.sendMessage("You are not VIP member.");
    			return;
    		}
    	}
		NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile("data/html/mods/menu/AutoFarm.htm"); 
		html.replace("%player%", activeChar.getName());
		html.replace("%autofarm%", activeChar.isAutoFarm() ? ACTIVED : DESATIVED);
		activeChar.sendPacket(html);
	}
	
	public static void showAutoFarmActive(Player activeChar)
	{
		if(Config.ENABLE_COMMAND_VIP_AUTOFARM)
    	{
    		if(!activeChar.isVip())
    		{
    			VoicedMenu.showMenuHtml(activeChar);
    			activeChar.sendMessage("You are not VIP member.");
    			return;
    		}
    	}
		NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile("data/html/mods/menu/AutoFarmActive.htm"); 
		html.replace("%player%", activeChar.getName());
		html.replace("%autofarm%", activeChar.isAutoFarm() ? ACTIVED : DESATIVED);
		
		if (activeChar.isAutoFarmRadius300()) 
			html.replace("%radius%", "300");
		
		if (activeChar.isAutoFarmRadius400()) 
			html.replace("%radius%", "400");
		
		if (activeChar.isAutoFarmRadius500()) 
			html.replace("%radius%", "500");
		
		if (activeChar.isAutoFarmRadius600()) 
			html.replace("%radius%", "600");
		
		if (activeChar.isAutoFarmRadius700()) 
			html.replace("%radius%", "700");
		
		if (activeChar.isAutoFarmRadius800()) 
			html.replace("%radius%", "800");
		
		if (activeChar.isAutoFarmRadius900()) 
			html.replace("%radius%", "900");
		
		if (activeChar.isAutoFarmRadius1000()) 
			html.replace("%radius%", "1000");
		
		if (activeChar.isAutoFarmRadius1100()) 
			html.replace("%radius%", "1100");
		
		if (activeChar.isAutoFarmRadius1200()) 
			html.replace("%radius%", "1200");
		
		if (activeChar.isAutoFarmRadius1300()) 
			html.replace("%radius%", "1300");
		
		if (activeChar.isAutoFarmRadius1400()) 
			html.replace("%radius%", "1400");
		
		if (activeChar.isAutoFarmRadius1500()) 
			html.replace("%radius%", "1500");
		
		if (activeChar.isAutoFarmRadius1600()) 
			html.replace("%radius%", "1600");
		
		if (activeChar.isAutoFarmRadius1700()) 
			html.replace("%radius%", "1700");
		
		if (activeChar.isAutoFarmRadius1800()) 
			html.replace("%radius%", "1800");
		
		if (activeChar.isAutoFarmRadius1900()) 
			html.replace("%radius%", "1900");
		
		if (activeChar.isAutoFarmRadius2000()) 
			html.replace("%radius%", "2000");
		
		if (activeChar.isAutoFarmRadius2100()) 
			html.replace("%radius%", "2100");
		
		if (activeChar.isAutoFarmRadius2200()) 
			html.replace("%radius%", "2200");
		
		activeChar.sendPacket(html);
	}

    @Override
    public String[] getVoicedCommandList() 
    {
        return VOICED_COMMANDS;
    }
}