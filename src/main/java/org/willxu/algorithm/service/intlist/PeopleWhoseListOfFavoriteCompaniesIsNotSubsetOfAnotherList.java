package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PeopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherList {
    /**
     * Given the array favoriteCompanies where favoriteCompanies[i] is
     * the list of favorites companies for the ith person (indexed from
     * 0).
     * <p>
     * Return the indices of people whose list of favorite companies is
     * not a subset of any other list of favorites companies. You must
     * return the indices in increasing order.
     *
     * @param favoriteCompanies 1 <= favoriteCompanies.length <= 100
     *                          1 <= favoriteCompanies[i].length <= 500
     *                          1 <= favoriteCompanies[i][j].length <= 20
     *                          All strings in favoriteCompanies[i] are
     *                          distinct.
     *                          All lists of favorite companies are
     *                          distinct, that is, If we sort
     *                          alphabetically each list then
     *                          favoriteCompanies[i] != favoriteCompanies[j].
     *                          All strings consist of lowercase English
     *                          letters only.
     */
    List<Integer> peopleIndexes(List<List<String>> favoriteCompanies);
}
