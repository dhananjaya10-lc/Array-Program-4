import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 5, 8, 9, 3, 1};

        Set<Integer> set = new HashSet<>();

        for (int n : arr1)
            set.add(n);

        System.out.print("Common Elements: ");

        for (int n : arr2) {
            if (set.contains(n))
                System.out.print(n + " ");
        }
    }
}