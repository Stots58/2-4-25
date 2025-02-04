// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
    // word word word word(Word[] word)
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        


        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        System.out.println("Looping from 1.0 to 5.0 with rounding methods: ");
        for (double i = 1.0; i <= 5.0; i = i + 0.5){
            //    - Print the number
            System.out.println("Number: " + i + " Ceil: " + Math.ceil(i) + " Floor: " + Math.floor(i) + " Rint: " + Math.rint(i) + " Round: " + Math.round(i));
            //    - Apply and print results of:
            //      - Math.ceil()
            //      - Math.floor()
            //      - Math.rint()
            //      - Math.round()
        }
        


        System.out.print("\n");
        // 2. Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number.: ");
        //    - Store the number
        double decNum = scanner.nextDouble(); 
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.println("Ceil: " + Math.ceil(decNum) + " Floor: " + Math.floor(decNum) + " Rint: " + Math.rint(decNum) + " Round: " + Math.round(decNum));
        


        System.out.print("\n");
        // 3. Prompt the user to enter an integer
        System.out.print("Enter a integer.: ");
        //    - Store the integer
        int num = scanner.nextInt();
        //    - Prompt the user to enter a string
        System.out.print("Enter a word.: ");
        //    - Store the string
        String userSTR = scanner.next();
        //    - Print the entered integer and string
        System.out.println("You entered integer: " + num);
        System.out.println("You entered string: " + userSTR);
        


        System.out.print("\n");
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        double changeToDouble = num;
        System.out.println("Implicit cast (int -> double): " + changeToDouble);
        //    - Convert the decimal number to int (explicit cast) and print
        int changeToINT = (int)decNum;
        System.out.println("Explicit cast (double -> int): " + changeToINT);
        //    - Convert the integer to a char (ASCII representation) and print
        char chnageToChar = (char)num;
        System.out.println("Casting int to char (ASCII): " + chnageToChar);
        


        System.out.print("\n");
        // 5. Prompt the user to enter a character
        System.out.print("Enter a character.: ");
        //    - Store the character
        char userChar = scanner.next().charAt(0);
        //    - Convert the character to its ASCII value (int) and print
        int changeCharToINT = (int)userChar;
        System.out.println("ASCII value of " + "'" + userChar + "'" + " is: " + changeCharToINT);
        


        System.out.print("\n");
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        String literal1 = "test1";
        String literal2 = "test1";
        //    - Create another String using new String()
        String newString =  new String("test1");
        //    - Compare the first two strings using == (reference check)
        System.out.print("String Comparisons: \n");
        System.out.println("str1 == str2: " + (literal1 == literal2));
        //    - Compare one literal with the new String() object using ==
        System.out.println("str1 == str3: " + (literal1 == newString));
        //    - Compare the content of both strings using .equals()
        System.out.println("str1.equals(str3):" + (literal1.equals(newString)));
        //    - Print the results
        


        // Close the Scanner object
        scanner.close();
    }
}
