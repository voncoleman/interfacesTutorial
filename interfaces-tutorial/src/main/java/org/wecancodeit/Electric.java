package org.wecancodeit;

public interface Electric {
    void shock();
    void chargedShock(int chargeLevel);
    
    default void electricDance(){
        System.out.println("The pet does an electric dance");
    }
}
