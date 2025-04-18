package leetcode.p1500_1599.p1598_crawler_log_folder;

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
