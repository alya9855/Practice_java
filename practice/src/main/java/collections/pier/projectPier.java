package collections.pier;

import java.util.ArrayList;

public class projectPier {
    static ArrayList<Pier> piers = new ArrayList<>();

    public static void main(String[] args) {
        PierUtils.initData();
        System.out.println(PierUtils.middleTimeOnStop());
    }

}
