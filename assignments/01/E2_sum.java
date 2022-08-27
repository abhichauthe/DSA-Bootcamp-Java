// Take two numbers and print the sum of both.
/* 
 * Logic
 * a + b = result
 */

import java.util.Scanner;

class E2_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Result of two numbers is : " + (num1 + num2));
        sc.close();
    }
}