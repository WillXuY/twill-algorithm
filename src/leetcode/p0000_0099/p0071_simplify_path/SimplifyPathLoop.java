package leetcode.p0000_0099.p0071_simplify_path;

public class SimplifyPathLoop implements SimplifyPath {
    @Override
    public String simplifyPath(String path) {
        char[] chars = path.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        boolean lastSlash = true;
        int periodLength = 0;
        boolean isName = false;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '/') {
                if (periodLength == 2) {
                    sb.delete(sb.lastIndexOf("/"), sb.length());
                    if (sb.length() == 0) {
                        sb.append("/");
                    }
                } else if (periodLength > 2) {
                    if (sb.length() > 1) {
                        sb.append("/");
                    }
                    sb.append(".".repeat(periodLength));
                }
                lastSlash = true;
                periodLength = 0;
                isName = false;
            } else if (chars[i] == '.') {
                if (isName) {
                    sb.append('.');
                } else {
                    lastSlash = false;
                    periodLength++;
                }
            } else {
                if (lastSlash && sb.length() > 1) {
                    sb.append('/');
                }
                if (periodLength > 0) {
                    if (sb.length() > 1) {
                        sb.append('/');
                    }
                    sb.append(".".repeat(periodLength));
                }
                sb.append(chars[i]);
                lastSlash = false;
                periodLength = 0;
                isName = true;
            }
        }
        if (periodLength == 2) {
            sb.delete(sb.lastIndexOf("/"), sb.length());
            if (sb.length() == 0) {
                sb.append("/");
            }
        } else if (periodLength > 2) {
            if (sb.length() > 1) {
                sb.append('/');
            }
            sb.append(".".repeat(periodLength));
        }
        return sb.toString();
    }
}
