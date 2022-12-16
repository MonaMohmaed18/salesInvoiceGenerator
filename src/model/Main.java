package model;

//import controller.InvoiceController;
import controller.InvoiceController;
import view.Frame1;
import view.NewInvoice;
import view.TransactionHistory;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        InvoiceController i=new InvoiceController();
        i.start_program();
        //System.out.println(Inheader.getInvoiceDate());



    }
}