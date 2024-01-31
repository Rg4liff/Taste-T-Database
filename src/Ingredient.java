import java.util.TreeSet;
public class Ingredient
{
    private String name;
    //Pairing lists
    private TreeSet<String> pairSpice = new TreeSet<>();
    private TreeSet<String> pairFruit = new TreeSet<>();
    private TreeSet<String> pairVeg = new TreeSet<>();
    private TreeSet<String> pairLiquid = new TreeSet<>();
    private TreeSet<String> pairDairy = new TreeSet<>();
    private TreeSet<String> pairDry = new TreeSet<>();
    private TreeSet<String> pairHerb = new TreeSet<>();
    private TreeSet<String> pairProtein = new TreeSet<>();
    private TreeSet<String> pairMisc = new TreeSet<>();

    //constructor
    public Ingredient()
    {
        this.name = null;
    }

    //set
    public void setName(String n)
    {
        this.name = n;
    }

    public void setSpice(TreeSet<String> pS)
    {
        this.pairSpice = pS;
    }

    public void setFruit(TreeSet<String> pF)
    {
        this.pairFruit = pF;
    }

    public void setVeg(TreeSet<String> pV)
    {
        this.pairVeg = pV;
    }
    public void setLiquid(TreeSet<String> pL)
    {
        this.pairLiquid = pL;
    }
    public void setDairy(TreeSet<String> pDa)
    {
        this.pairDairy = pDa;
    }
    public void setDry(TreeSet<String> pDr)
    {
        this.pairDry = pDr;
    }
    public void setHerb(TreeSet<String> pH)
    {
        this.pairHerb= pH;
    }
    public void setProtein(TreeSet<String> pP)
    {
        this.pairProtein = pP;
    }
    public void setMisc(TreeSet<String> pM)
    {
        this.pairMisc = pM;
    }

    //get methods

    public String getName()
    {
        return this.name;
    }

    public TreeSet<String> getSpice()
    {
        return this.pairSpice;
    }

    public TreeSet<String> getFruit()
    {
        return this.pairFruit;
    }

    public TreeSet<String> getVeg()
    {
        return this.pairVeg;
    }
    public TreeSet<String> getLiquid()
    {
        return this.pairLiquid;
    }
    public TreeSet<String> getDairy()
    {
        return this.pairDairy;
    }
    public TreeSet<String> getDry()
    {
        return this.pairDry;
    }
    public TreeSet<String> getHerb()
    {
        return this.pairHerb;
    }
    public TreeSet<String> getProtein()
    {
        return this.pairProtein;
    }
    public TreeSet<String> getMisc()
    {
        return this.pairMisc;
    }

    //getter methods

}
