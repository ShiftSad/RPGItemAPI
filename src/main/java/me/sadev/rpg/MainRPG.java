package me.sadev.rpg;

import me.sadev.rpg.listeners.WeaponUseEvent;
import me.sadev.rpg.object.magicSwords.AspectOfTheEnd;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class MainRPG extends JavaPlugin {

    public RPGAPI api = new RPGAPI();
    private final AspectOfTheEnd aote = new AspectOfTheEnd();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WeaponUseEvent(this), this);

        api.getMagicSwords().addSword(aote);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
