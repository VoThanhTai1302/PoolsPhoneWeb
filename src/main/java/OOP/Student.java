package OOP;

import java.util.Scanner;

public class Student {

    int maSV;
    String tenSV;
    int ageSV;

    public void Student() {

    }
    //Khai bao
//    public Student(int maSV, String tenSV, int ageSV) {
//        this.maSV = maSV;
//        this.tenSV = tenSV;
//        this.ageSV = ageSV;
//    }

    public int getMaSVSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }


    public int getAgeSV() {
        return ageSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTenSVSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setAgeSV(int ageSV) {
        this.ageSV = ageSV;
    }

    @Override
    public String toString() {
        return "Thông tin SV" + "\n" + "Mã Số: " + maSV + " " + "Tên SV: " + tenSV + " " + "Age Sv: " + ageSV;
    }

    public void displayInfor() {
        System.out.println("Danh sách sinh viên" + "\n" + "-Mã Số:" + maSV + "\n-Tên SV: " + tenSV + " " + "\n- Age Sv: " + ageSV + "\n");
    }

    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập sinh viên: \n");
        System.out.println("Mã SV: ");
         maSV = scanner.nextInt();
        System.out.println("\nTên SV: ");
         tenSV = scanner.next();
        System.out.println("\nAge SV: ");
         ageSV = scanner.nextInt();

    }

}
