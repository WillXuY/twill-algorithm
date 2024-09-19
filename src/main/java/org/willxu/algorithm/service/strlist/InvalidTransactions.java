package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface InvalidTransactions {
    /**
     * A transaction is possibly invalid if:
     * <p>
     * - the amount exceeds $1000, or;
     * - if it occurs within (and including) 60 minutes of another
     *   transaction with the same name in a different city.
     * <p>
     * You are given an array of strings transaction where
     * transactions[i] consists of comma-separated values representing
     * the name, time (in minutes), amount, and city of the transaction.
     * <p>
     * Return a list of transactions that are possibly invalid. You may
     * return the answer in any order.
     *
     * @param transactions transactions.length <= 1000
     *                     Each transactions[i] takes the form
     *                     "{name},{time},{amount},{city}"
     *                     Each {name} and {city} consist of lowercase
     *                     English letters, and have lengths between 1
     *                     and 10.
     *                     Each {time} consist of digits, and represent
     *                     an integer between 0 and 1000.
     *                     Each {amount} consist of digits, and
     *                     represent an integer between 0 and 2000.
     */
    List<String> invalidTransactions(String[] transactions);
}
