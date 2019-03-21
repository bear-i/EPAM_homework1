import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) {
        int number = 0;
        int pos;
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your number");
            number = Integer.parseInt(br.readLine());
            System.out.println("Enter position of bit to invert");
            pos = Integer.parseInt(br.readLine());
            result = bitInvert(number, pos);
            System.out.println(number + "-->" + Integer.toBinaryString(number) + "-->" + Integer.toBinaryString(result) + "-->" + result);
        } catch (IOException e) {
            System.out.println("Input Error");
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }
    }

    private static int bitInvert(int b, int pos) {
        int result = 0;
        int mask = 1 << pos;
        return result = b ^= mask;
    }
}
