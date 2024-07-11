package Annotation.Entends;

import org.testng.annotations.*;

public class TestManager extends AnnotationExtends{
    //Kế thừa nhưng vẫn sắp xếp theo đúng quy tắc(Suite -> Test -> Group -> Class -> Method)
    @BeforeClass
    public void beforeChildClass() {
        System.out.println("Child Before Class method");
    }

    @AfterClass
    public void afterChildClass() {
        System.out.println("Child After Class method");
    }

    @BeforeMethod
    public void beforeChildMethod() {
        System.out.println("Child Before method");
    }

    @AfterMethod
    public void afterChildMethod() {
        System.out.println("Child After method");
    }

    @Test
    public void testMethod() {
        System.out.println("Test method under TestClass");
    }
}
