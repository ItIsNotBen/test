import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1.
        int miniPasswordLength = 8;


        // 2.

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter password:");
        String password;
        password = userInput.nextLine();


        // 3.
        if (password.length() < 8) {
            System.out.println("Too short!");
        }

        // 4.

        int[] array = {1, 2, 4, 5, 7, 8, 9 ,10, 11 ,12 ,13,14, 15, 16, 17, 18, 19, 20, 21, 22, 23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,4243,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73};

        for(int i = 0; i <= array.length; i++) {
            int sum;
            sum = array[i] + array[i + 1];
            i++;

            System.out.println(sum);
        }

        // 5.

        int[][] ints = {{7, 8, 9 }, {4, 5 ,6}, {1, 2, 3}};

        // 6.

        for (int j = 0; j <= ints.length; j++) {
            for (int k = 0; k < ints[j].length; k++) {
                System.out.println(ints[j][k]);
            }
        }
        }
}
