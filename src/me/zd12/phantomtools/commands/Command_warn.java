package me.zD12.phantomtools.commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_warn extends BukkitCommand {

  @Override
  public boolean run(final CommandSender sender, Command cmd, String label, String[] args)
  {
int length = args.length;
    
    if (length == 0)
    {
      sender.sendMessage("/warn <player>");
      return true;
    }
    
    if (length == 1)
    {
      boolean playerFound = false;
      
      for (Player player : Bukkit.getServer().getOnlinePlayers())
      {
        if (player.getName().equalsIgnoreCase(args[0]))
        {
          Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + ": Warning " + player.getName());
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has been warned for breaking the rules.");
          
          }
          
          sender.sendMessage(ChatColor.GRAY + "You have warned " + player.getName() + ".");
          player.sendMessage(ChatColor.GOLD + "You were warned by " + ChatColor.RED + sender.getName() + ChatColor.GOLD + "." + ChatColor.GOLD + " Please refrain from breaking the rules.");
          playerFound = true;
          break;
        }
      }
      boolean playerFound = false;
      
      if (playerFound == false)
      {
        sender.sendMessage(ChatColor.GRAY + args[0] + " not found!");
      }
      
      return true;
    }
    
  
  }

