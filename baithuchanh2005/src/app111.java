
    import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class app111 {
    public static void main(String[] args) {
        List<Integer> ListInteger = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float averg = 0f;
        int number;
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        // nhập và thêm phần tử
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            ListInteger.add(number);
        }
        int count = 0;
        for (int i = 0; i < ListInteger.size(); i++) {
            if (ListInteger.get(i) % 2 == 0) {
                sum += ListInteger.get(i);
                count++;
            }
        }
        averg = (float) sum / count;

        System.out.println("Trung binh cong la = " + averg);

    }

}

