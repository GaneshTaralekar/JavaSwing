import javax.swing.*;

public class mymenu {
    mymenu(){
        JFrame f = new JFrame();
        JMenuBar j = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu folder= new JMenu("Folder");
        JMenuItem m1 = new JMenuItem("New");
        JMenuItem m2 = new JMenuItem("New");
        JMenuItem m3 = new JMenuItem("New");
        JMenuItem m4 = new JMenuItem("New");
        JMenuItem m5 = new JMenuItem("New");
        JMenuItem m6 = new JMenuItem("New");
        JMenuItem m7 = new JMenuItem("New");
        JMenuItem m8 = new JMenuItem("New");
        JMenuItem m9 = new JMenuItem("New");
        JMenuItem m10 = new JMenuItem("New");
        JMenu m11 = new JMenu("New");
        JMenuItem m12 = new JMenuItem("New");
        JMenuItem m13 = new JMenuItem("New");
        JMenuItem m14 = new JMenuItem("New");


        m11.add(m13);
        m11.add(m14);

        file.add(m1);
        file.add(m2);

        file.add(m3);
        file.add(m4);
        file.add(m5);
        file.add(m6);

        folder.add(m7);
        folder.add(m8);
        folder.add(m9);
        folder.add(m10);
        folder.add(m11);
        folder.add(m12);


        j.add(file);
        j.add(folder);



        f.setBounds(600,300,400,300);
        j.setBounds(100,100,700,40);
        f.add(j);
        f.setLayout(null);

        f.setVisible(true);

    }
    public static void main(String[] args) {
        mymenu obj = new mymenu();

    }
}
