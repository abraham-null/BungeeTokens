package Listeners;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import BungeeTokens.BungeeTokens.BungeeTokens;

public class CommandListener implements CommandExecutor {
	private BungeeTokens plugin;

	public CommandListener(BungeeTokens plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("tokens")) {
			
			if(args.length == 0){
				plugin.tokenAPI.showMenu((Player) sender);
			}
			
			if(args.length == 3){
				if(sender.hasPermission("thelasthero.tokens.give")){
				Player p = Bukkit.getPlayer(args[1]);
				
				if(args[0].equalsIgnoreCase("give")){
					plugin.tokenAPI.addPlayerTokensFromHashMap(p, Integer.valueOf(args[2]));
				}
				}
				
			}
			
		}
		
		return false;
		}


}
