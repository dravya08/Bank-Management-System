import javax.swing.*;


import java.util.*;
import java.awt.event.*;
import java.awt.*;

class SignUp3 extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton b1,b2;
    JTextField t1;

    SignUp3()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        int y = fm.stringWidth(" ");
        int z = getWidth()/2 - (x/2);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM - PAGE 3");

        l1 = new JLabel("Form no:");
        l1.setFont(new Font("Arial", Font.BOLD, 13));
        l1.setBounds(610,5,60,20);

        t1 = new JTextField(14);
        t1.setBounds(670,6,50,20);

        l2 = new JLabel("Page 3: Additional Details");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setBounds(250,50,600,50);

        l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(100,150,200,20);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Arial", Font.BOLD, 13));
        r1.setBackground(Color.white);
        r1.setBounds(120,180,200,25);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Arial", Font.BOLD, 13));
        r2.setBackground(Color.white);
        r2.setBounds(120,215,200,25);

        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Arial", Font.BOLD, 13));
        r3.setBackground(Color.white);
        r3.setBounds(320,180,200,25);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Arial", Font.BOLD, 13));
        r4.setBackground(Color.white);
        r4.setBounds(320,215,200,25);

        l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(100,280,200,20);

        l5 = new JLabel("XXXX - XXXX - XXXX - 4321");
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(320,280,300,20);

        l6 = new JLabel("(Your 16 digit Card Number)");
        l6.setFont(new Font("Arial", Font.BOLD, 11));
        l6.setBounds(100,300,200,20);

        l7 = new JLabel("(It would appear on ATM Card and Bank Statements)");
        l7.setFont(new Font("Arial", Font.BOLD, 11));
        l7.setBounds(320,300,300,20);

        l8 = new JLabel("PIN:");
        l8.setFont(new Font("Arial", Font.BOLD, 18));
        l8.setBounds(100,340,200,20);

        l9 = new JLabel("(4 digit password)");
        l9.setFont(new Font("Arial", Font.BOLD, 11));
        l9.setBounds(100,360,200,20);

        l10 = new JLabel("XXXX");
        l10.setFont(new Font("Arial", Font.BOLD, 18));
        l10.setBounds(320,340,300,20);

        l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Arial", Font.BOLD, 18));
        l11.setBounds(100,410,200,20);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Arial", Font.BOLD, 15));
        c1.setBackground(Color.white);
        c1.setBounds(120,450,200,20);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Arial", Font.BOLD, 15));
        c2.setBackground(Color.white);
        c2.setBounds(320,450,200,20);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Arial", Font.BOLD, 15));
        c3.setBackground(Color.white);
        c3.setBounds(120,490,200,20);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Arial", Font.BOLD, 15));
        c4.setBackground(Color.white);
        c4.setBounds(320,490,200,20);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Arial", Font.BOLD, 15));
        c5.setBackground(Color.white);
        c5.setBounds(120,530,200,20);

        c6 = new JCheckBox("E-statement");
        c6.setFont(new Font("Arial", Font.BOLD, 15));
        c6.setBackground(Color.white);
        c6.setBounds(320,530,200,20);

        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setFont(new Font("Arial", Font.BOLD, 12));
        c7.setBackground(Color.white);
        c7.setBounds(120,600,600,20);

        b1 = new JButton("Submit");
        b1.setFont(new Font("Arial",Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,630,90,25);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Arial",Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350,630,90,25);




        c.add(l1);
        c.add(t1);
        c.add(l2);

        c.add(l3);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(r4);

        c.add(l4);
        c.add(l5);
        c.add(l6);
        c.add(l7);

        c.add(l8);
        c.add(l9);
        c.add(l10);

        c.add(l11);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);

        c.add(c7);
        c.add(b1);
        c.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);


        setSize(750,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent ae)
    {
        String a = null;
        if(r1.isSelected())
        {
            a = "Saving Account";
        }
        else if(r2.isSelected())
        {
            a = "Current Account";
        }
        else if(r3.isSelected())
        {
            a = "Fixed Deposit Account";
        }
        else if(r4.isSelected())
        {
            a = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        long first8 = Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3);

        String b = "";
        if(c1.isSelected())
        {
            b = b + " ATM Card";
        }
        if(c2.isSelected())
        {
            b = b + " Internet Banking";
        }
        if(c3.isSelected())
        {
            b = b + " Mobile Banking";
        }
        if(c4.isSelected())
        {
            b = b + " Email Alerts";
        }
        if(c5.isSelected())
        {
            b  = b + " Cheque Book";
        }
        if(c6.isSelected())
        {
            b = b + " E-Statement";
        }

        String c = t1.getText();

        try 
        {
            if(ae.getSource() == b1)
            {
                if(b.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
                else
                {
                    conn c1 = new conn();
                    String q1 = "insert into signup3 values('"+c+"','"+a+"','"+first8+"','"+first4+"','"+b+"')";
                    String q2 = "insert into login values('"+first8+"','"+first4+"')";
                    String q3 = "insert into bank values('"+first4+"',0,0,0)";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);
                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n PIN: " + first4);

                    new Deposit().setVisible(true);
                    setVisible(false);

                }
            }
            else if(ae.getSource() == b2)
            {
                System.exit(0);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }


    }


    public static void main(String[] args) {
        new SignUp3().setVisible(true);
    }

}