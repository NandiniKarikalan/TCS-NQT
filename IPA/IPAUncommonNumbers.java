package IPA;

import java.util.*;

public class IPAUncommonNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }
        for (Integer i : list1) {
            if (list2.contains(i))
                continue;
            res.add(i);
        }
        System.out.println(res);
        sc.close();
    }
}

/* Take two set of numbers of two specific lengths A and B.
 * Find those numbers of set A which are not in set B.
 * 
 * Input 
 * ----------------------
 * 8                  <-------------- Lenght of set A
 * 5                  <-------------- Length of set B
 * 2 5 8 9 4 6 1 7    <-------------- set A
 * 1 5 3 8 4          <-------------- set B
 * 
 * Output
 * ----------------------
 * 2 9 6 7            <-------------- elements of A not in B
 */