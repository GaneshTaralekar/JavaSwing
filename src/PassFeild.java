import javax.swing.*;

public class PassFeild {
   public PassFeild(){
       JFrame f = new JFrame();
       JPasswordField p = new JPasswordField();
       p.setBounds(100,100,200,50);
       p.setEchoChar('*');

       f.setBounds(600,300,400,300);
       f.setLayout(null);
       f.add(p);
       f.setVisible(true);

    }
    public static void main(String[] args) {
       PassFeild obj = new PassFeild();


    }
}
