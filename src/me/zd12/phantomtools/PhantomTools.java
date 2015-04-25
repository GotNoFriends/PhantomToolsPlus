package me.zd12.phantomtools;

import java.sql.SQLException;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import me.za12.phantomtools.PTP_Config;
import me.zd12.phantomtools.commands.Command_admininfo;

public class PhantomTools extends BukkitPlugin
{

    public static PhantomTools plugin;
    public BukkitCommandHandler handler;

    // YAML File Information

    /**
     *
     */
    public static PTP_Config ptpconfig;
    public static FileConfiguration config;

    @Override
    public void onLoad()
    {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);

    }

    @Override
    public void onEnable()
    {
        // Bukkit Lib Important Stuff
        BukkitLib.init(plugin);
        handler.setCommandLocation(Command_admininfo.class.getPackage());

        // More YAML Setting Up and information.
        ptpconfig = new PTP_Config(plugin, "config.yml");
        ptpconfig.saveDefaultConfig();
        config = ptpconfig.getConfig();

        LoggerUtils.info(plugin, "has been enabled with no problems.");

    }

    @Override
    public void onDisable()
    {
        // Save the config.
        ptpconfig.saveConfig();

        LoggerUtils.info(plugin, "has been disabled with no problems.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        // BukkitLib Command Shit
        return handler.handleCommand(sender, cmd, commandLabel, args);
    }
}
