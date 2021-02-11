package xyz.n7mn.dev.autorespawn;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void player(PlayerDeathEvent e){
        if (e.getDeathMessage().equals("")){
            e.getEntity().spigot().respawn();
        }
    }

}
