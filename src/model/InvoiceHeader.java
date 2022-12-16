package model;
import java.util.ArrayList; // import the ArrayList class

public class InvoiceHeader {
    private String customer;
    private Integer num;
    private String date;

    private ArrayList<InvoiceLine> InLine = new ArrayList<InvoiceLine>();
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<InvoiceLine> getInLine() {
        return InLine;
    }

    public void setInLine(ArrayList<InvoiceLine> inLine) {
        InLine = inLine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
