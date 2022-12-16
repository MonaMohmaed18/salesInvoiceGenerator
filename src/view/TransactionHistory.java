package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionHistory extends JFrame {
    JFrame f = new JFrame( " TransactionHistory");

    private JTable table;
    private JButton btn1;
   private String[] cols={"InvoiceNum","InvoiceDate","CustomerName","ItemName","ItemPrice","ItemCount"};
    private String[] []data={
            {"","","","","",""}
    };
    public TransactionHistory (){
        super("Table demo");
        table=new JTable(data,cols);
        add(new JScrollPane(table));
        btn1= new JButton("return");
        setLayout(new FlowLayout());
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Frame1 x= new Frame1( );
                x.setVisible(true);
                dispose();
            }
        });
        setSize(600, 600);
        setLocation(60, 60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}