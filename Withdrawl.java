import javax.swing.*;

import java.sql.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

class Withdrawl extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3;

    Withdrawl()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("WITHDRAWL");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (4*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"WITHDRAWL");

        l1 = new JLabel("Enter pin:");
        l1.setFont(new Font("Arial", Font.BOLD, 13));
        l1.setBounds(605,5,60,20);

        t1 = new JTextField(14);
        t1.setBounds(670,6,50,22);

        l2 = new JLabel("MAXIMUM DAILY WITHDRAWL");
        l2.setFont(new Font("Arial", Font.BOLD, 34));
        l2.setBounds(120,100,600,50);
         
        l3 = new JLabel("IS RS. 10,000");
        l3.setFont(new Font("Arial", Font.BOLD, 34));
        l3.setBounds(260,150,600,50);

        l4 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l4.setFont(new Font("Arial", Font.BOLD, 30));
        l4.setBounds(135,250,600,50);

        t2 = new JTextField(30);
        t2.setBounds(220,340,320,40);

        b1 = new JButton("WITHDRAWAL");
        b1.setFont(new Font("Arial",Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(240,410,130,40);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Arial",Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(380,410,120,40);

        b3 = new JButton("EXIT");
        b3.setFont(new Font("Arial",Font.BOLD, 15));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(250,500,220,40);



        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(l3);
        c.add(l4);

        c.add(t2);

        c.add(b1);
        c.add(b2);
        c.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        setSize(750,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {

            String a = t1.getText();
            String b = t2.getText();

            if(ae.getSource() == b1)
            {
                if(a.isEmpty() && b.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Your PIN and Amount to Withdraw");
                }

                else if(a.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter your pin");
                }
                else if(b.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdraw");

                }
                else
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"'");

                    double balance = 0;
                    if(rs.next())
                    {
                        String pin = rs.getString("pin");

                        balance = rs.getDouble("balance");

                        double d = Double.parseDouble(b);
                        if(d <= balance)
                        {
                        balance-= d;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";

                        c1.s.executeUpdate(q1);
                        JOptionPane.showMessageDialog(null, "Rs. "+b+" Debited Successfully ");

                        new Transaction().setVisible(true);
                        setVisible(false);

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Insufficent amount in the account");
                        }

                    }

                }

            }
            else if(ae.getSource() == b2)
            {
                new Transaction().setVisible(true);
                setVisible(false);
            }
            else if(ae.getSource() == b3)
            {
                System.exit(0);
            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("error: "  +ex);
        }

    }
    

    public static void main(String[] args) {
        new Withdrawl().setVisible(true);
    }
}