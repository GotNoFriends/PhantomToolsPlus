package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.ANY, permission = "phantom.user.admininfo")
public class Command_admininfo extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(messages.sname + messages.ai_message); // Change the servers name and message at '.\src\me\zd12\phantomtools\messages.java'
        sender.sendMessage(ChatColor.AQUA + "However, stay updated to see when our forums are created!:");
        return true;
    }
}
