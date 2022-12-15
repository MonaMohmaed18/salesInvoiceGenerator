package view;
import controller.InvoiceController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewInvoice extends JFrame  {
    JFrame f = new JFrame( " New Invoice");


    private JButton btn1 ;
    private JTextField InvoiceNum;
    private JTextField CustomerName;
    private JTextField ItemName;
    private JTextField ItemPrice;
    private JTextField ItemCount;
    private JTextField InvoiceDate;

    private JMenu file;




    public NewInvoice(){
        super("NewInvoice");
        //file=new JMenu("save");
        add(new JLabel("InvoiceNum"));
        InvoiceNum=new JTextField(15);
        add(InvoiceNum);

        add(new JLabel("InvoiceDate"));
        InvoiceDate= new JTextField(15);
        add(InvoiceDate);

        add(new JLabel("CustomerName"));
        CustomerName=new JTextField(15);
        add(CustomerName);

        add(new JLabel("ItemName"));
        ItemName=new JTextField(15);
        add(ItemName);

        add(new JLabel("ItemPrice"));
        ItemPrice=new JTextField(15);
        add(ItemPrice);

        add(new JLabel("ItemCount"));
        ItemCount=new JTextField(15);
        add(ItemCount);

        btn1= new JButton("ok");
        setLayout(new FlowLayout());
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"data is successfully stored","dialog",
                  JOptionPane.INFORMATION_MESSAGE);
                Frame1 x = new Frame1( );
                x.show();
                dispose();
            }
        });

        setSize(300,600);
        setLocation(60,60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    }




