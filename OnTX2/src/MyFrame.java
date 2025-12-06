import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton mybutton = new JButton("MyButton");
    JButton mybutton2 = new JButton("MyButton");

    MyFrame() {
        mybutton.setBounds(100, 100, 200, 100);
        mybutton2.setBounds(100, 200, 200, 100);
//        mybutton.addActionListener(new  ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e){
//                System.out.println("You clicked MyButton");
//            }
//        });
        mybutton.addActionListener((e) -> System.out.println("First Button clicked"));
        mybutton2.addActionListener((e) -> System.out.println("Second Button clicked"));
        this.add(mybutton);
        this.add(mybutton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
