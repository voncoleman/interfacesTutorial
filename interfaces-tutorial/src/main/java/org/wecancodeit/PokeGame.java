package org.wecancodeit;

public class PokeGame {
    public void run() {
        Pikachu pikachu = new Pikachu("Pikachu", "electric/flying");

        testElectricPets(pikachu);
    }

    //private void testElectricPets(Pikachu pikachu) {
    

    private void testElectricPets(Pikachu pikachu) {
    }

    private void testElectricPet(Electric pet) {
        pet.electricDance();
        pet.chargedShock(42);
        pet.electricDance();
    }



    private void testPets(Pokemon pokemon) {
        if (pokemon instanceof Electric) {
            ((Electric) pokemon).electricDance();
            
        }
    }
}
