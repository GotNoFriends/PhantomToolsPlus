package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
public class Command_admininfo extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(messages.lulzname + "Hi there!  You may obtain administrator by applying on our forums!");
        sender.sendMessage(ChatColor.GOLD + "http://lulzcraft.boards.net/");
        return true;
    }
}
