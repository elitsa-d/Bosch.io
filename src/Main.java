import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Second task
        User user1 = new User("UserName1", 2000, "Varna");
        User user2 = new User("UserName1", 2000, "Varna"); // not added to the set

        Set<User> users = new HashSet<>();
        System.out.println("Are user1 and user2 equal: " + user1.equals(user2));

        users.add(user1);
        users.add(user2);

        System.out.println(users.size() == 2);

        User user3 = new User("IAmUnique", 2000, "Varna");
        User user4 = new User("IAmUnique", 1999, "Sofia"); // not added to the set
        users.add(user3);
        users.add(user4);
        System.out.println(users.size());


        // Fourth task
        int[] array = { 7, 9, 5, 8, 3, 4, 6 };

        MergeSort.mergeSort(array, 0, 5);
        printArray(array);

        System.out.println(BinarySearch.search(array, 9));
        // System.out.println(BinarySearch.search(array, 4));
        // System.out.println(BinarySearch.search(array, 100));
        // System.out.println(BinarySearch.search(array, -3));
    }
}
