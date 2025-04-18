package leetcode.p0900_0999.p0929_unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddressesLoop implements UniqueEmailAddresses {
    /**
     * 1. Define boolean split: has meet '@' or not.
     * 2. Define boolean ignore: has meet first '+', before '@'.
     * 3. Before split, loop the chars, remove '.'
     * 4. Add emails to set.
     */
    @Override
    public int numUniqueEmails(String[] emails) {
        Set<String> emailsSet = new HashSet<>();
        for (String email: emails) {
            boolean split = false;
            boolean ignore = false;
            StringBuilder stringBuilder = new StringBuilder();
            for (char c: email.toCharArray()) {
                if (split) {
                    stringBuilder.append(c);
                } else {
                    if ('@' == c) {
                        stringBuilder.append(c);
                        split = true;
                    } else if (!ignore) {
                        if ('+' == c) {
                            ignore = true;
                        } else if ('.' != c) {
                            stringBuilder.append(c);
                        }
                    }
                }
            }
            emailsSet.add(stringBuilder.toString());
        }
        return emailsSet.size();
    }
}
