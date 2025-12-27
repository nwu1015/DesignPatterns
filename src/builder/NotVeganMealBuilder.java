package builder;

public class NotVeganMealBuilder implements Builder {
    @Override
    public Meal getMeal() {
        Meal meal = new Meal();

        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
