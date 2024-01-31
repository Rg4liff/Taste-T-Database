import java.util.HashMap;
import java.util.Map;

public class TasteTManager
{
    private TasteTBuilder Taste = new TasteTBuilder();
    private Map<String,Ingredient> tasteDataBase = new HashMap<>();
    public TasteTManager()
    {
        Taste.setupTasteT();
        tasteDataBase = Taste.getTasteData();
    }

    public void findIngredient(String ing)
    {
        Ingredient tempIng = new Ingredient();

        if (tasteDataBase.containsKey(ing))
        {
            tempIng = tasteDataBase.get(ing);
            outputIngredient(tempIng);
        }
        else {
            System.out.print("Database does not contain this ingredient");
        }

            /*for (Map.Entry<String, Ingredient> entry : tasteDataBase.entrySet()) {
            System.out.println("\nKey: " + entry.getKey());
            tempIng = entry.getValue();
            TreeSet<String> spiceIng = new TreeSet<String>(tempIng.getSpice());
            for(String spice : spiceIng)
            {
                System.out.print(spice + ", ");
            }
      }*/

        //return tempIng;
    }

    private void outputIngredient(Ingredient tI)
    {
        System.out.print("Name: " + tI.getName());

        System.out.print("\nSpice pairing:\n");
        for (String spice : tI.getSpice())
        {
            System.out.print(spice + ", ");
        }

        System.out.print("\nFruit pairing:\n");
        for (String fruit : tI.getFruit())
        {
            System.out.print(fruit + ", ");
        }

        System.out.print("\nVegetable pairing:\n");
        for (String veg : tI.getVeg())
        {
            System.out.print(veg + ", ");
        }

        System.out.print("\nLiquid pairing:\n");
        for (String liquid : tI.getLiquid())
        {
            System.out.print(liquid + ", ");
        }

        System.out.print("\nDairy pairing:\n");
        for (String dairy : tI.getDairy())
        {
            System.out.print(dairy + ", ");
        }

        System.out.print("\nDry Storage pairing:\n");
        for (String dry : tI.getDry())
        {
            System.out.print(dry + ", ");
        }

        System.out.print("\nHerb pairing:\n");
        for (String herb : tI.getHerb())
        {
            System.out.print(herb + ", ");
        }

        System.out.print("\nProtein pairing:\n");
        for (String meat : tI.getProtein())
        {
            System.out.print(meat + ", ");
        }

        System.out.print("\nMisc pairing:\n");
        for (String misc : tI.getMisc())
        {
            System.out.print(misc + ", ");
        }

    }
}
