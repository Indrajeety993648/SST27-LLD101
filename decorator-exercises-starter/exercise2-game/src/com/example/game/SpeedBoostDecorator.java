package com.example.game;

public class SpeedBoostDecorator extends CharacterDecorator {
    private int boost;

    public SpeedBoostDecorator(Character character, int boost) {
        super(character);
        this.boost = boost;
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + boost;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getDamage() {
        return character.getDamage();
    }
}
