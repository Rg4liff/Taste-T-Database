import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener
{
    JPanel pMain = new JPanel();
    JPanel pTextnButt = new JPanel();
    JPanel pResults = new JPanel();

    JTextField tQuery = new JTextField( 30 );
    JButton bSearch = new JButton("Search");

    //9 labels for each flavor type
    JTextArea tSpice = new JTextArea("Spices:");
    JTextArea tFruit = new JTextArea("Fruits:");
    JTextArea tVeg = new JTextArea("Vegetables:");
    JTextArea tLiquid = new JTextArea("Liquids:");
    JTextArea tDairy = new JTextArea("Dairy:");
    JTextArea tDry = new JTextArea("Dry Storage:");
    JTextArea tHerb = new JTextArea("Herbs:");
    JTextArea tProtein = new JTextArea("Proteins:");
    JTextArea tMisc = new JTextArea("Miscellaneous:");

    JPanel pSpice = new JPanel();

    TasteTManager tManager = new TasteTManager();


    public MainFrame()
    {
        super();
        this.setContentPane(pMain);
        //pMain.setSize(1800, 430);

        pMain.setLayout(new BorderLayout());
        pMain.add(pTextnButt, BorderLayout.NORTH);
        pMain.add(pResults, BorderLayout.CENTER);

        pTextnButt.setBackground(new Color(52, 46, 117));
        pTextnButt.add(tQuery);
        pTextnButt.add(bSearch);

        pResults.setLayout(new GridLayout(1, 9));
        pSpice.setBackground(new Color(132, 129, 163));
        pResults.add(pSpice);

        bSearch.addActionListener(this);
        tQuery.addActionListener(this);
        tQuery.setEditable(true);

        tSpice.setMaximumSize(new Dimension(200,Integer.MAX_VALUE));
        tSpice.setLineWrap(true);
        tSpice.setOpaque(false);
        pSpice.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(141, 124, 163), new Color(71, 50, 97)));

        pSpice.add(tSpice);
        pResults.add(tHerb);
        pResults.add(tFruit);
        pResults.add(tVeg);
        pResults.add(tProtein);
        pResults.add(tDairy);
        pResults.add(tDry);
        pResults.add(tLiquid);
        pResults.add(tMisc);

        //sets up database

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        String qIng = "";
        Ingredient foundIng = new Ingredient();

        if(e.getSource() == bSearch || e.getSource() == tQuery)
        {
            System.out.print("Poop");
            qIng = tQuery.getText();
            if (qIng == null || qIng.isEmpty())
            {
                //new window should pop up stating text field is empty
                JOptionPane.showMessageDialog(null,"Error:Text Field is empty");

            }
            else
            {
                foundIng = tManager.findIngredient(qIng);
            }
            if(foundIng == null)
            {
                //new window should pop up alerting not found in database
                JOptionPane.showMessageDialog(null,"Item not in database");
            }
            else
            {
                System.out.print(foundIng.getName());
                outputIngredient(foundIng);
            }
        }
    }

    private void outputIngredient(Ingredient tI)
    {
        StringBuilder holder = new StringBuilder();

        for (String spice : tI.getSpice())
        {
           holder.append(spice).append("\n");

        }
        tSpice.setText("Spice: \n" + holder.toString());
        holder = new StringBuilder();

        for (String fruit : tI.getFruit())
        {
            holder.append(fruit).append("\n");
        }
        tFruit.setText("Fruits: \n" + holder.toString());
        holder = new StringBuilder();

        for (String veg : tI.getVeg())
        {
            holder.append(veg).append("\n");
        }
        tVeg.setText("Vegetables: \n" + holder.toString());
        holder = new StringBuilder();

        for (String liquid : tI.getLiquid())
        {
            holder.append(liquid).append("\n");
        }
        tLiquid.setText("Liquids: \n" + holder.toString());
        holder = new StringBuilder();

        for (String dairy : tI.getDairy())
        {
            holder.append(dairy).append("\n");
        }
        tDairy.setText("Dairy: \n" + holder.toString());
        holder = new StringBuilder();

        for (String dry : tI.getDry())
        {
            holder.append(dry).append("\n");
        }
        tDry.setText("Dry Storage: \n" + holder.toString());
        holder = new StringBuilder();

        for (String herb : tI.getHerb())
        {
            holder.append(herb).append("\n");
        }
        tHerb.setText("Herbs: \n" + holder.toString());
        holder = new StringBuilder();

        for (String meat : tI.getProtein())
        {
            holder.append(meat).append("\n");
        }
        tProtein.setText("Proteins:\n" + holder.toString());
        holder = new StringBuilder();

        for (String misc : tI.getMisc())
        {
            holder.append(misc).append("\n");
        }
        tMisc.setText("Miscellaneous:\n" + holder.toString());

    }
}
