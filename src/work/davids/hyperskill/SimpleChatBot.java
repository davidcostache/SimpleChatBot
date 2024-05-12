package work.davids.hyperskill;

import java.util.Scanner;

/**
 * This class encapsulates a simple chat bot that can interact with users,
 * guess their ages, count numbers, and administer a programming quiz.
 */
public class SimpleChatBot {
    private String name;
    private int birthYear;
    private Scanner scanner;

    /**
     * Constructs a SimpleChatBot with a specified name and birth year.
     * @param name The name of the bot.
     * @param birthYear The year the bot was created.
     */
    public SimpleChatBot(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Introduces the bot and greets the user.
     */
    public void startInteraction() {
        System.out.println("Hello! My name is " + name + ".");
        System.out.println("I was created in " + birthYear + ".");
        greetUser();
    }

    /**
     * Prompts the user for their name and compliments it.
     */
    private void greetUser() {
        System.out.println("Please, remind me your name.");
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    /**
     * Uses a mathematical trick to guess the user's age based on remainders.
     */
    public void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    /**
     * Asks the user for a number and counts from 0 to that number.
     */
    public void countNumbers() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }

    /**
     * Administers a multiple-choice quiz on programming.
     */
    public void administerQuiz() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (scanner.nextInt() != 2) {
            System.out.println("Please, try again.");
        }
        System.out.println("Congratulations, have a nice day!");
    }

    public static void main(String[] args) {
        SimpleChatBot bot = new SimpleChatBot("Aid", 2023);
        bot.startInteraction();
        bot.guessAge();
        bot.countNumbers();
        bot.administerQuiz();
    }
}
