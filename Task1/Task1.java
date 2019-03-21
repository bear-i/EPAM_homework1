import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        String number = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (number == null) {
                System.out.println("Enter your number in binary format");
                number = br.readLine();
            }
            System.out.println(bin2dec(number));
        } catch (IOException e) {
            System.out.println("Input error: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }
    }

    private static int bin2dec(String number) throws NumberFormatException {
        int result = 0;
        int exp = number.length() - 1;
        int bit;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                bit = 1;
            } else if (number.charAt(i) == '0') {
                bit = 0;
            } else {
                throw new NumberFormatException();
            }
            result += Math.pow(2, exp) * bit;
            exp--;
        }
        return result;
    }
}
