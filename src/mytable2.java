import javax.swing.*;
import java.awt.*;
public class mytable2 {
    String column1[]={"Name","Rollno"};
    String [][] data = {
            {"Ganesh","10"},
            {"Vedant","20"},
            {"Soham","30"}
    };


    public mytable2(){

        JFrame j = new JFrame();
        JTable t = new JTable(data,column1);
        JPanel p =new JPanel();

        j.setBounds(100,100,500,600);
        p.setBounds(100,100,500,400);
        p.add(new JScrollPane(t));
        j.add(p);
        j.setLayout(null);
        j.setVisible(true);



    }
    public static void main(String[] args) {
        mytable2 m = new mytable2();



    }
}
