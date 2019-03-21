public class Task3 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;

        int counter = 0;
        while (b != 0) {
            b = (byte) (b << 1);
            counter++;
        }
        System.out.println("Byte has " + counter + " bits");

        counter = 0;
        while (s != 0) {
            s = (short) (s << 1);
            counter++;
        }
        System.out.println("Short has " + counter + " bits");

        counter = 0;
        while (i != 0) {
            i = i << 1;
            counter++;
        }
        System.out.println("Int has " + counter + " bits");

        counter = 0;
        while (l != 0) {
            l = l << 1;
            counter++;
        }
        System.out.println("Long has " + counter + " bits");
    }
}
