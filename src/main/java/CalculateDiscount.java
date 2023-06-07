import java.util.List;

public class CalculateDiscount {
    /**
     * Calculates the discount for a list of items based on whether the customer is
     * a loyalty member and their age.
     *
     * Apply a 20% discount for loyalty members 50 years or older
     *
     * Apply a 10% discount for loyalty members under 50 years old or
     * non-loyalty members over 50 years old
     *
     * Apply a 5% discount for non-loyalty members under 50 years old
     *
     * @param items           the list of prices of items to calculate the discount
     *                        for
     * @param customer        the customer object for which to calculate the discount
     * @return the total discount amount for all items
     */

    public double calculateDiscount(List<Integer> items, Customer customer) {

        double discountRate;

        if (customer.isLoyaltyMember() && customer.getAge() > 50) {
            discountRate = 0.2;
        } else if (customer.isLoyaltyMember() || customer.getAge() > 50) {
            discountRate = 0.1;
        } else {
            discountRate = 0.05;
        }
        double discountAmount = 0;
        for (int item : items) {
            double itemDiscount = item * discountRate;
            discountAmount += itemDiscount;
        }
        return discountRate;
    }

}
