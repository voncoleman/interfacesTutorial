package org.wecancodeit;

public abstract class Pokemon implements Healing{
    protected String name;
    protected String type;
    protected int health;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void heal();

    
}
