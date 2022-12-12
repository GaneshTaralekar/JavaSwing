import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class mytree {
    mytree(){
        JFrame f = new JFrame();
        DefaultMutableTreeNode Root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");

        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("B2");
        A.add(A1);
        A.add(A2);
        B.add(B1);
        B.add(B2);
        Root.add(A);
       Root.add(B);
      JTree t1 = new JTree(Root);











        f.setBounds(600,300,400,300);
        t1.setBounds(100,100,400,500);



        f.setLayout(null);
        f.add(t1);

        f.setVisible(true);

    }
    public static void main(String[] args) {
        mytree obj = new mytree();

    }
}
