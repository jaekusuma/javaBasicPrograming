import java.util.HashSet;
import java.util.Set;

public class findingDuplicateArrayInteger {
    private static void findDuplicationNumber(int[] numbers){
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < numbers.length; i++){
            for (int j = 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j] && i != j) {
                    duplicate.add(numbers[j]);
                }
            }
        }
        System.out.println(duplicate);
    }


    public static void main(String[] args) {
        int[] input1 = {1,1};
        findDuplicationNumber(input1);      // output : [1]
        int[] input2 = {1,2,3,4};
        findDuplicationNumber(input2);      // output : []
        int[] input3 = {1,2,1,2,2,3,4,5,5,5,5};
        findDuplicationNumber(input3);      // output : [1, 2, 5]
    }
}