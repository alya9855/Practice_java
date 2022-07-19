package collections.webService;

import java.util.Comparator;

public class DemoComparator implements Comparator<Request> {

    private static DemoComparator demoComparator = null;

    public static DemoComparator getInstance() {
        if (demoComparator == null) {
            demoComparator = new DemoComparator();
        }
        return demoComparator;
    }

    @Override
    public int compare(Request o1, Request o2) {
        if (o1.getPriority() < o2.getPriority()) {
            return -1;
        } else if (o1.getPriority() > o2.getPriority()) {
            return 1;
        } else {
            return 0;
        }
    }
}
