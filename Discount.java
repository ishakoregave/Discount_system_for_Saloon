public class Discount {

    private static double serviceCostPremium = 0.8;//20% discount =  80% of actual price
    private static double serviceCostGold = 0.85;//15% discount =  85% of actual price
    private static double serviceCostSilver = 0.90;//10% discount =  90% of actual price
    private static double productCost = 0.90;//10% discount =  90% of actual price (same for all three memberships

    private static double noDiscount = 1; // no membership means no discount so price does not change

    public static double getServiceCost(String membership) {


        if (membership.equals("Premium")) {

            return serviceCostPremium;

        } else if (membership.equals("Gold")) {

            return serviceCostGold;

        } else if (membership.equals("Silver")) {

            return serviceCostSilver;

        } else {

            return noDiscount;
        }

    }

    public static double getProductCost(String membership) {

        if
        (membership.equals("Premium") || membership.equals("Gold") || membership.equals("Silver")) {

            return productCost;

        }
        else
        {
            return noDiscount;

        }
    }
}
