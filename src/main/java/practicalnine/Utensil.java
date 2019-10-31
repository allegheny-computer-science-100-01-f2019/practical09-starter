package practicalnine;

/**
* This program describes a utensil.
* Objects in the Utensil class have a type, a cost, and a color.
* Methods are provided for retrieving each of these values
* and for setting all but the type to new values.
* We aren't allowed to change the Utensil's type.
*/
public class Utensil {
  // INSTANCE VARIABLES:
  private String type;   // the type of utensil
  private double cost;   // cost of this utensil, in dollars
  private String color;  // the color of this utensil

  /** CONSTRUCTOR:
  * Construct a new Utensil of type utensilType;
  * set other instance variables to default values.
  */
  public Utensil(String utensilType) {
    type = utensilType;  // store the type in an instance variable
    cost = -1;    // cost is not known
    color = null; // color is not known
  }

  // METHODS:

  /** Set the cost of this utensil to utensilCost.
  */
  public void setCost(double utensilCost) {
    cost = utensilCost;
  }

  /** Return the cost of this utensil.
  */
  public double getCost() {
    return cost;
  }

  /** Set the color of this utensil to utensilColor.
  */
  public void setColor(String utensilColor) {
    color = utensilColor;
  }

  /** Return the color of this utensil.
  */
  public String getColor() {
    return color;
  }

  /** Return a string describing this Utensil.
  */
  public String toString() {
    return color + " " + type;
  }
}
