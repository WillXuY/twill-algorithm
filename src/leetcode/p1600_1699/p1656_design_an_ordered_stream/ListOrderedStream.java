package leetcode.p1600_1699.p1656_design_an_ordered_stream;

import java.util.ArrayList;
import java.util.List;

public class ListOrderedStream extends AbstractOrderedStream {
    int index = 0;
    List<String> list = new ArrayList<>();

    public ListOrderedStream(int n) {
        super(n);
        for (int i = 0; i < n; i++) {
            list.add("");
        }
    }

    @Override
    public List<String> insert(int idKey, String value) {
        list.set(idKey - 1, value);
        List<String> output = new ArrayList<>();
        if (idKey - 1 == index) {
            for (int i = index; i < list.size(); i++) {
                String s = list.get(i);
                if ("".equals(s)) {
                    break;
                }
                output.add(s);
                index++;
            }
        }
        return output;
    }
}
