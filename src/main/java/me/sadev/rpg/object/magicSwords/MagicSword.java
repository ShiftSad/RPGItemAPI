package me.sadev.rpg.object.magicSwords;

import me.sadev.rpg.enums.Rarity;
import org.bukkit.entity.Player;

public abstract class MagicSword {

    /**
     * @param player Jogador usado como base para executar a habilidade.
     * @return Retorna TRUE caso a habilidade tenha sido executada com sucesso,
     * e FALSE caso algo tenha dado errado
     */
    public abstract boolean itemAbillity(Player player);

    /**
     * @return Retorna o dano base da habilidade, ele pode ser diferente devido a buffs ou armaduras
     */
    public abstract double itemAbillityDamage();

    /**
     * @return Nome da habilidade do item
     */
    public abstract String itemAbillityName();

    /**
     * @return Retorna o enum de raridade do item
     */
    public abstract Rarity itemRarity();

    /**
     * @return Retorna o tempo entre cada uso da habilidade
     */
    public abstract int cooldown();

    /**
     * @return Retorna o dano causado pelo item em ataques fisicos.
     */
    public abstract double itemDamage();

    /**
     * @return Retorna o custo de mana para usar uma habilidade
     */
    public abstract double manaCost();

    /**
     * @return Retorna o id custumizado do item, do plugin Itemsadder
     */
    public abstract String identifier();
}
