package org.wecancodeit;

//We        extend the class   we implement    interfaces
public class Pikachu extends Pokemon implements Electric, Flying {

    public Pikachu(String name, String type) {
        super(name, type);
    }

    @Override
    public void shock() {
        System.out.println("The pet generates an electric shock");
    }

    @Override
    public void chargedShock(int chargeLevel) {
        System.out.printf("The pet generates a level %d shock%n", chargeLevel);
    }

    @Override
    public void fly() {
        System.out.println("The pet is flying!");
    }

    @Override
    public void heal() {
       System.out.println("The pet is healing!");
    }

}
