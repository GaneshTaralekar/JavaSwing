import javax.swing.*;

public class mytables {
    String columnname []={"name ","Rollno","age"};
    String[][] data ={
            {"Ganesh","1","20"},
            {"Soham","2","20"},
            {"Vedant","3","20"},

    };




    mytables(){



        JTable t = new JTable(data,columnname);

        JFrame f = new JFrame();

        JPanel p = new JPanel();


        f.setBounds(600,300,400,300);
        p.setBounds(100,100,500,400);
        p.add(new JScrollPane(t));


        f.add(p);

        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        mytables obj = new mytables();

    }
}
