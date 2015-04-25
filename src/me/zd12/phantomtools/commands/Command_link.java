package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.PLAYER, permission = "phantom.user.link")
public class Command_link extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.GOLD + "We currently have no forums or info websites, but will shortly!");
        return true;
    }
}
