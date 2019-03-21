import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        int number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your negative number");
            number = Integer.parseInt(br.readLine());
            System.out.println(invert(number));
        } catch (IOException e) {
            System.out.println("Input error: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }
    }

    private static int invert(int number) {
        if (number >= 0) {
            throw new NumberFormatException();
        }
        int invertedNumber = ~number + 1;
        return invertedNumber;
    }
}
