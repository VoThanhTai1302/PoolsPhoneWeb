package KeThua;

public class Student extends Person{

    public Student(int maSV, String tenSV, int ageSV)
    {
        super(maSV, tenSV, ageSV);
        this.ageSV = ageSV;
    }

    public void getInfor()
    {
        super.getInfor();
        System.out.println("Age SV: " + this.ageSV);
    }
}
