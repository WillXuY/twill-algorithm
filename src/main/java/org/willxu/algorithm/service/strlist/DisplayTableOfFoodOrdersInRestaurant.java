package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface DisplayTableOfFoodOrdersInRestaurant {
    /**
     * Given the array orders, which represents the orders that
     * customers have done in a restaurant. More specifically
     * orders[i]=[customerName_i,tableNumber_i,foodItem_i] where
     * customerName_i is the name of the customer, tableNumber_i is the
     * table customer sit at, and foodItem_i is the item customer orders.
     * <p>
     * Return the restaurant's “display table”. The “display table” is a
     * table whose row entries denote how many of each food item each
     * table ordered. The first column is the table number and the
     * remaining columns correspond to each food item in alphabetical
     * order. The first row should be a header whose first column is
     * “Table”, followed by the names of the food items. Note that the
     * customer names are not part of the table. Additionally, the rows
     * should be sorted in numerically increasing order.
     *
     * @param orders 1 <= orders.length <= 5 * 10^4
     *               orders[i].length == 3
     *               1 <= customerName_i.length, foodItem_i.length <= 20
     *               customerName_i and foodItem_i consist of lowercase
     *               and uppercase English letters and the space character.
     *               tableNumber_i is a valid integer between 1 and 500.
     */
    List<List<String>> displayTable(List<List<String>> orders);
}
