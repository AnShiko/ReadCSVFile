import java.util.Scanner;

public class IPRange {


    public static String intToIp(long i) {
        return ((i >>> 24) & 0xFF) + "." +
                ((i >>> 16) & 0xFF) + "." +
                ((i >>>  8) & 0xFF) + "." +
                ((i >>> 0) & 0xFF);
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        long i1 = reader.nextLong();
        long i2 = reader.nextLong();
        reader.close();
       // int[] ip1 = new int[4];
        //ip1[0] = 192;
        //ip1[1] = 168;
        //ip1[2] = 0;
        //ip1[3] = 1;
        //int[] ip2 = new int[4];
        //ip2[0] = 192;
        //ip2[1] = 168;
        //ip2[2] = 0;
        //ip2[3] = 5;

        for (long i = ++i1; i < i2; i++) {
            String result = new String(intToIp(i));
            System.out.println(result);
        }

    }

}