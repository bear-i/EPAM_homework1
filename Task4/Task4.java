/*
Алгоритм
1. НОД(0, n) = n; НОД(m, 0) = m;
2. Если m, n чётные, тогда НОД(m, n) = 2 * НОД(m / 2, n / 2).
3. Если m чётное, тогда НОД(m, n) = НОД(m / 2, n).
4. Если n чётное, тогда НОД(m, n) = НОД(m, n / 2).
5. Если m, n нечётные и m > n, тогда НОД(m, n) = НОД(m - n, n).
6. Если m, n нечётные и m < n, тогда НОД(m, n) = НОД(n - m, m).
7. Если m = n, тогда НОД(m, n) = m;
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        int number1;
        int number2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your first number");
            number1 = Integer.parseInt(br.readLine());
            System.out.println("Enter your second number");
            number2 = Integer.parseInt(br.readLine());
            System.out.println(findNod(number1, number2));
        } catch (IOException e) {
            System.out.println("Input error: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }
    }

    public static int findNod(int a, int b) {
        if (a == 0 || b == 0) {
            return a | b;
        }
        if ((a & b) == a) {
            return a;
        }
        if ((a & 1) == 0) {
            return ((b & 1) == 0) ? findNod(a >> 1, b >> 1) << 1 : findNod(a >> 1, b);
        } else {
            return ((b & 1) == 0) ? findNod(a, b >> 1) : findNod(b, (a > b) ? a - b : b - a);
        }
    }
}
