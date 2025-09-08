package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        // a) Base + SpeedBoost + DamageBoost
        Character buffed = new DamageBoostDecorator(new SpeedBoostDecorator(base, 3), 15);
        System.out.println("--- Buffed (Speed+Damage) ---");
        buffed.move();
        buffed.attack();

        // b) Add GoldenAura (sprite change + buffs)
        Character shiny = new GoldenAuraDecorator(buffed);
        System.out.println("--- Buffed + GoldenAura ---");
        shiny.move();
        shiny.attack();

        // c) Remove GoldenAura by recomposing (rebuild chain without it)
        Character withoutAura = buffed; // removal by recomposition
        System.out.println("--- Buffed (no GoldenAura) ---");
        withoutAura.move();
        withoutAura.attack();
    }
}
