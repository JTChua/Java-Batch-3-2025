package tasksheet131.task131;

public class Afritada implements Recipe {

  @Override
  public void showIngredients() {
    String[] Ingredients = { "Tomato Sauce", "Meat" };
    System.out.println("\nAfritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
  }

}
