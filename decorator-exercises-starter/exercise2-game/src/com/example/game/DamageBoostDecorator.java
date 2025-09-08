package com.example.game;

public class DamageBoostDecorator extends CharacterDecorator {
    private int boost;

    public DamageBoostDecorator(Character character, int boost) {
        super(character);
        this.boost = boost;
    }

    @Override
    public int getDamage() {
        return character.getDamage() + boost;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }
}
