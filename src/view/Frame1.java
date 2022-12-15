package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame{
    JFrame f = new JFrame( "Frame1");
    TransactionHistory t= new TransactionHistory();
    public NewInvoice i= new NewInvoice();
    private JButton btn1 ;
    private JButton btn2 ;
public Frame1(){
    super("Frame1");
    btn1= new JButton("generate");
    btn2= new JButton("retain");
    setLayout(new FlowLayout());
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            i.show();
            dispose();
        }
    });
    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           t.show();
            dispose();
        }
    });

    add(btn1);
    add(btn2);

    setSize(200,300);
    setLocation(60,60);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //f.pack();
}
}