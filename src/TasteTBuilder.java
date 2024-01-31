import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TasteTBuilder extends TasteDB
{

    private Ingredient test = new Ingredient();


    /*
     * Create list of ingredients use main to hold list and use builder to access and build?
     *
     * read in file
     * turn each section into treeset
     * -use tokenizer to create tokens from doc
     * set with ingredient setter
     *
     */

    public void setupTasteT()
    {
        try {
            File csvFile = new File("src\\TasteTDB.csv");
            Scanner scanner = new Scanner(csvFile);
            String in = "", firstDelim = ",", token;
            int numTokens = 0;

            while (scanner.hasNextLine()) {
                in = scanner.nextLine();
                StringTokenizer stk = new StringTokenizer(in, firstDelim);

                numTokens = stk.countTokens();
                test = new Ingredient();

                //System.out.println(numTokens + "\n");
                //for each row in CSV
                for (int iToken = 0; iToken < numTokens; iToken++) {
                    token = stk.nextToken();
                    token = token.trim();
                    //System.out.print(token + "\n");
                        //System.out.println("hello");
                        //System.out.println(token);
                    setTreeSets(iToken, token);
                }
                //add to new tree set database of ingredients
                addTasteData(test);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        }


        finally
        {

        }

    }

    //sets each section to correct tree set
    private void setTreeSets(int index, String tToken)
    {

        //System.out.println(tToken);

        TreeSet<String> tempTS = new TreeSet<>();
        switch(index)
        {

            case 0:
            {
                test.setName(tToken);
                break;
            }
            case 1:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setSpice(tempTS);
                break;
            }
            case 2:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setFruit(tempTS);
                break;
            }
            case 3:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setVeg(tempTS);
                break;
            }
            case 4:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setLiquid(tempTS);
                break;
            }
            case 5:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setDairy(tempTS);
                break;
            }
            case 6:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setDry(tempTS);
                break;
            }
            case 7:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setHerb(tempTS);
                break;
            }
            case 8:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setProtein(tempTS);
                break;
            }
            case 9:
            {
                //set new tokenizer and break up each section and add to
                tempTS = BreakTokens(tToken);
                test.setMisc(tempTS);
                break;
            }
            default:
            {
                System.out.println("Too many columns...");
            }
        }
    }

    //Breaks up tokens and creates the tree set of paired flavors
    private TreeSet<String> BreakTokens(String currTok)
    {
        String secDelim = ":", aFlavor;
        TreeSet<String> currTreeSet = new TreeSet<String>();
        StringTokenizer flavors = new StringTokenizer(currTok, secDelim);
        int numFlavors = flavors.countTokens();

        //break up the token into new tree set using for loop
        for(int iFlav = 0; iFlav  < numFlavors; iFlav++)
        {
            aFlavor = flavors.nextToken();
            currTreeSet.add(aFlavor);
        }
        return currTreeSet;
    }

}
