import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng 1:");
        int size1 = sc.nextInt();
        System.out.println("nhập độ dài mảng 2:");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random()*100);
        }
        System.out.println("Mang 1 là: ");
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random()*100);
        }
        System.out.println("Mang 2 là: ");
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < size1; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            arr[size1+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
