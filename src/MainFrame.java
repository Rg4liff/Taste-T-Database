import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener
{
    JPanel pMain = new JPanel();
    JPanel pTextnButt = new JPanel();
    JPanel pResults = new JPanel();
    JTextField tQuery = new JTextField("Enter ingredient here...");
    JButton bSearch = new JButton("Search");

    JLabel lSpice = new JLabel("Spices:");
    JLabel lFruit = new JLabel("Fruits:");

    JLabel lVeg = new JLabel("Vegetables:");

    JLabel lLiquid = new JLabel("Liquids:");

    JLabel lDairy = new JLabel("Dairy:");

    JLabel lDry = new JLabel("Dry Storage:");

    JLabel lHerb = new JLabel("Herbs:");

    JLabel lProtein = new JLabel("Proteins:");

    JLabel lMisc = new JLabel("Miscellaneous:");

    TasteTManager tManager = new TasteTManager();


    public MainFrame()
    {
        super();

        BorderLayout bL = new BorderLayout();
        pMain.setLayout(bL);

        this.setContentPane(pMain);
        pMain.add(pTextnButt);
        pMain.add(pResults);
        pTextnButt.setBackground(new Color(52, 46, 117));
        pResults.setBackground(new Color(132, 129, 163));

        pTextnButt.add(tQuery, BorderLayout.NORTH);
        pTextnButt.add(bSearch, BorderLayout.CENTER);

        pResults.add(lSpice);
        pResults.add(lHerb);
        pResults.add(lFruit);
        pResults.add(lVeg);
        pResults.add(lProtein);
        pResults.add(lDairy);
        pResults.add(lDry);
        pResults.add(lLiquid);
        pResults.add(lMisc);

        //sets up database

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        String qIng = "";
        Ingredient foundIng = new Ingredient();

        if(e.getSource() == bSearch)
        {
            qIng = tQuery.getText();
            foundIng = tManager.findIngredient(qIng);
            outputIngredient(foundIng);
        }
    }

    private void outputIngredient(Ingredient tI)
    {
        StringBuilder holder = new StringBuilder();

        for (String spice : tI.getSpice())
        {
           holder.append(spice).append(", ");

        }
        lSpice.setText("Spice: \n" + holder.toString());
        holder = new StringBuilder();

        for (String fruit : tI.getFruit())
        {
            holder.append(fruit).append(", ");
        }
        lFruit.setText("Fruits: \n" + holder.toString());
        holder = new StringBuilder();

        for (String veg : tI.getVeg())
        {
            holder.append(veg).append(", ");
        }
        lVeg.setText("Vegetables: \n" + holder.toString());
        holder = new StringBuilder();

        for (String liquid : tI.getLiquid())
        {
            holder.append(liquid).append(", ");
        }
        lLiquid.setText("Liquids: \n" + holder.toString());
        holder = new StringBuilder();

        for (String dairy : tI.getDairy())
        {
            holder.append(dairy).append(", ");
        }
        lDairy.setText("Dairy: \n" + holder.toString());
        holder = new StringBuilder();

        for (String dry : tI.getDry())
        {
            holder.append(dry).append(", ");
        }
        lDry.setText("Dry Storage: \n" + holder.toString());
        holder = new StringBuilder();

        for (String herb : tI.getHerb())
        {
            holder.append(herb).append(", ");
        }
        lHerb.setText("Herbs: \n" + holder.toString());
        holder = new StringBuilder();

        for (String meat : tI.getProtein())
        {
            holder.append(meat).append(", ");
        }
        lProtein.setText("Proteins: \n" + holder.toString());
        holder = new StringBuilder();

        for (String misc : tI.getMisc())
        {
            holder.append(misc).append(", ");
        }
        lMisc.setText("Miscellaneous: \n" + holder.toString());

    }
}
