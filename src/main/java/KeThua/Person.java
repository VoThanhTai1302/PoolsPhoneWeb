package KeThua;

public class Person {
    int maSV;
    String tenSV;
    int ageSV;

    public Person(int maSV, String tenSV, int ageSV){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ageSV = ageSV;
    }

    public void getInfor(){
        System.out.println("Mã SV: " + " " + this.maSV);
        System.out.println("Tên SV: " +  " " + this.tenSV);
        System.out.println("Age SV: " + " " + this.ageSV);
    }
}
