package OOP;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        //Class Object có tham chiếu
        Student student1 = new Student();
        student1.inputInfor();
        student1.displayInfor();

        //No Tham Chiếu
        NoThamChieu noThamChieu = new NoThamChieu();
        noThamChieu.fact(5);


    }
}
