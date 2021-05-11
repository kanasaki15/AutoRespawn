package xyz.n7mn.dev.autorespawn;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class EventListener implements Listener {

    final Plugin plugin;
    public EventListener(Plugin plugin){
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerDeathEvent(PlayerDeathEvent e){

        new BukkitRunnable() {
            @Override
            public void run() {
                e.getEntity().sendMessage("自動リスポーンします...");
                Bukkit.getScheduler().runTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        e.getEntity().spigot().respawn();
                    }
                });

            }
        }.runTaskLaterAsynchronously(plugin, 5L);

    }

}
