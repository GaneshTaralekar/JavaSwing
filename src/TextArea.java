import javax.swing.*;

public class TextArea {
    public TextArea(){
        JFrame f = new JFrame();
        JTextArea a = new JTextArea();
        a.setBounds(100,100,300,70);

        f.setBounds(600,300,400,300);
        f.setLayout(null);

        f.setVisible(true);
        f.add(a);

    }
    public static void main(String[] args) {
        TextArea obj = new TextArea();


    }
}
