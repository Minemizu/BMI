import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("身長を入力してください");
            double n = sc.nextDouble();
            System.out.println("体重を入力してください");
            double a = sc.nextDouble();
            double b = a / (n * n);
            System.out.println("あなたのBMIは" + String.format("%.2f", b));
        }
    }
}
