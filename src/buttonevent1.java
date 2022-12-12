import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonevent1 extends JFrame implements ActionListener {
    JFrame f = new JFrame();
    JLabel l = new JLabel("Ganesh Is The Best");
    JButton b1 = new JButton("Click1");
    JButton b2 = new JButton("Click2");



    public buttonevent1(){

        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setBounds(100,100,50,20);
        b2.setBounds(200,200,50,20);

        l.setBounds(300,600,400,100);

        f.setBounds(600,300,400,300);

        f.add(l);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);

        f.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

//        l.setText("You are best");
        System.out.println(e.getSource());
        f.getContentPane().setBackground(Color.yellow);

        if (e.getSource()==b1){
            f.getContentPane().setBackground(Color.yellow);
        }
        else if (e.getSource()==b2){
            f.getContentPane().setBackground(Color.BLUE);

        }
        else {
            f.getContentPane().setBackground(Color.BLACK);

        }

    }


    public static void main(String[] args) {
     buttonevent1 obj = new buttonevent1();

    }
}
