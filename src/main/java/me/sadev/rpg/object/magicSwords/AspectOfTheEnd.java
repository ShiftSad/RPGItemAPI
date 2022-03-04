package me.sadev.rpg.object.magicSwords;

import me.sadev.rpg.enums.Rarity;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class AspectOfTheEnd extends MagicSword {

    @Override
    public boolean itemAbillity(Player player) {
        Block b = player.getTargetBlock(null, 8);
        player.teleport(new Location(b.getWorld(), b.getX(), b.getY(), b.getZ(), player.getLocation().getYaw(), player.getLocation().getPitch()));
        player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);

        return true;
    }

    @Override
    public double itemAbillityDamage() {
        return 0;
    }

    @Override
    public String itemAbillityName() {
        return "Instant Transmition";
    }

    @Override
    public Rarity itemRarity() {
        return Rarity.RARO;
    }

    @Override
    public int cooldown() {
        return 10;
    }

    @Override
    public double itemDamage() {
        return 8;
    }

    @Override
    public double manaCost() {
        return 50;
    }

    @Override
    public String identifier() {
        return "rpg:aspect_of_the_end";
    }
}
