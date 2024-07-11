package Annotation;

import org.testng.annotations.Test;

public class DoUuTien_Annotation {


    @Test(priority = 1)
    public void so1() {
        System.out.println("Số 1 ");
    }

    @Test(priority = 0)
    public void so0() {
        System.out.println("Số 0 ");
    }

    @Test(priority = 2)
    public void so2() {
        System.out.println("Số 2 ");
    }
}
