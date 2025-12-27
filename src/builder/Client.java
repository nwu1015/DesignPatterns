package builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new VeganMealBuilder();

        Meal vegMeal = builder.getMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getPrice());

        builder = new NotVeganMealBuilder();

        Meal nonVegMeal = builder.getMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getPrice());
    }
}
