package lnwwaveza008.lnwzahorse.commands;

import lnwwaveza008.lnwzahorse.LnwzaHorse;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

import static org.bukkit.Bukkit.getServer;

public class HorseCommands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(args[0]);
        }else if(sender instanceof ConsoleCommandSender){
            getServer().getConsoleSender().sendMessage(ChatColor.RED + "The command can use only with player!");
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', LnwzaHorse.getPlugin(LnwzaHorse.class).getConfig().getString("message_prefix","&7[&6LnwzaHorse&7]")));
        }else{
            sender.sendMessage("The command can use only with player");
        }
        return true;
    }
}
