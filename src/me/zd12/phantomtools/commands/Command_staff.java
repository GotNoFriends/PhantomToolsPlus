package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.PLAYER, permission = "phantom.user.staff")
public class Command_staff extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.DARK_AQUA + "&4LulzCraft Server Team:");
        sender.sendMessage(ChatColor.DARK_GREEN + "Owner - Explosives");
        sender.sendMessage(ChatColor.GREEN + "Co Owner - Someday");
        sender.sendMessage(ChatColor.AQUA + "Manager - cowgomooo12");
        sender.sendMessage(ChatColor.DARK_RED + "Executive - Stampy100");
        sender.sendMessage(ChatColor.DARK_RED + "Head Admin - KWEEBO");
        sender.sendMessage(ChatColor.RED + "Admin - Revalation");
        sender.sendMessage(ChatColor.RED + "Admin - xDestroyer217");
        return true;
    }
}
