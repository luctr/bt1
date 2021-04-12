public class NhanVienFulltime extends NhanVien {
    private long bonus;
    private long fine;
    private long hardSalary;

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public long getFine() {
        return fine;
    }

    public void setFine(long fine) {
        this.fine = fine;
    }

    public long getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(long hardSalary) {
        this.hardSalary = hardSalary;
    }

    public NhanVienFulltime(String employeeCode, String name, int age, String phoneNumber, String email) {
        super(employeeCode, name, age, phoneNumber, email);
    }

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(String employeeCode, String name, int age, String phoneNumber, String email, long bonus, long fine, long hardSalary) {
        super(employeeCode, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }
    public int fullTimeSalary(){
      return (int) (hardSalary + (bonus - fine));
    }

    @Override
    public String toString() {
        return "nhân viên không đạt :" +getName();
    }
}
