import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        int currentNumber = n;

        for (int row = 1; row <= n; row++) {
            int leftNumber = n;
            int rightNumber = currentNumber + 1;

            for (int column = 1; column <= n; column++) {
                if ((column >= row && column <= (n - row + 1) && row <= (n / 2)) ||
                    (column >= (n - row + 1) && column <= row && row > (n / 2))
                    ) {
                    System.out.print(currentNumber);
                } else if (column < row) {
                    System.out.print(leftNumber);
                    leftNumber--;
                } else {
                    System.out.print(rightNumber);
                    rightNumber++;
                }
            }

            if (row < (n / 2)) {
                currentNumber--;
            }

            if (row > (n / 2)) {
                currentNumber++;
            }

            System.out.println();
        }
    }
}
