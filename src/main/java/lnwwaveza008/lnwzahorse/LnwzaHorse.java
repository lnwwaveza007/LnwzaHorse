package lnwwaveza008.lnwzahorse;

import lnwwaveza008.lnwzahorse.commands.HorseCommands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class LnwzaHorse extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "=====================================================");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "              LnwzaHorse just started!");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "                  Version : 1.0");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "=====================================================");
        //Commands
        getCommand("lnwzahorse").setExecutor(new HorseCommands());
        //Config File
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        //Get All files
        File Folder = new File(this.getDataFolder() + "/Examples");
        if(!Folder.exists()) {
            try{
                Folder.mkdir();
                File amongus = new File(this.getDataFolder() + "/Examples/Amongus.yml");
                amongus.createNewFile();
            }catch (Exception e) {
                // if error persists
                e.printStackTrace();
            }
        }
        File dataFolder = new File(this.getDataFolder()+"/Examples");
        File[] files = dataFolder.listFiles();
        for (File f : files){
            getServer().getConsoleSender().sendMessage(ChatColor.GREEN + f.getName());
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "=====================================================");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "              LnwzaHorse just stopped!");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "                  Version : 1.0");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "=====================================================");
    }
}
