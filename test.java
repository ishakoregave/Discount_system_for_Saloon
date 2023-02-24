import java.util.Scanner;
import java.util.Date;
public class test {

    public static void main(String[] args) {
        Customer C1;
        String name;
        String member;
        String membership;

        Visit V1;
        Date date = new Date();
        double service;
        double productcost;


        Scanner Scan = new Scanner(System.in);
        System.out.println("What is your name?");
        name = Scan.nextLine();

        System.out.println("Do you have a membership?Enter yes or no.");
        member = Scan.nextLine();

        if (member.equals("yes") || member.equals("Yes")) {
            System.out.println("What type of membership do you have?Enter Premium/Gold/Silver");
            membership = Scan.nextLine();

        } else {
            System.out.println("Customers without membership receive no discount");
            membership = "None";
        }

        C1 = new Customer(name, member, membership);
        System.out.println(C1.CustomerOutput());

        V1 = new Visit(C1, date);

        System.out.println("What is the cost of the services?");
        service = Scan.nextDouble();
        V1.setServiceExpense(service);


        System.out.println("What is the cost of the product?");
        productcost = Scan.nextDouble();
        V1.setProductExpense(productcost);

        System.out.println("Total expense for " + V1.getCustomerName() + ":" + V1.total());


    }

}
















