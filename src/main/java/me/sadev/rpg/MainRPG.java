package me.sadev.rpg;

import me.sadev.rpg.object.magicSwords.AspectOfTheEnd;
import org.bukkit.plugin.java.JavaPlugin;

public final class MainRPG extends JavaPlugin {

    public RPGAPI api = new RPGAPI();
    private final AspectOfTheEnd aote = new AspectOfTheEnd();

    @Override
    public void onEnable() {
        api.getMagicSwords().addSword(aote);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
