import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        System.out.println("Задача 1 =======================================");
        String [] arr = {"0", "1", "2", "3", "4", "5", "6", "7"};
        printScreen (arr);
        printScreen(changeElements(arr,6, 7));

        System.out.println("Задача 2 =======================================");
        //   не могу понять почему не работает строчка:
        //   List arrayList = new ArrayList<>(Arrays.asList(arr));
        ArrayList arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.print(arrayList);
    }

    public static String [] changeElements (String arr[], int element1, int element2){
        String buffer = arr[element1];
        arr[element1] = arr[element2];
        arr[element2] = buffer;
        return arr;
    }

    public static void printScreen(String arr[]){
        for (String a: arr) {
            System.out.print(a + ", ");
        }
        System.out.println("");
    }

}
