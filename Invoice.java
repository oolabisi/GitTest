import java.util.Scanner;
public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantityOfItemPurchased;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantityOfItemPurchased, double pricePerItem){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantityOfItemPurchased=quantityOfItemPurchased;
        this.pricePerItem=pricePerItem;
    }
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public void getInvoiceAmount(){
     double InvoiceAmount = quantityOfItemPurchased*pricePerItem;
        if(quantityOfItemPurchased < 0){
            System.out.println("The Invoice amount is 0");
        }
        if(pricePerItem < 0){
            System.out.print("The Invoice amount is 0.0");
        }
    }
}  // for class

class InvoiceTest{
    public static void main(String[] args){
        int quantityOfItemPurchased = 0;
        double pricePerItem = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter quantity of Item: ");
        double InvoiceAmount = input.nextDouble();

        System.out.print("Enter price of item: ");
        double InvoiceAmount = input.nextDouble();
        
        System.out.printf("%InvoiceAmount: %f%s%n%s%n");

    }
} // for class