import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the capital of New Zealand?");
        System.out.println("A) Canberra");
        System.out.println("B) Port Moresby");
        System.out.println("C) Wellington");
        String answer = scanner.nextLine().toUpperCase();
        if (answer.equals("C")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        // Question 2
        System.out.println("Question 2: Who painted the Mona Lisa?");
        System.out.println("A) Leonardo da Vinci");
        System.out.println("B) Pablo Picasso");
        System.out.println("C) Vincent van Gogh");
        answer = scanner.nextLine().toUpperCase();
        if (answer.equals("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        // Question 3
        System.out.println("Question 3: What is the largest planet in our solar system?");
        System.out.println("A) Jupiter");
        System.out.println("B) Earth");
        System.out.println("C) Mars");
        answer = scanner.nextLine().toUpperCase();
        if (answer.equals("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }


        // Question 4
        System.out.println("Question 3: What is the highest point in the earth?");
        System.out.println("A) Mt.K2");
        System.out.println("B) Mt.Makalu");
        System.out.println("C) Mt.Everest");
        answer = scanner.nextLine().toUpperCase();
        if (answer.equals("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        System.out.println("Your final score is " + score + " out of 3.");
        scanner.close();
    }
}