package me.sadev.rpg;

import me.sadev.rpg.object.MagicSwords;

public class RPGAPI {

    public MagicSwords swords = new MagicSwords();

    public RPGAPI() {}

    /**
     * @return Retorna as funcoes das espadas magicas.
     */
    public MagicSwords getMagicSwords() {
        return swords;
    }
}
