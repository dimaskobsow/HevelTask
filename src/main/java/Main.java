import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:  ");
        String text = in.nextLine();

        try {
            StringBuffer stringBuffer = new StringBuffer(text);
            test(new StringBuffer(text));
            System.out.println(stringBuffer.reverse());
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }

    }



    public static void test(Appendable obj) throws java.io.IOException {

        long before1 = System.currentTimeMillis();
        for (int i = 0; i++ < 1000; ) {
            obj.append("");
        }
        long after1 = System.currentTimeMillis();
        long before2 = System.currentTimeMillis();
        for (int i = 0; i++ < 10000; ) {
            obj.append("");
        }
        long after2 = System.currentTimeMillis();
        long before3 = System.currentTimeMillis();
        for (int i = 0; i++ < 100000; ) {
            obj.append("");
        }
        long after3 = System.currentTimeMillis();
        System.out.println(  ": " + (after1 - before1) + "ms.");
        System.out.println(  ": " + (after2 - before2) + "ms.");
        System.out.println(  ": " + (after3 - before3) + "ms.");


    }









}
