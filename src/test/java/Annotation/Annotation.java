package Annotation;

import org.testng.annotations.*;

public class Annotation {

//    Nguyên tắc :
//    Bắt đầu mở(Before): Suite -> Test -> Group -> Class -> Method
//    Test: Chỉ thực hiện sau khi hết phần Before
//    Kết thúc(After): Method ->Class-> Group ->Test-> Suit
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite");

    }
    @Test
    public void Test() {
        System.out.println("Test");
    }
    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite");

    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");

    }

    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");

    }

    @BeforeGroups
    public void BeforeGroups() {
        System.out.println("BeforeGroups");

    }

    @AfterGroups
    public void AfterGroups() {
        System.out.println("AfterGroups");

    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass");

    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod");
    }


}
