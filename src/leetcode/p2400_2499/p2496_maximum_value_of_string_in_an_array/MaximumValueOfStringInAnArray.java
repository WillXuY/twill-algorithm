package leetcode.p2400_2499.p2496_maximum_value_of_string_in_an_array;

public interface MaximumValueOfStringInAnArray {
    /**
     * The value of an alphanumeric string can be defined as:
     * <p>
     * - The numeric representation of the string in base 10, if it
     *   comprises of digits only.
     * - The length of the string, otherwise.
     * <p>
     * Given an array strs of alphanumeric strings, return the maximum
     * value of any string in strs.
     *
     * @param strs 1 <= strs.length <= 100
     *             1 <= strs[i].length <= 9
     *             strs[i] consists of only lowercase English letters
     *             and digits.
     */
    int maximumValue(String[] strs);
}
