import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class app113 {
    public static void main(String[] args) {
        String fruitName;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSetFruits = new HashSet<String>();
        System.out.println("Nhap so phan tu cua hashSetFruits: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("Nhap ten loai trai cay thu " + i + ":");
            fruitName = sc.nextLine();
            hashSetFruits.add(fruitName);
        }
        System.out.println("So phan tu cua hashSetFruits = " + hashSetFruits.size());

        System.out.println("Nhap ten loai trai cay can tim: ");
        String fruitSearch = sc.nextLine();
        if (hashSetFruits.contains(fruitSearch)) {
            System.out.println("Co trai cay " + fruitSearch + " trong hashSetFruits");
        } else {
            System.out.println("Khong tim thay " + fruitSearch);
        }
        // xoa 1 loai
        System.out.println("Nhap vao ten loai trai cay can xoa: ");
        String fruitDelete = sc.nextLine();
        if (hashSetFruits.contains(fruitSearch)) {
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetFruits: " + hashSetFruits);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
        // tạo 1 List mới
        List<String> listFruits = new ArrayList<>();
        listFruits.add("Apricot");
        listFruits.add("Cherry");
        listFruits.add("Plum");
        listFruits.add("Strawberry");
        listFruits.add("Apricot");
        hashSetFruits.addAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi them: ");
        Iterator<String> iterator = hashSetFruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }

        hashSetFruits.removeAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi xoa: " + hashSetFruits);
    }
}