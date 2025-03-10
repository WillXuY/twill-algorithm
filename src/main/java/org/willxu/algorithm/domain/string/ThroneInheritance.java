package org.willxu.algorithm.domain.string;

import java.util.List;

/**
 * A kingdom consists of a king, his children, his grandchildren, and
 * so on. Every once in a while, someone in the family dies or a child
 * is born.
 * <p.
 * The kingdom has a well-defined order of inheritance that consists of
 * the king as the first member. Let's define the recursive function
 * Successor(x, curOrder), which given a person x and the inheritance
 * order so far, returns who should be the next person after x in the
 * order of inheritance.
 * <p>
 * Successor(x, curOrder):
 *     if x has no children or all of x's children are in curOrder:
 *         if x is the king return null
 *         else return Successor(x's parent, curOrder)
 *     else return x's oldest child who's not in curOrder
 * <p>
 * For example, assume we have a kingdom that consists of the king, his
 * children Alice and Bob (Alice is older than Bob), and finally
 * Alice's son Jack.
 * <p>
 * 1. In the beginning, curOrder will be ["king"].
 * 2. Calling Successor(king, curOrder) will return Alice, so we append
 *    to curOrder to get ["king", "Alice"].
 * 3. Calling Successor(Alice, curOrder) will return Jack, so we append
 *    to curOrder to get ["king", "Alice", "Jack"].
 * 4. Calling Successor(Jack, curOrder) will return Bob, so we append to
 *    curOrder to get ["king", "Alice", "Jack", "Bob"].
 * 5. Calling Successor(Bob, curOrder) will return null. Thus the order
 *    of inheritance will be ["king", "Alice", "Jack", "Bob"].
 * <p>
 * Using the above function, we can always obtain a unique order of
 * inheritance.
 * <p>
 * Implement the ThroneInheritance class:
 * - ThroneInheritance(string kingName) Initializes an object of the 
 *   ThroneInheritance class. The name of the king is given as part of
 *   the constructor.
 * - 1 <= kingName <= 15
 * - At most 10^5 calls will be made to birth and death.
 * - At most 10 calls will be made to getInheritanceOrder.
 */
public interface ThroneInheritance {
	/**
	 * Indicates that parentName gave birth to childName.
	 * 
	 * @param parentName 1 <= parentName <= 15
	 *                   consist of lowercase English letters only.
	 * @param childName 1 <= childName <= 15
	 *                  consist of lowercase English letters only.
	 */
    void birth(String parentName, String childName);
    
    /**
     * Indicates the death of name. The death of the person doesn't
     * affect the Successor function nor the current inheritance order.
     * You can treat it as just marking the person as dead.
     * 
     * @param name All name arguments of death will be passed to either
     *             the constructor or as childName to birth first.
     */
    void death(String name);
    
    /**
     * @return a list representing the current order of inheritance
     *         excluding dead people.
     */
    List<String> getInheritanceOrder();
    
}
