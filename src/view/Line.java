package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Line extends JFrame  {
    private JButton btn1 ;
    private JButton btn2 ;
    JFrame f = new JFrame( "Line");
    private JTextField ItemName;
    private JTextField ItemPrice;
    private JTextField ItemCount;
    private JTextField InvoiceDate;

public Line(){
    super("Line");
    add(new JLabel("ItemName"));
    ItemName=new JTextField(15);
    add(ItemName);

    add(new JLabel("ItemPrice"));
    ItemPrice=new JTextField(15);
    add(ItemPrice);

    add(new JLabel("ItemCount"));
    ItemCount=new JTextField(15);
    add(ItemCount);
    btn1= new JButton("return");
    setLayout(new FlowLayout());
    add(btn1);

    btn2= new JButton("add item");
    setLayout(new FlowLayout());
    add(btn2);

    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Frame1 x = new Frame1( );
            x.show();
            dispose();
        }
    });

    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            show();

        }
    });

    setSize(300,600);
    setLocation(60,60);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    public String getItemCount() {
        return ItemCount.getText();
    }

    public void setItemCount(JTextField itemCount) {
        ItemCount = itemCount;
    }

    public String getItemPrice() {
        return ItemPrice.getText();
    }

    public void setItemPrice(JTextField itemPrice) {
        ItemPrice = itemPrice;
    }

    public String getItemName() {
        return ItemName.getText();
    }

    public void setItemName(JTextField itemName) {
        ItemName = itemName;
    }
}
