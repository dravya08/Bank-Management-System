import javax.swing.*;


import java.util.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

class Transaction extends JFrame implements ActionListener
{
    Container c;
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;

    Transaction()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("TRANSACTION");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"TRANSACTION");

        l1 = new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("Arial", Font.BOLD,30));
        l1.setBounds(140,100,500,50);

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(80,230,250,40);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);

        b2 = new JButton("FAST CASH");
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(80,330,250,40);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);

        b3 = new JButton("PIN CHANGE");
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(80,430,250,40);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);  

        b4 = new JButton("CASH WITHDRAWL");
        b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setBounds(380,230,250,40);
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);

        b5 = new JButton("LAST TRANSACTIONS");
        b5.setFont(new Font("Arial", Font.BOLD, 14));
        b5.setBounds(380,330,250,40);
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);

        b6 = new JButton("BALANCE ENQUIRY");
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
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);





        setSize(750,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            new Deposit().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b2)
        {
            new FastCash().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b4)
        {
            new Withdrawl().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b5) //mini statement
        {
            String pinn = JOptionPane.showInputDialog("Enter PIN");
            conn c1 = new conn();


            if(pinn.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter pin");
            }
            else
            {
                try
                {
                    ResultSet rs = c1.s.executeQuery("Select deposit, withdraw from bank order by pin ='"+pinn+"' desc limit 1");
                    if(rs.next())
                    {
                        String deposit = rs.getString("deposit");
                        String withdraw = rs.getString("withdraw");
                        JOptionPane.showMessageDialog(null, "Your Transaction Details are \n Deposit: "+deposit+" \n Withdrawl: "+withdraw+". " );
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        else if(ae.getSource() == b3) //enquiry
        {
            new pin().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b6) 
        {
            String pinn = JOptionPane.showInputDialog("Enter PIN");
            conn c1 = new conn();


            if(pinn.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter pin");
            }
            else
            {
                try
                {
                    ResultSet rs = c1.s.executeQuery("SELECT balance FROM bank ORDER BY pin = '"+pinn+"' DESC LIMIT 1");
                    if(rs.next())
                    {
                        String balance = rs.getString("balance");
                        JOptionPane.showMessageDialog(null, "Your Account Balance is Rs:  " +balance);
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }

        }
        else if(ae.getSource() == b7)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Transaction().setVisible(true);
    }
}