package me.sadev.rpg.object;

import me.sadev.rpg.object.magicSwords.MagicSword;

import java.util.HashMap;

public class MagicSwords {

    private HashMap<String, MagicSword> swords = new HashMap<>();

    public MagicSwords() {}

    public HashMap<String, MagicSword> getSwordMap() {
        return swords;
    }

    public MagicSword getSword(String identifier) {
        return swords.get(identifier);
    }

    public void addSword(MagicSword sword) {
        swords.put(sword.identifier(), sword);
    }
}
