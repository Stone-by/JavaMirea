package ikbo08190902;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface{
    private JButton sortBall;
    private JButton Search;
    private JLabel sort;
    private JLabel sear;
    private JFrame frame;
    private JPanel panel;

    public Interface(){
        ListStudent a1 = new ListStudent();
        a1.AddList();
        frame = new JFrame("Student");
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sortBall = new JButton("Sort");
        Search = new JButton("Search");
        panel = new JPanel();
        sort = new JLabel("Sort mas: ");
        sear = new JLabel("Search student: ");
        sortBall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a1.SortBall();
                sort.setText(a1.toString());
            }
        });
        Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a1.Search();
                sear.setText(a1.PrintWord());
            }
        });
        panel.add(sortBall);
        panel.add(Search);
        panel.add(sort);
        panel.add(sear);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new Interface();
    }
}
