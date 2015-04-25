package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_notchtroll extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Bukkit.broadcastMessage(ChatColor.YELLOW + "Notch joined the game.");
        Bukkit.broadcastMessage(messages.notch + "Wrong server");
        Bukkit.broadcastMessage(ChatColor.YELLOW + "Notch left the game.");
        return true;
    
    }
}
