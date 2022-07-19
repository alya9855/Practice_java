package collections.webService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainRequests {
    static ArrayList<Request> requests = new ArrayList<>();
    public static void main(String[] args) {
        initData();
        print();
        System.out.println("Collection after sort");
        DemoComparator comparator = DemoComparator.getInstance();
        Collections.sort(requests, comparator);
        print();

    }

    public static void initData() {
        requests.add(new Request("POST", 1));
        requests.add(new Request("GET", 2));
        requests.add(new Request("DELETE", 3));
        requests.add(new Request("UPDATE", 1));

    }

    public static void print(){
        for (Request request : requests){
            System.out.println(request);
        }
    }
}
