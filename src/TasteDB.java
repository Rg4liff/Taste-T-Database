import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TasteDB
{
    private Map<String,Ingredient> tasteDataBase = new HashMap<>();

    public void addTasteData(Ingredient anIng)
    {
        //System.out.print(anIng.getName() +"\n");
        this.tasteDataBase.put(anIng.getName(),anIng);
    }

    public Ingredient getIngInfo(String qIng)
    {
        Ingredient foundIng = new Ingredient();
        Ingredient queriedIng = new Ingredient();
        queriedIng.setName(qIng);

        if(tasteDataBase != null)
        {
            tasteDataBase.get(qIng);
            //System.out.print("Data found");
        }
        else
        {
            System.out.println("Database is empty");
        }
        return foundIng;
    }

    public Map<String, Ingredient> getTasteData()
    {
        return tasteDataBase;
    }
}
