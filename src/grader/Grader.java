/*
Author: Amir Saad
This program grades the inputted data
*/

package grader;

import java.util.Scanner;

public class Grader {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qright = 0, count = 1, answer;
        double percent;

        System.out.print("Enter the answers separated by spaces: ");
        String data = input.nextLine();
        //Read the entire line

        String tmpDataArray[] = data.split(" ");
        //Place all contents separated by a space in array

        int[] quizkey = new int[tmpDataArray.length];
        //Create key array based on the amount of answers inputted

        for (int i = 0; i < quizkey.length; i++) {
            quizkey[i] = Integer.parseInt(tmpDataArray[i]);
            //Enter values from tempdata array and parse from String to integers into key array
        }
        
        int totanswers = quizkey.length;

        for (int i = 0; i < quizkey.length; i++) {
            System.out.print("Enter the answer for question " + count + ": ");
            answer = input.nextInt();

            if (answer == quizkey[i]) {
                qright++;
            }

            count++;
            //Prompt user to enter answers and compare to key array
        }

        percent = (qright / totanswers);

        System.out.println("Total questions right: " + qright);
        System.out.println("Percentage correct: " + percent);
        //Display values to the console

    }
}

