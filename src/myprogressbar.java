import javax.swing.*;

public class myprogressbar {
    myprogressbar(){

        JFrame f = new JFrame();
        JProgressBar p = new JProgressBar(0,100);


        f.setBounds(600,300,100,1000);
        p.setBounds(600,300,100,10);
        p.setStringPainted(true);
        p.setValue(0);
        int i =0;
        while (i<=100) {
            p.setValue(i);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
            }
            f.add(p);

            f.setLayout(null);

            f.setVisible(true);
            i = i + 10;
        }





    }
    public static void main(String[] args) {
        myprogressbar m = new myprogressbar();

    }
}
