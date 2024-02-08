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
        System.out.print("Database set up...");
    }

    public Ingredient findIngredient(String ing)
    {
        Ingredient tempIng = null;
        System.out.print("Finding ingredient " + ing);
        ing = FormatQuery(ing);

        if (tasteDataBase.containsKey(ing))
        {
            tempIng = tasteDataBase.get(ing);
            System.out.print("Ingredient searched:" + tempIng);
            return tempIng;
            //outputIngredient(tempIng);
        }
        else {
            return tempIng;
            //System.out.print("Database does not contain this ingredient");
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

    private String FormatQuery(String q)
    {
        q = q.toLowerCase();
        q = Character.toUpperCase(q.charAt(0)) + q.substring(1);
        return q;
    }

}
