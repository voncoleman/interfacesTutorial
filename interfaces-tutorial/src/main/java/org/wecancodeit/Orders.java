package org.wecancodeit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

public class Orders {
    // List is an Interface

    private List<CookieOrders> order = new ArrayList<>();
    private List<OtherOrders> others = new LinkedList<>();

    public void printList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public void printAllHashes(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
