package Video_questions.BItwiseOperators_NumberSystem;
//Every number is appearing thrice except one number find that number[Repeating odd number of times]
public class Q8 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3, 2, 4, 2, 3, 4, 1, 5, 6, 1, 4, 5};

        int result = 0;

        // Go through all 32 bits of an integer
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;
            for (int num : arr) {
                // Check if the ith bit is set in num
                if ((num & (1 << i)) != 0) {
                    bitSum++;
                }
            }
            // If bitSum % 3 != 0, this bit is part of the unique number
            if (bitSum % 3 != 0) {
                result |= (1 << i);
            }
        }

        System.out.println("The number that appears only once is: " + result);
    }
}

