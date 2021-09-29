import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    
    // Assuming d =1 
    
    // if arr = [1,2,3] => [2,3,1]
    // 0 -> 2
    // 1 -> 0 [pos - 1]
    // 2 -> 1 [pos -1]
    
    // assume d =1
    
        for (int shift = 1; shift <= d; shift++) {
            int first = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                int expected = arr.get(i);
                arr.set(i - 1, expected);
            }
//
            arr.set(arr.size() - 1, first);
        }
//

        return arr;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}




/**
 * Results: Failed test 8 and 9
 * Time limit exceeded
Your code did not execute within the time limits. Please optimize your code. For more information on execution time limits, refer to the environment page
 */