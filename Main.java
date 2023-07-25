import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // 1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
        for(int i = 1; i <= 100; i++){
            if( i % 3 == 0){
                System.out.println("Fizz");
            }else if( i % 5 == 0){
                System.out.println("Buzz");
            }else if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else {
                System.out.println("invalid");
            }
        }

        //2.Write a Java program to reverse a string.

        System.out.println("Enter String: ");
        String str = S.nextLine();
        String rev = " ";
        for ( int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        //3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        System.out.println("Enter Number: ");
        int num = S.nextInt();
        if ( num > 0){
            for(int i= 1 ; i <= 10; i++){
            int mult = num * i;
                System.out.println(num + " * " + i + " = " + mult);
            }
        }else {
            System.out.println("invalid");
        }


        //4.Write a program to find the factorial value of any number entered through the keyboard.
        System.out.println("Enter number: ");
        int N = S.nextInt();
        System.out.println("Number: " + N);
        int fac=1;
        for (int i=1; i<=N; i++){
            fac = fac * i; //
        }
        System.out.println("total: " + fac);


        //5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.println("Enter first number: ");
        int Number = S.nextInt();
        System.out.println("Enter second number: ");
        int pow = S.nextInt();

        int res = 1;
        for (int i=1; i <= pow; i++){
            res = res * Number;
        }
        System.out.println(res);

        // 6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        System.out.println("Enter number: ");
        int N1 = S.nextInt();
        int even=0;
        int odd=0;
        for(int i=1; i<=N1; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                even = even + i;
            }else if (i % 2 ==1){
                odd = odd + i;
            }
        }
        System.out.println("Sum Even: " + even);
        System.out.println("Sum odd: " + odd);


        //7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        System.out.println("Enter number: ");
        int Num = S.nextInt();
        boolean NumPrime = true;
        for (int i = 2; i <= Num / 2; i++) {
            if (Num % i == 0) {
                NumPrime = false;
                break;
            }
        }
        if (NumPrime) {
            System.out.println(Num + " >> prime");
        } else {
            System.out.println(Num + " >> not prime");
        }

        //8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        int posCount = 0;
        int negCount = 0;
        int zerCount = 0;

        System.out.println("Enter number: ");
        for (int i=0; i<10; i++){
            int eNumber = S.nextInt();
            if(eNumber>0){
                posCount = posCount + 1;
            }else if(eNumber<0){
                negCount = negCount + 1;
            }else {
                zerCount = zerCount + 1;
            }
        }
        System.out.println("Positive Number: " + posCount);
        System.out.println("Negative Number: " + negCount);
        System.out.println("Zeros Number: " + zerCount);


        //9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        for ( int i = 1; i<=4; i++){
            System.out.println("Week " + i);
            for ( int j = 1; j<=7; j++){
                System.out.println("Day " + j);
            }
        }

        //10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
        System.out.println("Enter String: ");
        String string = S.nextLine();
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
       System.out.println( "Reverse String: " + reverse );
            if (string.equals(reverse)) {
                System.out.println("String: " + string + " is palindrome");
            } else {
                System.out.println("String: " + string + " is not palindrome");

        }
    }}
