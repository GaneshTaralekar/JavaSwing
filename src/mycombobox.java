import javax.swing.*;

public class mycombobox {
    String itmes[]={"1","2","3","4","5","6","7","8","9","10"};

    mycombobox(){

        JFrame f = new JFrame();
        JComboBox c = new JComboBox(itmes);

        c.setBounds(100,100,200,30);
        f.setBounds(600,300,400,300);
        f.add(c);
        f.setLayout(null);


        f.setVisible(true);
    }
    public static void main(String[] args) {
        mycombobox obj = new mycombobox();

    }
}
