package tech.meliora.betterprogrammer.ch1leftrotate.kamochu;

import java.util.ArrayList;
import java.util.List;

public class LeftRotate1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(rotLeft(list, 5));

    }

    /**
     * Advantage:
     * loops d*2 times only (less than once)
     *
     * may be heavy on memory - shifting data in array may not be very optimal
     *
     * @param a
     * @param d
     * @return
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {

        int n = a.size();

        for (int i = 0; i < d; i++) {
            int temp1 = a.get(i);
            a.add(temp1);
        }

        for (int i = 0; i < d; i++) {
            a.remove(0);
        }

        return a;
    }

}
