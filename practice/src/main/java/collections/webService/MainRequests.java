package collections.webService;

import java.util.ArrayList;

public class MainRequests {
    static ArrayList<Request> requests = new ArrayList<>();

    public static void main(String[] args) {
        RequestUtils.initData();
        RequestUtils.startRequestLoop();
    }
}
