package builder;

public class MealBuilder {

    public Meal getVeganMeal(){
        Meal meal = new Meal();

        meal.addItem(new VegBurger());
        meal.addItem(new Cola());

        return meal;
    }

    public Meal getNotVeganMeal(){
        Meal meal = new Meal();

        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
