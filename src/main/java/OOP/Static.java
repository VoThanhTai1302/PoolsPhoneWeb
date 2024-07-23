package OOP;

public class Static {
    public String name;
    public int age;
    public float height;

    String universityName = "Kteam Education";
    public static int total = 0;

    public Static(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    public void display() {
        System.out.println("Thông tin sinh viên: " + "\nName: "+name + "\n Age: "+age + "\n Height: "+height);
    }


}
