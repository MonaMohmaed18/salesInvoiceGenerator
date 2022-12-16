package model;

//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;
//import com.opencsv.bean.ColumnPositionMappingStrategy;
//import com.opencsv.bean.CsvToBean;
import view.Line;
import view.NewInvoice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    ArrayList<InvoiceHeader> headerlist =new ArrayList();
    NewInvoice headergui= new NewInvoice();
    Line itemgui= new Line();
    void readFile(){

    }
    void writeFile(ArrayList<InvoiceHeader>headerlist){
        String csv = "C:\\Users\\user\\IdeaProjects\\salesInvoiceGenerator\\Invoices.csv";


      //  strcpy(headerlist.getCustomer,headergui.getCustomerName()); //headergui.getInvoiceDate(), headergui.getInvoiceNum(),headergui.getCustomerName()});

//        writer.writeAll(headerlist);
//        System.out.println("CSV File written successfully All at a time");
//        writer.close();
    }
}
