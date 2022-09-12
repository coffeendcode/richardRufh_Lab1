
public class Cooking {

    private enum GnocchiIngredients
    {
        BEEFBROTH, GNOCCHI, CARAMELIZEDONIONS,
        RWINE, THYME, CHICKEN, PARMCHEESE
    }

    private GnocchiIngredients ingredients;
    private boolean done;
    private float timer;

    public Cooking()
    {
        setIngredients(GnocchiIngredients.BEEFBROTH);
        setDone(false);
        setTimer(1800);
    }

    public Cooking(GnocchiIngredients ingredient, boolean done, float timer)
    {
        setIngredients(ingredient);
        setDone(done);
        setTimer(timer);
    }

    public void setIngredients(GnocchiIngredients ingredient)
    {
        switch (ingredient) {
            case BEEFBROTH, GNOCCHI, CARAMELIZEDONIONS, RWINE, THYME, CHICKEN, PARMCHEESE -> ingredients = ingredient;
            default -> System.out.println("You have entered an incompatible enum for ingredients, please check documentation");
        }
    }

    public GnocchiIngredients getIngredients()
    {
        return this.ingredients;
    }

    public GnocchiIngredients getIngredientsType(String ingredient)
    {
        return switch (ingredient.toLowerCase()) {
            case "beefbroth" -> GnocchiIngredients.BEEFBROTH;
            case "gnocchi" -> GnocchiIngredients.GNOCCHI;
            case "caramelizedonions" -> GnocchiIngredients.CARAMELIZEDONIONS;
            case "rwine" -> GnocchiIngredients.RWINE;
            case "thyme" -> GnocchiIngredients.THYME;
            case "chicken" -> GnocchiIngredients.CHICKEN;
            case "parmcheese" -> GnocchiIngredients.PARMCHEESE;
            default -> throw new IllegalArgumentException("You have entered an incompatible enum type, refer to documentation for types");
        };
    }

    public void setDone(boolean done)
    {
        this.done = done;
    }

    public boolean getDone()
    {
        return this.done;
    }


    public void setTimer(float time)
    {
        if (time >= 1800 && time <= 2100)
        {
            this.timer = time;
        }
        else
            throw new IllegalArgumentException("You must enter in seconds between 30 - 35 minutes");
    }

    public float getTimer()
    {
        return this.timer;
    }

    @Override
    public String toString() {
        return "--Cooking--" +
                "\nIngredients = " + ingredients.toString().substring(0,1).toUpperCase() +
                ingredients.toString().substring(1, ingredients.toString().length()).toLowerCase() +
                "\nDone = " + done +
                "\nTimer = " + timer;
    }
}
