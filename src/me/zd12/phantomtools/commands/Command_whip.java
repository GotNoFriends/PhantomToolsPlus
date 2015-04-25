package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.*;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_whip extends BukkitCommand {
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args)
    {
            if (sender instanceof Player)
            {
                Player p = (Player) sender;
                if (p.hasPermission("phantomtoolsplus.whip"))
                {
                    if (args.length != 1)
                    {
                        return false;
                    }
                    else
                    {
                        Player target = Bukkit.getServer().getPlayer(args[0]);
                        Bukkit.broadcastMessage(ChatColor.RED + target.getName() + " has been whipped for breaking the rules.");
                        target.damage(8);
                        target.sendMessage(ChatColor.GRAY + "You have been whipped for breaking the rules!.");
                    }
                }
                else
                {
                }
            }
            else
            {
                
            }
            
            return true;
        }
        
    }
