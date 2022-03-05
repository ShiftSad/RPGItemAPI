package me.sadev.rpg;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class Cooldowns {

    public static HashMap<String, Long> cooldowns = new HashMap<>();

    public static void setCooldowns(Player player, int secondes){
        long delay = System.currentTimeMillis() + (secondes * 1000L);
        cooldowns.put(player.getName(), delay);

    }

    public static int getCooldowns(Player player){
        return Math.toIntExact(Math.round(cooldowns.get(player.getName()) - System.currentTimeMillis() / 1000L));
    }

    public static boolean checkCooldowns(Player player){
        return !cooldowns.containsKey(player.getName()) || cooldowns.get(player.getName()) <= System.currentTimeMillis();
    }
}
