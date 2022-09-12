public class Main {

    public static void main(String[] args)
    {
        Cooking cooking0 = new Cooking();
        Cooking cooking1 = new Cooking(cooking0.getIngredientsType("PARMcheese"), true, 2100f);

        System.out.println(cooking0.toString());
        System.out.println(cooking1.toString());

        //Cooking cookingErr0 = new Cooking(cooking0.getIngredientsType("pizzacrust"), true, 1800);
        //Cooking cookingErr1 = new Cooking(cooking0.getIngredientsType("rwine"), false, 0);
    }

}
