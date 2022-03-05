package me.sadev.rpg.object;

import me.sadev.rpg.object.magicSwords.MagicSword;

import java.util.HashMap;

public class MagicSwords {

    protected HashMap<String, MagicSword> swords;

    public MagicSwords() {
        swords = new HashMap<>();
    }

    /**
     * @return o hashmap das espadas, caso for nescessario.
     */
    public HashMap<String, MagicSword> getSwordMap() {
        return swords;
    }

    /**
     * @param identifier id custumizado da espada
     * @return a espada solicitada
     */
    public MagicSword getSword(String identifier) {
        return swords.get(identifier);
    }

    /**
     * @param sword Espada no qual vai ser adicionada no hashmap para uso futuro.
     */
    public void addSword(MagicSword sword) {
        swords.put(sword.identifier(), sword);
    }
}
