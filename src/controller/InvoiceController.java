package controller;

import model.InvoiceHeader;
import view.Frame1;
import view.NewInvoice;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.io.FileWriter;
import java.util.ArrayList;

public class InvoiceController {
    NewInvoice Inheader;
    Frame1 f = new Frame1( );
    public void start_program(){
        f.setVisible(true);
    Inheader = new NewInvoice();}
    // InvoiceHeader array list
//    private ArrayList<InvoiceHeader> inh = new ArrayList<>();
//    int i=0;
  // public NewInvoice inheader = new NewInvoice();
//    int InvoiceNum;
    //private InvoiceHeader Inheader= new InvoiceHeader();
//    private String FilePath = "C:\\Users\\user\\IdeaProjects\\salesInvoiceGenerator\\Invoices.csv";
//    private FileWriter fileWriter;
//
    // Read invoice
    private void fileLoad(String FilePath) {
        BufferedReader reader = null;
        try {
            String line = "";
            reader = new BufferedReader(new FileReader(FilePath));
            reader.readLine();
            while((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

                if(fields.length > 0) {
//                    User user = new User();
//                    user.setId(Integer.parseInt(fields[0]));
//                    user.setFirstName(fields[1]);
//                    user.setLastName(fields[2]);
//                    users.add(user);
                }
            }

//            for(User u: users) {
//                System.out.printf("[userId=%d, firstName=%s, lastName=%s]\n", u.getId(), u.getFirstName(), u.getLastName());
//            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

//    //Write method
    public void fileSave(String FilePath){
         FileWriter fileWriter =null;
        try {

            fileWriter = new FileWriter(FilePath);
            fileWriter.append("InvoiceNum,InvoiceDate,CustomerName\n");



            fileWriter.append(Inheader.getInvoiceNum());
            fileWriter.append(",");
            fileWriter.append(Inheader.getInvoiceDate());
            fileWriter.append(",");
            fileWriter.append(Inheader.getCustomerName());
          //  fileWriter.append(",");
//            fileWriter.append(inheader.getItemName());
//            fileWriter.append(",");
//            fileWriter.append(inheader.getItemPrice());
//            fileWriter.append(",");
//            fileWriter.append(inheader.getItemCount());
            fileWriter.append("\n");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
