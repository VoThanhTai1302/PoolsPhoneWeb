package OOP;

public class NoThamChieu {

    void fact(int n) {
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *=  i;

        }
        System.out.println("Giai thừa của " + n + " là: " + giaithua);
    }
}
