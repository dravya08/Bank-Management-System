import javax.swing.*;


import java.util.*;
import java.awt.event.*;
import java.awt.*;

class SignUp2 extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;
    JRadioButton r1,r2,r3,r4;
    JButton b1;

    SignUp2() 
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM - PAGE 2");





        l1 = new JLabel("Form no:");
        l1.setFont(new Font("Arial", Font.BOLD, 13));
        l1.setBounds(610,5,60,20);

        t1 = new JTextField(14);
        t1.setBounds(670,6,50,20);

        l2 = new JLabel("Page 2: Additional Details");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setBounds(250,50,600,50);

        l3 = new JLabel("Religion:");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(100,150,100,20);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.white);
        c1.setBounds(320,150,300,24);

        l4 = new JLabel("Category:");
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(100,200,100,20);

        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.white);
        c2.setBounds(320,200,300,24);

        l5 = new JLabel("Income:");
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(100,250,100,20);

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.white);
        c3.setBounds(320,250,300,24);

        l6 = new JLabel("Educational");
        l6.setFont(new Font("Arial", Font.BOLD, 18));
        l6.setBounds(100,300,200,20);

        l7 = new JLabel("Qualtification:");
        l7.setFont(new Font("Arial", Font.BOLD, 18));
        l7.setBounds(100,320,200,20);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setBounds(320,300,300,24);

        l8 = new JLabel("Occupation:");
        l8.setFont(new Font("Arial", Font.BOLD, 18));
        l8.setBounds(100,370,200,20);

        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setBounds(320,370,300,24);

        l9 = new JLabel("PAN Number:");
        l9.setFont(new Font("Arial", Font.BOLD, 18));
        l9.setBounds(100,420,200,20);

        t2 = new JTextField(26);
        t2.setBounds(320,420,300,24);

        l10 = new JLabel("Aadhar Number:");
        l10.setFont(new Font("Arial", Font.BOLD, 18));
        l10.setBounds(100,470,200,20);

        t3 = new JTextField(26);
        t3.setBounds(320,470,300,24);

        l11 = new JLabel("Senior Citizen");
        l11.setFont(new Font("Arial", Font.BOLD, 18));
        l11.setBounds(100,520,200,20);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Arial", Font.BOLD, 12));
        r1.setBackground(Color.white);
        r1.setBounds(320,520,60,25);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Arial", Font.BOLD, 12));
        r2.setBackground(Color.white);
        r2.setBounds(420,520,60,25);

        l12 = new JLabel("Existing account");
        l12.setFont(new Font("Arial", Font.BOLD, 18));
        l12.setBounds(100,570,200,20);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Arial", Font.BOLD, 12));
        r3.setBackground(Color.white);
        r3.setBounds(320,570,60,25);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Arial", Font.BOLD, 12));
        r4.setBackground(Color.white);
        r4.setBounds(420,570,60,25);


        b1 = new JButton("Next");
        b1.setFont(new Font("Arial",Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(525,640,70,20);


        c.add(l1);
        c.add(t1);
        c.add(l2);

        c.add(l3);
        c.add(c1);

        c.add(l4);
        c.add(c2);

        c.add(l5);
        c.add(c3);

        c.add(l6);
        c.add(l7);
        c.add(c4);

        c.add(l8);
        c.add(c5);

        c.add(l9);
        c.add(t2);

        c.add(l10);
        c.add(t3);

        c.add(l11);
        c.add(r1);
        c.add(r2);

        c.add(l12);
        c.add(r3);
        c.add(r4);

        c.add(b1);

        b1.addActionListener(this);

        setSize(750,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String a = (String) c1.getSelectedItem();
        String b = (String) c2.getSelectedItem();
        String c = (String) c3.getSelectedItem();
        String d = (String) c4.getSelectedItem();
        String e = (String) c5.getSelectedItem();

        String f = t2.getText();
        String g = t3.getText();

        String h = null;
        if(r1.isSelected())
        {
            h = "Yes";
        }
        else if(r2.isSelected())
        {
            h = "No";
        }

        String i = null;
        if(r3.isSelected())
        {
            i = "Yes";
        }
        else if(r4.isSelected())
        {
            i = "No";
        }

        String j = t1.getText();

        try
        {
            if(t2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else
            {

                conn c1 = new conn();
                String q1 = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                c1.s.executeUpdate(q1);

                new SignUp3().setVisible(true);
                setVisible(false);

            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new SignUp2().setVisible(true);
    }
}