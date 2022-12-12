import javax.swing.*;
import java.awt.*;

public class Mybutton {


    public Mybutton(){
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(100,100,100,50);
//        b.setEnabled(false);
        b.setForeground(Color.blue);
        b.setBackground(Color.CYAN);
        Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        f.setBounds(600,300,400,300);
        f.setLayout(null);
        f.add(b);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        Mybutton obj = new Mybutton();

    }
}
