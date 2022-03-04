package me.sadev.rpg.listeners;

import dev.lone.itemsadder.api.CustomStack;
import me.sadev.rpg.MainRPG;
import me.sadev.rpg.object.magicSwords.MagicSword;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public record WeaponUseEvent(MainRPG plugin) implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();

        if (action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) {
            MagicSword sword = plugin.api.getMagicSwords().getSword(CustomStack.byItemStack
                    (player.getItemInUse()).getNamespacedID());
            if (sword != null)
                sword.itemAbillity(player);
        }
    }
}
