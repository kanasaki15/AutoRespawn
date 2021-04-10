package xyz.n7mn.dev.autorespawn;

import org.bukkit.plugin.java.JavaPlugin;

public final class AutoRespawn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new EventListener(this), this);

        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("gb").setExecutor(new GamemodeCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
