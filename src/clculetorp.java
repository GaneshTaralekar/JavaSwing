import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clculetorp extends JFrame implements ActionListener {
    JTextField j1;
    JTextField j2;
    JLabel re;
    JButton b1,b2,b3,b4;

    public clculetorp(){

        JFrame f = new JFrame();

        f.setBounds(600,300,1000,1000);
        j1 =new JTextField("");
        j2 =new JTextField("");
        re = new JLabel("The result is ");
        b1=new JButton();
        b2=new JButton();

        b3=new JButton();
        b4=new JButton();

        b1.setText("+");
       b2.setText("-");
       b3.setText("*");
       b4.setText("/");
       b1.setBounds(200,500,50,50);
       b2.setBounds(250,500,50,50);
       b3.setBounds(300,500,50,50);
       b4.setBounds(350,500,50,50);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);





        j1.setBounds(200,200,450,50);
        j2.setBounds(200,300,450,50);
        re.setBounds(200,400,450,50);
















        f.add(j1);
        f.add(j2);
        f.add(re);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setLayout(null);

        f.setVisible(true);



    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            int a = Integer.parseInt(j1.getText());
            int b = Integer.parseInt(j2.getText());
            int c= a+b;
            re.setText("The Sum is "+c);


        }
        else if (e.getSource()==b2){

            int a = Integer.parseInt(j1.getText());
            int b = Integer.parseInt(j2.getText());
            int c = a-b;
            re.setText("The Sub is "+c);

        }
        else if (e.getSource()==b3){

            int a = Integer.parseInt(j1.getText());
            int b = Integer.parseInt(j2.getText());
            int c = a*b;
            re.setText("The Mul is "+c);
        }

        else if(e.getSource()==b4){

            int a = Integer.parseInt(j1.getText());
            int b = Integer.parseInt(j2.getText());
            int c = a/b;
            re.setText("The Div is "+c);
        }

    }
    public static void main(String[] args) {
       clculetorp obj = new clculetorp();

    }



}
