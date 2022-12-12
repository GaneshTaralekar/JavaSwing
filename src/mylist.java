import javax.swing.*;
import java.awt.*;

public class mylist extends JFrame {
    JList l;
    String[] items={"Ganesh","Soham","Vedant","1","Ganesh","Soham","Vedant","1","Ganesh","Soham","Vedant","1"};

    public mylist(){
        l = new JList(items);
       JPanel p = new JPanel();
       p.add(l);
        JFrame f = new JFrame();

        f.setBounds(600,300,400,300);
        f.add(p);
        p.add(new JScrollPane(l));
        f.setVisible(true);


    }
    public static void main(String[] args) {
        mylist obj = new mylist();

    }
}
