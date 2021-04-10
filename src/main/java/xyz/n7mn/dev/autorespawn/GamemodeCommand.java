package xyz.n7mn.dev.autorespawn;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            if (!player.isOp() && !player.hasPermission("autorespawn.op")){
                return true;
            }

            if (args.length != 1){
                return true;
            }

            if (args[0].equals("0") || args[0].toLowerCase().equals("s") || args[0].toLowerCase().equals("survival")){
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("ゲームモードをサバイバルにしました。");
                return true;
            }

            if (args[0].equals("1") || args[0].toLowerCase().equals("c") || args[0].toLowerCase().equals("creative")){
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("ゲームモードをクリエイティブにしました。");
                return true;
            }

            if (args[0].equals("2") || args[0].toLowerCase().equals("a") || args[0].toLowerCase().equals("adventure")){
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("ゲームモードをアドベンチャーにしました。");
                return true;
            }

            if (args[0].equals("3") || args[0].toLowerCase().equals("sp") || args[0].toLowerCase().equals("spectator")){
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("ゲームモードをスペクテイターにしました。");
                return true;
            }

        }

        return true;
    }
}
