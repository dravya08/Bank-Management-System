import javax.swing.*;


import java.util.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

class FastCash extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextField t1;

    FastCash()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("FAST CASH");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (4*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"FAST CASH");

        l1 = new JLabel("Enter pin:");
        l1.setFont(new Font("Arial", Font.BOLD, 13));
        l1.setBounds(605,5,60,20);

        t1 = new JTextField(14);
        t1.setBounds(670,6,50,22);

        l2 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l2.setFont(new Font("Arial", Font.BOLD,30));
        l2.setBounds(140,100,500,50);

        b1 = new JButton("Rs. 100");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(80,230,250,40);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);

        b2 = new JButton("Rs. 1000");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(80,330,250,40);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);

        b3 = new JButton("Rs. 5000");
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(80,430,250,40);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);  

        b4 = new JButton("Rs. 500");
        b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setBounds(380,230,250,40);
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);

        b5 = new JButton("Rs. 2000");
        b5.setFont(new Font("Arial", Font.BOLD, 14));
        b5.setBounds(380,330,250,40);
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);

        b6 = new JButton("Rs. 10000");
        b6.setFont(new Font("Arial", Font.BOLD, 14));
        b6.setBounds(380,430,250,40);
        b6.setForeground(Color.white);
        b6.setBackground(Color.black);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("Arial", Font.BOLD, 14));
        b7.setBounds(220,530,250,40);
        b7.setForeground(Color.white);
        b7.setBackground(Color.black);


        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);

        b1.addActionListener(this); //100
        b2.addActionListener(this); //1000
        b3.addActionListener(this); //5000
        b4.addActionListener(this); //500
        b5.addActionListener(this); //2000
        b6.addActionListener(this); //10000
        b7.addActionListener(this); //exit
        


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
            double balance = 0;
            if(ae.getSource() == b7)
            {
                System.exit(0);
            }

            if(a.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter PIN");
            }
            else
            {
                if(ae.getSource() == b1)
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"' ");

                    if(rs.next())
                    {
                        String pin  = rs.getString("pin");

                        balance = rs.getDouble("balance");
                        double d = 100;
                        if(d <= balance)
                        {
                        balance -= 100;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";
                        
                        c1.s.executeUpdate(q1);

                        JOptionPane.showMessageDialog(null, "Rs. "+100+" Debited Successfully ");

                        new Transaction().setVisible(true);
                        setVisible(false);
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null, "Insufficent amount in the account");
                        }
                    }

                }

                else if(ae.getSource() == b2)
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"' ");

                    if(rs.next())
                    {
                        String pin  = rs.getString("pin");

                        balance = rs.getDouble("balance");
                        double d = 1000;
                        if(d <= balance)
                        {
                        balance -= 1000;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";
                        
                        c1.s.executeUpdate(q1);

                        JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully ");

                        new Transaction().setVisible(true);
                        setVisible(false);
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null, "Insufficent amount in the account");
                        }
                    }

                }

                else if(ae.getSource() == b3)
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"' ");

                    if(rs.next())
                    {
                        String pin  = rs.getString("pin");

                        balance = rs.getDouble("balance");
                        double d = 5000;
                        if(d <= balance)
                        {
                        balance -= 5000;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";
                        
                        c1.s.executeUpdate(q1);

                        JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully ");

                        new Transaction().setVisible(true);
                        setVisible(false);
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null, "Insufficent amount in the account");
                        }
                    }

                }

                else if(ae.getSource() == b4)
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"' ");

                    if(rs.next())
                    {
                        String pin  = rs.getString("pin");

                        balance = rs.getDouble("balance");
                        double d = 500;
                        if(d <= balance)
                        {
                        balance -= 500;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";
                        
                        c1.s.executeUpdate(q1);

                        JOptionPane.showMessageDialog(null, "Rs. "+500+" Debited Successfully ");

                        new Transaction().setVisible(true);
                        setVisible(false);
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null, "Insufficent amount in the account");
                        }
                    }

                }

                else if(ae.getSource() == b5)
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"' ");

                    if(rs.next())
                    {
                        String pin  = rs.getString("pin");

                        balance = rs.getDouble("balance");
                        double d = 2000;
                        if(d <= balance)
                        {
                        balance -= 2000;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";
                        
                        c1.s.executeUpdate(q1);

                        JOptionPane.showMessageDialog(null, "Rs. "+2000+" Debited Successfully ");

                        new Transaction().setVisible(true);
                        setVisible(false);
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null, "Insufficent amount in the account");
                        }
                    }

                }

                else if(ae.getSource() == b6)
                {
                    conn c1 = new conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+a+"' ");

                    if(rs.next())
                    {
                        String pin  = rs.getString("pin");

                        balance = rs.getDouble("balance");
                        double d = 10000;
                        if(d <= balance)
                        {
                        balance -= 10000;
                        String q1 = "update bank set withdraw = '"+d+"' , balance = '"+balance+"' where pin = '"+a+"'  ";
                        
                        c1.s.executeUpdate(q1);

                        JOptionPane.showMessageDialog(null, "Rs. "+10000+" Debited Successfully ");

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
               
            
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Error:" +ex);
        }
    }

    public static void main(String[] args) {
        new FastCash().setVisible(true);
    }
}