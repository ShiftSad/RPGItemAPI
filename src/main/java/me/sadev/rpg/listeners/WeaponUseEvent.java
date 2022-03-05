package me.sadev.rpg.listeners;

import dev.lone.itemsadder.api.CustomStack;
import me.sadev.rpg.Cooldowns;
import me.sadev.rpg.MainRPG;
import me.sadev.rpg.object.magicSwords.MagicSword;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;

public record WeaponUseEvent(MainRPG plugin) implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            CustomStack citem = CustomStack.byItemStack
                    (player.getInventory().getItemInMainHand());

            if (citem == null)
                return;

            MagicSword sword = plugin.api.getMagicSwords().getSword(citem.getNamespacedID());
            if (sword == null)
                return;

            if(Cooldowns.checkCooldowns(player.getPlayer())) {
                Cooldowns.setCooldowns(player.getPlayer(), sword.cooldown());
                sword.itemAbillity(player);
            }
        }
    }
}
