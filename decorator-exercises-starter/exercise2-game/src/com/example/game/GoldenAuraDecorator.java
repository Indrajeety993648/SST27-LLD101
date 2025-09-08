package com.example.game;

public class GoldenAuraDecorator extends CharacterDecorator {
    public GoldenAuraDecorator(Character character) {
        super(character);
    }

    @Override
    public String getSprite() {
        return "golden_aura.png";
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + 2; // small buff
    }

    @Override
    public int getDamage() {
        return character.getDamage() + 3; // small buff
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura] Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura] Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }
}
