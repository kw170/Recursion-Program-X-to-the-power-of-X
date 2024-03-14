import java.util.Scanner;
public class Main {
    public static int power(int base, int power){
        if(power == 0){
            return 1;
        }
        return base * power(base, power - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();
        System.out.println(power(num, num));
    }
}