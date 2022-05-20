import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class app110 {
    private static final List arrayList = null;

    public static void main(String[] args) {
        ArrayList<Integer> arrListIntegers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap cac phan tu cua mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            number = sc.nextInt();
            arrListIntegers.add(number);
        }
        int max = arrListIntegers.get(0);
        for (int i = 1; i < arrListIntegers.size(); i++) {
            if (arrListIntegers.get(i).compareTo(max) > 0) {
                max = arrListIntegers.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mang = " + max);
        System.out.println("Nhap vao mot so nguyen bat ky : ");
        int number1 = sc.nextInt();

        for (int i = 0; i >= arrListIntegers.size(); i++) {
            if (arrListIntegers.get(i).compareTo(number1) != 0) {
                arrListIntegers.remove(i);
            }
        }
        System.out.println("Hien thi phan tu cua mang: ");
        System.out.println(arrListIntegers);

        Collections.sort(arrayList);
        System.out.println("Day so da duoc sap xep la: ");
        System.out.println(arrListIntegers);
    }
}