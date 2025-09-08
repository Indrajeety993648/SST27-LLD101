package com.example.game;

public abstract class CharacterDecorator implements Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        character.attack();
    }

    @Override
    public String getSprite() {
        return character.getSprite();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed();
    }

    @Override
    public void move() {
        character.move();
    }
}