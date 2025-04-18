package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CrawlerLogFolder;

public class CrawlerLogFolderLoop implements CrawlerLogFolder {
    @Override
    public int minOperations(String[] logs) {
        String parent = "../";
        String same = "./";
        int output = 0;
        for (String l: logs) {
            if (parent.equals(l)) {
                if (output > 0) {
                    output--;
                }
            } else if (!same.equals(l)) {
                output++;
            }
        }
        return output;
    }
}
