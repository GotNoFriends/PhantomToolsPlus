package me.zd12.phantomtools.commands;

import me.zd12.phantomtools.messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
public class Command_cmdlist extends BukkitCommand {   

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(messages.pname + "All commands:");
        sender.sendMessage(ChatColor.GRAY + "?, about, \n" +
"achievement, adventure\n" +
"ban, ban-ip\n" +
"banlist, bukkit:?\n" +
"bukkit:about, bukkit:achievement\n" +
"bukkit:ban, bukkit:ban-ip\n" +
"bukkit:banlist, bukkit:clear\n" +
"bukkit:defaultgamemode, bukkit:deop\n" +
"bukkit:difficulty, bukkit:effect\n" +
"bukkit:enchant, bukkit:gamemode\n" +
"bukkit:gamerule, bukkit:give\n" +
"bukkit:help, bukkit:kick\n" +
"bukkit:kill, bukkit:list\n" +
"bukkit:me, bukkit:msg\n" +
"bukkit:op, bukkit:pardon\n" +
"bukkit:pardon-ip, bukkit:pl\n" +
"bukkit:playsound, bukkit:plugins\n" +
"bukkit:reload, bukkit:rl\n" +
"bukkit:save-all, bukkit:save-off\n" +
"bukkit:save-on, bukkit:say\n" +
"bukkit:scoreboard, bukkit:seed\n" +
"bukkit:setidletimeout, bukkit:setworldspawn\n" +
"bukkit:spawnpoint, bukkit:spreadplayers\n" +
"bukkit:stop, bukkit:tell\n" +
"bukkit:testfor, bukkit:time\n" +
"bukkit:timings, bukkit:toggledownfall\n" +
"bukkit:tp, bukkit:ver\n" +
"bukkit:version, bukkit:w\n" +
"bukkit:weather, bukkit:whitelist\n" +
"bukkit:xp, clear\n" +
"colors, colours\n" +
"creative, defaultgamemode\n" +
"deop, difficulty\n" +
"effect, enchant\n" +
"gamemode, gamerule\n" +
"give, gma\n" +
"gmc, gms\n" +
"help, icanhasbukkit\n" +
"kick, kill\n" +
"list, me\n" +
"minecraft:achievement, minecraft:ban\n" +
"minecraft:ban-ip, minecraft:banlist\n" +
"minecraft:clear, minecraft:defaultgamemode\n" +
"minecraft:deop, minecraft:difficulty\n" +
"minecraft:effect, minecraft:enchant\n" +
"minecraft:gamemode, minecraft:gamerule\n" +
"minecraft:give, minecraft:help\n" +
"minecraft:kick, minecraft:kill\n" +
"minecraft:list, minecraft:me\n" +
"minecraft:netstat, minecraft:op\n" +
"minecraft:pardon, minecraft:pardon-ip\n" +
"minecraft:playsound, minecraft:say\n" +
"minecraft:scoreboard, minecraft:seed\n" +
"minecraft:setblock, minecraft:setidletimeout\n" +
"minecraft:setworldspawn, minecraft:spawnpoint\n" +
"minecraft:spreadplayers, minecraft:summon\n" +
"minecraft:tell, minecraft:tellraw\n" +
"minecraft:testfor, minecraft:testforblock\n" +
"minecraft:time, minecraft:toggledownfall\n" +
"minecraft:tp, minecraft:weather\n" +
"minecraft:whitelist, minecraft:xp\n" +
"msg, netstat\n" +
"notchtroll, op\n" +
"pardon, pardon-ip\n" +
"pcc, phantomtools\n" +
"phantomtoolsplus:adventure, phantomtoolsplus:colors\n" +
"phantomtoolsplus:colours, phantomtoolsplus:creative\n" +
"phantomtoolsplus:gma, phantomtoolsplus:gmc\n" +
"phantomtoolsplus:gms, phantomtoolsplus:notchtroll\n" +
"phantomtoolsplus:pcc, phantomtoolsplus:phantomtools\n" +
"phantomtoolsplus:survival, pl\n" +
"playsound, plugins\n" +
"reload, restart\n" +
"rl, save-all\n" +
"save-off, save-on\n" +
"say, scoreboard\n" +
"seed, setblock\n" +
"setidletimeout, setworldspawn\n" +
"spawnpoint, spigot:restart\n" +
"spigot:tps, spreadplayers\n" +
"stop, summon\n" +
"survival, tell\n" +
"tellraw, testfor\n" +
"testforblock, time\n" +
"timings, toggledownfall\n" +
"tp, tps\n" +
"ver, version\n" +
"w, weather\n" +
"whitelist, xp");
        return true;
    }
}
