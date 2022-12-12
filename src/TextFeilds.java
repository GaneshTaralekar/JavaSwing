import javax.swing.*;
import java.awt.*;

public class TextFeilds {
   public TextFeilds(){
       JFrame f = new JFrame();
       JTextField t = new JTextField("Enter Your name",100);

       Font f1 = new Font("Arial",Font.BOLD,20);
       t.setBounds(100,100,200,50);
        t.setFont(f1);
        t.setBackground(Color.BLUE);
        t.setForeground(Color.RED);
       f.setBounds(600,300,400,300);
       t.setEditable(false);

       f.setLayout(null);
       f.add(t);
       f.setResizable(false);
       f.setVisible(true);

    }
    public static void main(String[] args) {
       TextFeilds obj = new TextFeilds();

    }
}
