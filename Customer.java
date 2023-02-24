public class Customer
{
    private String name;
    private String ifmember;//member or not
    private String membershipType;



    public Customer(String name, String ifmember, String membershipType) {
        this.name = name;
        this.ifmember = ifmember;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }
    //other set and get methods were not required to run the code
    public String CustomerOutput() {
        return "Customer name:" + getName() +
                " member:" + ifmember +
                " memberType:'" + getMembershipType() ;
    }




}






