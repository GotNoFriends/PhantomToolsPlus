package me.zd12.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_gma extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        server.dispatchCommand(sender, "gamemode adventure");
        return true;
    
    }
}
