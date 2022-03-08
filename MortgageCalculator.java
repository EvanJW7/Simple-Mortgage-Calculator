import java.text.NumberFormat;
import java.util.Scanner;
class Mortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("House sale price: ");
        int sale_price = scanner.nextInt();
        System.out.print("Down payment: ");
        int down_payment = scanner.nextInt();
        System.out.print("Interest rate: ");
        double interest_rate = scanner.nextDouble();
        System.out.print("Loan Years: ");
        int loan_years = scanner.nextInt();
        int n = loan_years * 12;
        double r = interest_rate/100;
        int P = sale_price - down_payment;
        double x = r * Math.pow(1+r, n);
        double y = Math.pow(1+r, n) - 1;
        NumberFormat M = NumberFormat.getCurrencyInstance();
        String Mortgage = M.format(P*(x/y));
        System.out.print("Monthly Mortgage Payment: " +Mortgage);
    }
}
