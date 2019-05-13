package season_2.TimKiemTrongMang;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        String[] student = {"Dung", "Ha", "Hao", "Tung"};
        System.out.println("nhập tên cần tìm: ");
        Scanner name = new Scanner(System.in);
        String inputname = name.nextLine();
        boolean check = true;
        for(int i=0;i<student.length;i++){
            if (student[i].equals(inputname)){
                System.out.println("Vị trí của học sinh nhap vào là: "+(i+1));
                check = true;
            }
        }
        if (check!=true){
            System.out.println("Không tìm thấy học sinh đó.");
        }
    }
}
