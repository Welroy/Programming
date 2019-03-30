import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Process p = new Process();

        System.out.println("Enter the size of array");
        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];

        p.input(array,size);
        p.getMode(array);

    }
}
