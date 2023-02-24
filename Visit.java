import java.util.Date;
public class Visit {

    private Customer C1;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer C1, Date date) {
        this.C1 = C1;
        this.date = date;

    }

    public String getCustomerName() {
        return C1.getName();//method used from Customer class
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double total(){
        return (getServiceExpense() * Discount.getServiceCost(C1.getMembershipType()) + getProductExpense() * Discount.getProductCost(C1.getMembershipType()));
    }

    }




