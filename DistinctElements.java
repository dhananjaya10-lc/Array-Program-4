import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 5, 8, 9, 3, 1};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : arr1) set1.add(n);
        for (int n : arr2) set2.add(n);

        System.out.print("Distinct Elements: ");

        for (int n : arr1) {
            if (!set2.contains(n))
                System.out.print(n + " ");
        }

        for (int n : arr2) {
            if (!set1.contains(n))
                System.out.print(n + " ");
        }
    }
}