import javax.swing.*;


import java.util.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

class MainFrame extends JFrame implements ActionListener
{
    Container c;
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2, b3;

    MainFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"AUTOMATED TELLER MACHINE");
        

        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Arial",Font.BOLD,32));
        l1.setBounds(220,140,400,90);

        l2 = new JLabel("Card No :");
        l2.setFont(new Font("Arail",Font.BOLD,26));
        l2.setBounds(140,225,200,90);

        l3 = new JLabel("PIN :");
        l3.setFont(new Font("Arial",Font.BOLD,26));
        l3.setBounds(140,305,200,90);

        t1 = new JTextField(26);
        t1.setBounds(335,258,230,30);

        p1 = new JPasswordField(26);
        p1.setBounds(335,340,230,30);

        b1 = new JButton("SIGN IN");
        b1.setFont(new Font("Arial",Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(335,420,100,28);

        b2 = new JButton("CLEAR");
        b2.setFont(new Font("Arial",Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(465,420,100,28);

        b3 = new JButton("SIGN UP");
        b3.setFont(new Font("Arial",Font.BOLD, 14));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(335,470,230,28);


        c.add(l1);
        c.add(l2);
        c.add(l3);

        c.add(t1);
        c.add(p1);

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
            conn c1 = new conn();
            String a = t1.getText();
            String b = p1.getText();
            String q = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
            ResultSet rs = c1.s.executeQuery(q);

            if(ae.getSource() == b1)
            {
                if(rs.next())
                {
                    new Transaction().setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
                }
            }
            else if(ae.getSource() == b2)
            {
                    t1.setText("");
                    p1.setText("");
            }
            else if(ae.getSource() == b3)
            {
                new SignUp1().setVisible(true);
                setVisible(false);
            }            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("error:" +e);
        }
    }

    public static void main(String[] args){
        new MainFrame().setVisible(true);
    }



    
}