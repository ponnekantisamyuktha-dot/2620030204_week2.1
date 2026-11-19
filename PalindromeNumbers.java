import java.util.Scanner;

class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 1; num < n; num++) {
            int temp = num;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (num == reverse) {
                System.out.print(num + " ");
            }
        }
    }
}