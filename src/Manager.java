import java.util.Scanner;

public class Manager {
    private NhanVien[] lists;

    public NhanVien[] getLists() {
        return lists;
    }

    public void setLists(NhanVien[] lists) {
        this.lists = lists;
    }

    public Manager(NhanVien[] lists) {
        this.lists = lists;
    }

    public NhanVien getNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. nhân viên fullTime");
        System.out.println("2. nhân viên partTime");
        int a = sc.nextInt();
        sc.nextLine();
        if (a == 2) {
            return createNhanVienPartTime();
        } else {
            return createNhanVienFulltime();
        }


    }

        private NhanVienParttime createNhanVienPartTime() {
        Scanner sc = new Scanner(System.in);
        NhanVienParttime nhanVien = new NhanVienParttime();
        System.out.println("nhập mã nhân viên :");
        String employeeCode = sc.nextLine();
        nhanVien.setEmployeeCode(employeeCode);
        System.out.println("Tên nhân viên :");
        String name = sc.nextLine();
        nhanVien.setName(name);
        System.out.println("tuổi :");
        int age = sc.nextInt();
        nhanVien.setAge(age);
        System.out.println("số điện thoại");
        String phoneNumber = sc.nextLine();
        nhanVien.setPhoneNumber(phoneNumber);
        sc.nextLine();
        System.out.println("Email :");
        String email = sc.nextLine();
        nhanVien.setEmail(email);
        System.out.println("nhập số giờ làm : ");
        int workTime = sc.nextInt();
        nhanVien.setWorkTime(workTime);
        return nhanVien;
    }

    private NhanVienFulltime createNhanVienFulltime() {
        Scanner sc = new Scanner(System.in);
        NhanVienFulltime nhanVien = new NhanVienFulltime();
        System.out.println("nhập mã nhân viên :");
        String employeeCode = sc.nextLine();
        nhanVien.setEmployeeCode(employeeCode);
        System.out.println("Tên nhân viên :");
        String name = sc.nextLine();
        nhanVien.setName(name);
        System.out.println("tuổi :");
        int age = sc.nextInt();
        nhanVien.setAge(age);
        System.out.println("số điện thoại");
        String phoneNumber = sc.nextLine();
        nhanVien.setPhoneNumber(phoneNumber);
        sc.nextLine();
        System.out.println("Email :");
        String email = sc.nextLine();
        nhanVien.setEmail(email);
        System.out.println("Tiền thưởng :");
        int bonus = sc.nextInt();
        nhanVien.setBonus(bonus);
        System.out.println("Tiền phạt :");
        int fine = sc.nextInt();
        nhanVien.setFine(fine);
        System.out.println("lương cứng :");
        int hardSalary = sc.nextInt();
        nhanVien.setHardSalary(hardSalary);
        return nhanVien;
    }

    public int getAvgSalary() {
        int total = 0;
        int count = 0;
        for (NhanVien nv : lists) {
            if (nv instanceof NhanVienFulltime) {
                total += ((NhanVienFulltime) nv).fullTimeSalary();
                count++;
            }
        }
        if (count == 0){
            System.out.print("không có nhân viên fullTime nào :");
            return 0;
        }
        return total / count;
    }
    public int getPartTimeSalary(){
        int total = 0;
        for (NhanVien nv : lists){
            if (nv instanceof NhanVienParttime){
                total += ((NhanVienParttime) nv).salaryPartTime();
            }
        }
        System.out.println("tổng lương của nhân viên phải trả là :" + total);
        return total;
    }
}
