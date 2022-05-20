import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;

public class app112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenSinhVien, thongTin = null;
        double diemSinhVien;
        List<String> danhSachSinhVien = new LinkedList<String>();
        do {
            System.out.println("Nhap vao ten sinh vien: ");
            tenSinhVien = sc.nextLine();
            if (!tenSinhVien.isEmpty()) {
                System.out.println("Nhap vao diem sinh vien: ");
                diemSinhVien = sc.nextDouble();
                thongTin = tenSinhVien + "\t" + diemSinhVien;
                danhSachSinhVien.add(thongTin);
            }
        } while (!tenSinhVien.isEmpty());
        System.out.println("So sinh vien co trong danh sach = " + danhSachSinhVien.size());
        System.out.println("Thong tin cac sinh vien vua nhap la: ");
        System.out.println("Ten sinh vien" + "\t" + "diem: ");
        Iterator<String> iterator = danhSachSinhVien.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // luu tru ds
        List<String> danhSachSinhVienThiLai = new LinkedList<String>();
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            String sv = danhSachSinhVien.get(i);
        }
        for (int i = 0; i < danhSachSinhVien.size(); i++) {

        }
    }
}