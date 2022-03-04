package me.sadev.rpg.enums;

public enum Rarity {

    LENDARIO("Lendario", "§6"),
    RARO("Raro", "§1"),
    COMUM("Comum", "§7");

    private final String tag;
    private final String color;

    Rarity(String tag, String color) {
        this.tag = tag;
        this.color = color;
    }

    public String getTag() {
        return tag;
    }

    public String getColor() {
        return color;
    }
}
