package OOP;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        //Class Object có tham chiếu
//        Student student1 = new Student();
//        student1.inputInfor();
//        student1.displayInfor();
//
//        //No Tham Chiếu
//        NoThamChieu noThamChieu = new NoThamChieu();
//        noThamChieu.fact(5);
//

        Static a = new Static("Chau", 21, 1.7f);
        System.out.println("University (from class):" + a.universityName);
        System.out.println("University (from instance):" + a.universityName);
        a.display();
        System.out.println("Total (from class):" + a.total);
        Static b = new Static("Long", 24, 1.7f);
        System.out.println("Total (from instance):" + b.total);

    }
}
