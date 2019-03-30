import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Process {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void input(int array[],int size)throws IOException {

        System.out.println("Enter nummbers in the array");

        for(int i = 0 ; i < size ; i ++){

            array[i] = Integer.parseInt(br.readLine());

        }

        // == Use merge Sort in your case == //
        Arrays.sort(array);

    }

    // == Function to get the mode in a given array == //
    public void getMode(int array[]){

        // == Set current Element to 1st element in the array and counter to 1 == //
        int currentElement = array[0];
        int counter = 1;

        // == using an arraylist since there could be more then one element having max repeats == //
        ArrayList<Integer> element = new ArrayList<>();
        int maxCount = 0;
       // int listPointer = 0;

        // == Loop through the list == //
        for (int i = 1 ; i < array.length ; i++){

            if( currentElement == array[i] ){

                 counter++;
            }
            else{

                currentElement = array[i];
                counter = 1;

            }

            if(maxCount <= counter) {

                // == if maxCount less then counter then erase all entries in element arraylist == //
                if(maxCount < counter) {
                    element.clear();
                    maxCount = counter;
                }

                // == if maxCount equals to the counter then add number to the element arraylist == //
                if(maxCount == counter)
                element.add(array[i]);

            }

        }

        // == Print the max repeating elements == //
        System.out.print("Element/s ");
        for( int i = 0 ; i < element.size(); i++){
            System.out.print(element.get(i) + ", ");
        }
        System.out.println(" were repeated "+maxCount);

    }
}
