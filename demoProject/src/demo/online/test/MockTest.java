package demo.online.test;
/* IMPORTANT: Multiple classes and nested static classes are supported */

//import for Scanner and other utility classes
import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MockTest {
    public static void main(String args[] ) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        String count = s.nextLine();

        String output = s.nextLine();
        output = output.replace(" ", "");
        System.out.println(output);
    }
}
