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
//    private JTextField ItemName;
//    private JTextField ItemPrice;
//    private JTextField ItemCount;
    private JTextField InvoiceDate;

// setter and getter
    public String getInvoiceNum() {
        return InvoiceNum.getText();
    }

    public void setInvoiceNum(JTextField invoiceNum) {
        InvoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
      // System.out.println(InvoiceDate.getText());
        return InvoiceDate.getText();
    }

    public void setInvoiceDate(JTextField invoiceDate) {
        InvoiceDate = invoiceDate;
    }

//    public String getItemCount() {
//        return ItemCount.getText();
//    }
//
//    public void setItemCount(JTextField itemCount) {
//        ItemCount = itemCount;
//    }
//
//    public String getItemPrice() {
//        return ItemPrice.getText();
//    }
//
//    public void setItemPrice(JTextField itemPrice) {
//        ItemPrice = itemPrice;
//    }
//
//    public String getItemName() {
//        return ItemName.getText();
//    }
//
//    public void setItemName(JTextField itemName) {
//        ItemName = itemName;
//    }

    public String getCustomerName() {
        return CustomerName.getText();
    }

    public void setCustomerName(JTextField customerName) {
        CustomerName = customerName;
    }

    // Constractor
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

//        add(new JLabel("ItemName"));
//        ItemName=new JTextField(15);
//        add(ItemName);
//
//        add(new JLabel("ItemPrice"));
//        ItemPrice=new JTextField(15);
//        add(ItemPrice);
//
//        add(new JLabel("ItemCount"));
//        ItemCount=new JTextField(15);
//        add(ItemCount);

        btn1= new JButton("ok");
        setLayout(new FlowLayout());
        add(btn1);
        btn1.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            InvoiceController ii= new InvoiceController();
             ii.fileSave("C:\\Users\\user\\IdeaProjects\\salesInvoiceGenerator\\Invoices.csv");
                JOptionPane.showMessageDialog(null,"data is successfully stored","dialog",
                  JOptionPane.INFORMATION_MESSAGE);
                Line x = new Line( );
                x.show();
                dispose();
            }
        });

        setSize(300,600);
        setLocation(60,60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//       InvoiceController ii= new InvoiceController();
//                ii.fileSave("C:\\Users\\user\\IdeaProjects\\salesInvoiceGenerator\\Invoices.Invoicescsv");
//        JOptionPane.showMessageDialog(null,"data is successfully stored","dialog",
//                JOptionPane.INFORMATION_MESSAGE);
//        Line x = new Line( );
//        x.show();
//        dispose();
//    }
}




