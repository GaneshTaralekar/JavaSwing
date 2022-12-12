import javax.swing.*;

public class rediobuttonr {
    JRadioButton r1,r2;
    rediobuttonr(){
        JFrame f = new JFrame();

        f.setBounds(600,300,400,300);

        r1 = new JRadioButton("SuperPower");
        r2 = new JRadioButton("SuperHuman");
        ButtonGroup p = new ButtonGroup();
        p.add(r1);
        p.add(r2);
       r1.setSelected(true);
        r1.setBounds(100,100,200,30);
        r2.setBounds(100,200,200,30);


        f.add(r1);
        f.add(r2);
        f.setLayout(null);

        f.setVisible(true);



    }
    public static void main(String[] args) {
        rediobuttonr obj = new rediobuttonr();

    }
}
