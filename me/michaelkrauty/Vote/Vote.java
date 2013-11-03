package me.michaelkrauty.Vote;

import java.io.IOException;

import me.michaelkrauty.Vote.Metrics;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Vote extends JavaPlugin{
	
	public void onEnable(){
		try {
		Metrics metrics = new Metrics(this);
		metrics.start();
	} catch (IOException e){
	}
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]){
		
		if(commandLabel.equalsIgnoreCase("vote")){
			if(args.length == 0){
				sender.sendMessage(getConfig().getString("command_message"));
				if(getConfig().getString("amount_of_links").equals("1")){
					sender.sendMessage(getConfig().getString("links.link1"));
				}
				if(getConfig().getString("amount_of_links").equals("2")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
				}
				if(getConfig().getString("amount_of_links").equals("3")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
				}
				if(getConfig().getString("amount_of_links").equals("4")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
				}
				if(getConfig().getString("amount_of_links").equals("5")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
					sender.sendMessage(getConfig().getString("links.link5"));
				}
				if(getConfig().getString("amount_of_links").equals("6")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
					sender.sendMessage(getConfig().getString("links.link5"));
					sender.sendMessage(getConfig().getString("links.link6"));
				}
				if(getConfig().getString("amount_of_links").equals("7")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
					sender.sendMessage(getConfig().getString("links.link5"));
					sender.sendMessage(getConfig().getString("links.link6"));
					sender.sendMessage(getConfig().getString("links.link7"));
				}
				if(getConfig().getString("amount_of_links").equals("8")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
					sender.sendMessage(getConfig().getString("links.link5"));
					sender.sendMessage(getConfig().getString("links.link6"));
					sender.sendMessage(getConfig().getString("links.link7"));
					sender.sendMessage(getConfig().getString("links.link8"));
				}
				if(getConfig().getString("amount_of_links").equals("9")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
					sender.sendMessage(getConfig().getString("links.link5"));
					sender.sendMessage(getConfig().getString("links.link6"));
					sender.sendMessage(getConfig().getString("links.link7"));
					sender.sendMessage(getConfig().getString("links.link8"));
					sender.sendMessage(getConfig().getString("links.link9"));
				}
				if(getConfig().getString("amount_of_links").equals("10")){
					sender.sendMessage(getConfig().getString("links.link1"));
					sender.sendMessage(getConfig().getString("links.link2"));
					sender.sendMessage(getConfig().getString("links.link3"));
					sender.sendMessage(getConfig().getString("links.link4"));
					sender.sendMessage(getConfig().getString("links.link5"));
					sender.sendMessage(getConfig().getString("links.link6"));
					sender.sendMessage(getConfig().getString("links.link7"));
					sender.sendMessage(getConfig().getString("links.link8"));
					sender.sendMessage(getConfig().getString("links.link9"));
					sender.sendMessage(getConfig().getString("links.link10"));
				}
				return true;
			}else{
				sender.sendMessage(getConfig().getString("error_message"));
				return true;
			}
		}
		return true;
	}
	
}
