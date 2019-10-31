package practicalnine;

import java.util.Date;

/**
* This program describes an octopus in the kitchen.
*/
public class Practical9 {

  /**
  * Main method eith new object declarations and method calls.
  */
  public static void main(String[] args) {
    System.out.println("Janyl Jumadinova\n" + new Date() + "\n");

    Utensil spat = new Utensil("spatula"); // create a spatula
    spat.setColor("green");        // set spatula properties--color...
    spat.setCost(10.59);           // ... and price

	// TODO: modify ocky's creation
    Octopus ocky = new Octopus("Ocky");    // create and name the octopus
    ocky.setAge(10);               // set the octopus's age...
    ocky.setWeight(100);           // ... weight,...
    ocky.setUtensil(spat);         // ... and favorite utensil.

    System.out.println("Testing 'get' methods:");
    System.out.println(ocky.getName() + " weighs " + ocky.getWeight()
            + " pounds\n" + "and is " + ocky.getAge()
            + " years old. His favorite utensil is a "
            + ocky.getUtensil());

    System.out.println(ocky.getName() + "'s " + ocky.getUtensil() + " costs $"
            + ocky.getUtensil().getCost());
    System.out.println("Utensil's color: " + spat.getColor());

    // Use methods to change some values:

    ocky.setAge(20);
    ocky.setWeight(125);
    spat.setCost(15.99);
    spat.setColor("blue");

    System.out.println("\nTesting 'set' methods:");
    System.out.println(ocky.getName() + "'s new age: " + ocky.getAge());
    System.out.println(ocky.getName() + "'s new weight: " + ocky.getWeight());
    System.out.println("Utensil's new cost: $" + spat.getCost());
    System.out.println("Utensil's new color: " + spat.getColor());
    
    // TODO: Create another Octopus object
    
    // TODO: Create another utensil
    
    // TODO: Print information about the new octopus
  }
}
