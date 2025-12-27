package builder;

public class VeganMealBuilder implements Builder {
    @Override
    public Meal getMeal() {
        Meal meal = new Meal();

        meal.addItem(new VegBurger());
        meal.addItem(new Cola());

        return meal;
    }
}
