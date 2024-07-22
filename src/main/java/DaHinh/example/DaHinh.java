package DaHinh.example;


class Cond {
    public void Cond() {
        System.out.println("Cond...");
    }
}

class Cha extends Cond {
    public void Cha() {
        System.out.println("Cha...");
    }
}


public class DaHinh {
    public static void main(String[] args) {
        Cha cha = new Cha();
        Cond cond = cha;
        Cond cond1 = cha;

        cha.Cha();
        cha.Cond();
        cond.Cond();
        cond1.Cond();

    }
}