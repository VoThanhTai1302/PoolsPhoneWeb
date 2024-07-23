package DongGoi;

public class Main {
    public static void main(String[] args) {

        //Kỹ thuật ẩn thông tin không liên quan và in ra thông tin có liên quan
        Student student = new Student();
        student.setName("anh Tài");
        System.out.println("Anh tài là người tốt: "  + student.getName());
    }
}
