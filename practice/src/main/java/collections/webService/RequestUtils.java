package collections.webService;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Scanner;

import static collections.webService.MainRequests.requests;

public class RequestUtils {
    public static void initData() {
        requests.add(new Request("POST", 1));
        requests.add(new Request("GET", 2));
        requests.add(new Request("DELETE", 3));
        requests.add(new Request("UPDATE", 1));
    }

    public static void startRequestLoop(){
        int number;
        do {
            System.out.println(
                    "Please enter number according to the action:\n" +
                            "1- Add new request\n" +
                            "2- Sort request\n" +
                            "3- Print all requests\n" +
                            "4- Finish!\n"
            );
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            startRequestCase(number);
        } while(number != 4);
    }

    public static void startRequestCase(int number){
        switch (number) {
            case 1:
                System.out.println("Please enter new request");
                addRequest();
                break;
            case 2:
                sortRequest();
                break;
            case 3:
                print();
                break;
            case 4:
                System.out.println("Finish!");
                break;
            default:
                System.out.println("Please select number from 1-4");
                break;
        }
    }

    public static void addRequest(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter method");
        String method = scan.nextLine();
        System.out.println("Enter priority");
        int priority = scan.nextInt();
        requests.add(new Request(method, priority));
    }

    public static void sortRequest(){
        DemoComparator comparator = DemoComparator.getInstance();
        Collections.sort(requests, comparator);
        System.out.println("The time of sorting");
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }

    public static void print(){
        for (Request request : requests){
            System.out.println(request);
        }
    }
}
