package xyz.n7mn.dev.autorespawn;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

class GiveBarrierCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;

            if (!player.isOp() && !player.hasPermission("autorespawn.op")){
                return true;
            }

            player.getInventory().addItem(new ItemStack(Material.BARRIER));

        }


        return true;
    }
}
