import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

class SignUp1 extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JComboBox c1,c2,c3;
    JButton b1;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    SignUp1()
    {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM");


        l1 = new JLabel("APPLICATION FORM NO: " + first);
        l1.setFont(new Font("Arial", Font.BOLD, 36));
        l1.setBounds(105,20,600,60);

        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setBounds(250,90,400,20);

        l3 = new JLabel("Name: ");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(100,150,100,20);

        t1 = new JTextField(26);
        t1.setBounds(280,150,330,24);

        l4 = new JLabel("Father's Name: ");
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(100,200,320,20);

        t2 = new JTextField(26);
        t2.setBounds(280,200,330,24);

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(100,252,300,20);

        l6 = new JLabel("Date");
        l6.setFont(new Font("Arial", Font.BOLD, 12));
        l6.setBounds(280,255,50,15);

        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        c1.setBounds(310,250,60,25);

        l7 = new JLabel("Month");
        l7.setFont(new Font("Arial", Font.BOLD, 12));
        l7.setBounds(378,255,50,15);

        String Month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(Month);
        c2.setBackground(Color.white);
        c2.setBounds(420,250,80,25);

        l8 = new JLabel("Year");
        l8.setFont(new Font("Arial", Font.BOLD, 12));
        l8.setBounds(510,255,50,15);

        String Year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
        c3 = new JComboBox(Year);
        c3.setBackground(Color.white);
        c3.setBounds(545,250,60,25);

        l9 = new JLabel("Gender:");
        l9.setFont(new Font("Arial", Font.BOLD, 18));
        l9.setBounds(100,300,300,20);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial", Font.BOLD, 12));
        r1.setBackground(Color.white);
        r1.setBounds(280,300,60,25);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Arial", Font.BOLD, 12));
        r2.setBackground(Color.white);
        r2.setBounds(380,300,80,25);

        l10 = new JLabel("Email Address:");
        l10.setFont(new Font("Arial", Font.BOLD, 18));
        l10.setBounds(100,350,300,20);

        t3 = new JTextField(26);
        t3.setBounds(280,350,330,24);

        l11 = new JLabel("Maritial Status");
        l11.setFont(new Font("Arial", Font.BOLD, 18));
        l11.setBounds(100,400,300,20);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Arial", Font.BOLD, 12));
        r3.setBackground(Color.white);
        r3.setBounds(280,400,80,25);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Arial", Font.BOLD, 12));
        r4.setBackground(Color.white);
        r4.setBounds(380,400,100,25);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Arial", Font.BOLD, 12));
        r5.setBackground(Color.white);
        r5.setBounds(480,400,80,25);

        l12 = new JLabel("Address:");
        l12.setFont(new Font("Arial", Font.BOLD, 18));
        l12.setBounds(100,450,300,20);

        t4 = new JTextField(26);
        t4.setBounds(280,450,330,24);

        l13 = new JLabel("City");
        l13.setFont(new Font("Arial", Font.BOLD, 18));
        l13.setBounds(100,500,300,20);

        t5 = new JTextField(26);
        t5.setBounds(280,500,330,24);

        l14 = new JLabel("Pin Code:");
        l14.setFont(new Font("Arial", Font.BOLD, 18));
        l14.setBounds(100,550,300,20);

        t6 = new JTextField(26);
        t6.setBounds(280,550,330,24);

        l15 = new JLabel("State:");
        l15.setFont(new Font("Arial", Font.BOLD, 18));
        l15.setBounds(100,600,300,20);

        t7 = new JTextField(26);
        t7.setBounds(280,600,330,24);

        b1 = new JButton("Next");
        b1.setFont(new Font("Arial",Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(525,640,70,20);


        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(t1);
        c.add(l4);
        c.add(t2);
        c.add(l5);
        c.add(l6);

        c.add(c1);
        c.add(l7);

        c.add(c2);
        c.add(l8);

        c.add(c3);
        c.add(l9);
        
        c.add(r1);
        c.add(r2);

        c.add(l10);
        c.add(t3);

        c.add(l11);
        c.add(r3);
        c.add(r4);
        c.add(r5);

        c.add(l12);
        c.add(t4);

        c.add(l13);
        c.add(t5);

        c.add(l14);
        c.add(t6);

        c.add(l15);
        c.add(t7);

        c.add(b1);

        b1.addActionListener(this);



        setSize(750,750);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public void actionPerformed(ActionEvent ae)
    {
        String a = t1.getText();
        String b = t2.getText();

        String ac = (String)c1.getSelectedItem();
        String bc = (String)c2.getSelectedItem();
        String cc = (String)c3.getSelectedItem();

        String d = null;
        if(r1.isSelected())
        {
            d = "Male";
        }
        else if(r2.isSelected())
        {
            d = "Female";
        }
        
        String e = t3.getText();

        String f = null;
        if(r3.isSelected())
        {
            f = "Married";
        }
        else if(r4.isSelected())
        {
            f = "Unmarried";
        }
        else if(r5.isSelected())
        {
            f = "Other";
        }

        String g = t4.getText();
        String h = t5.getText();
        String i = t6.getText();
        String j = t7.getText();

        try
        {

            if(t6.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else
            {

                conn c1 = new conn();
                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
                c1.s.executeUpdate(q1);

                new SignUp2().setVisible(true);
                setVisible(false);

            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }





    }

    public static void main(String args[])
    {
        new SignUp1().setVisible(true);
    }

    
}

