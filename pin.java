import javax.swing.*;


import java.sql.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;


public class pin extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4;
    JPasswordField p1,p2,p3;
    JButton b1,b2;

    pin()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("PIN CHANGE");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (4*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"PIN CHANGE");

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("Arial", Font.BOLD, 32));
        l1.setBounds(200,120,600,50);

        l2 = new JLabel("Current PIN: ");
        l2.setFont(new Font("Arial", Font.BOLD, 22));
        l2.setBounds(100,220,200,50);

        l3 = new JLabel("New PIN: ");
        l3.setFont(new Font("Arial", Font.BOLD, 22));
        l3.setBounds(100,280,200,50);

        l4 = new JLabel("Re-Enter New PIN: ");
        l4.setFont(new Font("Arial", Font.BOLD, 22));
        l4.setBounds(100,340,250,50);

        p1 = new JPasswordField(34);
        p1.setFont(new Font("Arial", Font.BOLD, 26));
        p1.setBounds(320,230,300,30);

        p2 = new JPasswordField(34);
        p2.setFont(new Font("Arial", Font.BOLD, 26));
        p2.setBounds(320,290,300,30);

        p3 = new JPasswordField(34);
        p3.setFont(new Font("Arial", Font.BOLD, 26));
        p3.setBounds(320,350,300,30);

        b1 = new JButton("SAVE");
        b1.setFont(new Font("Arial",Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(230,440,130,40);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Arial",Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400,440,120,40);


        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(l4);

        c.add(p1);
        c.add(p2);
        c.add(p3);

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
        try
        {
            String a = p1.getText();
            String b = p2.getText();
            String c = p3.getText();

            if(ae.getSource() == b1)
            {
                if(p1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter the current Pin");
                }
                if(p2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter the New Pin");
                }
                if(p3.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter the New Pin");
                }

                if(p2.getText().equals(p3.getText()))
                {
                    
                    conn c1 = new conn();
                    String q1 = "update bank set pin = '"+b+"' where pin = '"+a+"' ";
                    String q2 = "update login set pin = '"+b+"' where pin = '"+a+"' ";
                    String q3 = "update signup3 set pin = '"+b+"' where pin = '"+a+"' ";

                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null, "PIN changed Successfully");

                    new Transaction().setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
                }
            }
            else if(ae.getSource() == b2)
            {
                new Transaction().setVisible(true);
                setVisible(false);
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Error: " +ex);
        }
    }

    public static void main(String[] args) {
        new pin().setVisible(true);
    }
}
