import javax.swing.*;
import java.awt.*;

public class MytextArea {
    private JTextArea a;
    JFrame f;
    public MytextArea(){
        f= new JFrame();
        f.setBounds(0,0,1000,1000);
        f.getContentPane().setBackground(Color.yellow);

        a = new JTextArea();
        a.setBounds(100,200,300,200);
        a.setText("Add Questiones");
        a.setBackground(Color.GREEN);
        f.add(a);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        MytextArea obj = new MytextArea();

    }
}
