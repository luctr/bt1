import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tổng số  nhân viên: ");
        int tongNhanVien = scanner.nextInt();
        NhanVien[] nv = new NhanVien[tongNhanVien];
        Manager manager = new Manager(nv);

        for (int i = 0; i < tongNhanVien; i++) {
            manager.getLists()[i] = manager.getNhanVien();
        }

//    nhan vien co muc luong thap hon muc luong trung binh cua toan bo
        for (int i = 0; i < manager.getLists().length; i++) {
            if (manager.getLists()[i] instanceof NhanVienFulltime) {
                NhanVienFulltime n = (NhanVienFulltime) manager.getLists()[i];
                if (n.fullTimeSalary() < manager.getAvgSalary()) {
                    System.out.println(n.toString());
                }if (n.fullTimeSalary() < manager.getAvgSalary()){
                    System.out.println(manager.getLists()[i] + " nhân viên có lương thấp hơn trung bình");
                }
            } else {
                NhanVienParttime na = (NhanVienParttime) manager.getLists()[i];
                if (na.salaryPartTime() < manager.getPartTimeSalary()) {
                    System.out.println(na.toString());
                }
            }
        }

    }
}
