import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class list2 extends JFrame implements ActionListener {
    String items[] = {"Ganesh","Soham","Vedant","Omkar","Yash","Ganesh","Soham","Vedant","Omkar","Yash","Ganesh","Soham","Vedant","Omkar","Yash"};
    Jlabble name;
    public list2(){


        JFrame f = new JFrame();
        JLabel name = new JLabel();
        JList l = new JList(items);
        name.setBounds(500,500,400,100);

        JPanel p = new JPanel();
        JButton b = new JButton();
        b.setBounds(1000,200,20,20);
        b.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me){
                if (me.getClickCount()==1){
                    int index = l.getSelectedIndex();
                    String item = (String) l.getSelectedValue();
                    name.setText("The name is "+item+"The index is "+index);

                }
            }
        });
        p.add(new JScrollPane(l));
        p.setBounds(100,200,200,300);


        f.setBounds(600,300,400,300);
        f.add(p);
        f.setLayout(null);
        f.add(b);
        f.add(name);

        f.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        list2 obj = new list2();

    }

}
