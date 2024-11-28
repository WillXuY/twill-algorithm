package org.willxu.algorithm.domain;

/**
 * There is a supermarket that is frequented by many customers. The
 * products sold at the supermarket are represented as two parallel
 * integer arrays products and prices, where the i^th product has an ID
 * of products[i] and a price of prices[i].
 * <p>
 * When a customer is paying, their bill is represented as two parallel
 * integer arrays product and amount, where the j^th product they
 * purchased has an ID of product[j], and amount[j] is how much of the
 * product they bought. Their subtotal is calculated as the sum of each
 * amount[j] * (price of the j^th product).
 * <p>
 * The supermarket decided to have a sale. Every n^th customer paying
 * for their groceries will be given a percentage discount. The
 * discount amount is given by discount, where they will be given
 * discount percent off their subtotal. More formally, if their subtotal
 * is bill, then they would actually pay bill * ((100 - discount) / 100).
 * <p>
 * Implement the Cashier class:
 * <p>
 * Cashier(int n, int discount, int[] products, int[] prices)
 * Initializes the object with n, the discount, and the products and
 * their prices.
 * <p>
 * 1 <= n <= 104
 * 0 <= discount <= 100
 * 1 <= products.length <= 200
 * prices.length == products.length
 * 1 <= products[i] <= 200
 * 1 <= prices[i] <= 1000
 * The elements in products are unique.
 * 1 <= product.length <= products.length
 * amount.length == product.length
 * product[j] exists in products.
 * 1 <= amount[j] <= 1000
 * The elements of product are unique.
 * At most 1000 calls will be made to getBill.
 * Answers within 10-5 of the actual value will be accepted.
 */
public interface ApplyDiscountEveryOrders {
    /**
     * Returns the final total of the bill with the discount applied (if
     * any). Answers within 10^-5 of the actual value will be accepted.
     *
     * @param product 1 <= products.length <= 200
     *                1 <= products[i] <= 200
     *                The elements in products are unique.
     *                1 <= product.length <= products.length
     *                product[j] exists in products.
     *                The elements of product are unique.
     * @param amount amount.length == product.length
     *               1 <= amount[j] <= 1000
     */
    double getBill(int[] product, int[] amount);
}
