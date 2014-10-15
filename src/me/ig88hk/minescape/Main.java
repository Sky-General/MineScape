package me.ig88hk.minescape;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	public final Logger logger = Logger.getLogger("Minecraft");
	public PluginDescriptionFile pdfFile = getDescription();
     
    public void onEnable() {
    	logger.info("[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + " is now enabled!");
    	new ListenerClass(this);
    	new MainCommand(this, "cmd here");
    }
    	
    public void onDisable() {
    	logger.info("[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + " is now disabled!");
    	}
    
	
}

