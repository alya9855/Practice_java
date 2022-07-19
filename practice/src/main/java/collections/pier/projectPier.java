package collections.pier;

import java.util.ArrayList;

public class projectPier {
    static ArrayList<Pier> piers = new ArrayList<>();

    public static void main(String[] args) {
        initData();
        System.out.println(middleTimeOnStop());
    }

    public static double middleTimeOnStop(){
        double middleTime = 0;
        double sumPier = 0;
        for (Pier pier : piers) {
            sumPier += pier.getTimeBoat() - pier.getTimePassenger();
        }
        middleTime = sumPier/piers.size();
        return middleTime;
    }

    public static void initData() {
        piers.add(new Pier(1, 12.5, 15.6, true));
        piers.add(new Pier(2, 2.5, 18.6, false));
        piers.add(new Pier(3, 0.5, 3.6, true));
    }
}
