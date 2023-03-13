package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(120);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        // arrayList.clear();
        System.out.println(arrayList);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        arrayList.addAll(integers);
        System.out.println(arrayList);

        for (Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("------");

        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Tesla");
        strArr.add("AWS");
        strArr.add("Apple");

        if (strArr.contains("Tesla")) {
            System.out.println("Tesla found");
        } else {
            System.out.println("No EV");
        }
        int indexOfApple = strArr.indexOf("Apple");
        System.out.println("Index of apple " + indexOfApple);

        List<Long> longList = new ArrayList<>(Arrays.asList(10L, -4L));

        List<String> weekdays = Arrays.asList("Monday", "Tuesday");
        // weekdays.add("Sunday");
        for (String s : weekdays) {
            System.out.println(s);
        }

        

    }

}
