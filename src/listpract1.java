import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class listpract1 {

    private JList l;
    private Jlabble b;

    listpract1(){
        String[] item={"Ganesh","Soham","Vedant","Omkar","Ganesh","Soham","Vedant","Omkar","Ganesh","Soham","Vedant","Omkar"};
        JList l = new JList(item);
        JLabel b =new JLabel();

        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.add(new JScrollPane(l));
        p.add(b);




        f.setBounds(600,300,400,300);
        l.setBounds(100,100,300,200);
        p.setBounds(100,100,400,300);
        b.setBounds(100,100,300,300);
        l.setVisibleRowCount(10);

        f.add(p);



        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(e.getClickCount()==2){
                   int i = l.getSelectedIndex();
                   String a = (String) l.getSelectedValue();
                   b.setText("The values is "+a);
               }
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        listpract1 obj = new listpract1();


    }
}
