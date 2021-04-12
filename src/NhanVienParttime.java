public class NhanVienParttime extends NhanVien {
    private int workTime;

    public NhanVienParttime(String employeeCode, String name, int age, String phoneNumber, String email) {
        super(employeeCode, name, age, phoneNumber, email);
    }

    public NhanVienParttime(String employeeCode, String name, int age, String phoneNumber, String email, int workTime) {
        super(employeeCode, name, age, phoneNumber, email);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int salaryPartTime(){
        System.out.println("lương nhân viên part time: " + workTime * 100000);
        return workTime * 100000;
    }

    public NhanVienParttime() {
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "workTime=" + workTime +
                '}';
    }
}
