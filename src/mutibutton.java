import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mutibutton extends JFrame implements ActionListener {
    public static JFrame f = new JFrame();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();



    public mutibutton(){

        f.setBounds(600,300,400,300);
        b1.setBounds(50,100,100,20);
        b2.setBounds(50,200,100,20);
        b3.setBounds(50,300,100,20);
//        b1.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(new redclass());
        b1.setText("Yellow");
        b2.setText("Green");
        b3.setText("Red");

        f.setLayout(null);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);



    }


    public void actionPerformed(ActionEvent e){

        if (e.getSource()==b1){
            f.getContentPane().setBackground(Color.yellow);

        }
        else if (e.getSource()==b2){
            f.getContentPane().setBackground(Color.GREEN);

        }
//        else if (e.getSource()==b3){
//            f.getContentPane().setBackground(Color.RED);
//
//        }

    }
    public static void main(String[] args) {
        mutibutton obj = new mutibutton();

    }
}
class redclass implements ActionListener{

    public void actionPerformed(ActionEvent e1){

        mutibutton.f.getContentPane().setBackground(Color.RED);

    }
}

