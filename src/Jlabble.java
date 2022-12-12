import javax.swing.*;
import java.awt.*;

public class Jlabble {

    public Jlabble(){
        JFrame f = new JFrame();
        JLabel l = new JLabel();
        l.setText("GaneshisMyName");
        l.setBounds(110,100,300,60);
        l.setForeground(Color.BLUE);
        l.setBackground(Color.GREEN);

        f.setBounds(600,300,400,300);
        f.setLayout(null);
        f.add(l);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        Jlabble l1 = new Jlabble();

    }
}
