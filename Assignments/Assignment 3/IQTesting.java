import java.util.*;

public class IQTesting {
    public static void main(String[] args) {
        System.out.println("Number of Attempts: ");
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int numberAttempts = input.nextInt();
        if (numberAttempts > 1) {
            System.out.println("Terminate the program!");
        } else if (numberAttempts < 1) {
            System.out.println("Terminate the program!");
        } else {
            int totalPoints = 0;
            String answer;
            for (int i = 0; i >= 0; i++) {
                int point = 0;
                boolean flag1 = false;
                boolean flag2 = false;
                boolean flag3 = false;
                boolean flag4 = false;
                System.out.println("1. Aptitude");
                System.out.println("2. English");
                System.out.println("3. Math");
                System.out.println("4. GK");
                System.out.println("5. Exit");
                int choice = input.nextInt();
                if (choice == 1) {
                    if (flag1) {
                        System.out.println("Already answered");
                        break;
                    } else {
                        System.out.println("Question of Aptitude: ");
                        System.out.println("A.   B.   C.   D.   ");
                        answer = sc.nextLine();
                        System.out.println("Answer: " + answer);
                        if (answer == "A") {
                            point = 10;
                            totalPoints += point;
                            flag1 = true;
                            System.out.println(flag1);
                        } else {
                            point = 0;
                            totalPoints += point;
                            flag1 = true;
                            System.out.println(flag1);
                        }
                    }
                } else if (choice == 2) {
                    if (flag2) {
                        System.out.println("Already answered");
                        continue;
                    } else {
                        System.out.println("Question of English: ");
                        System.out.println("A.   B.   C.   D.   ");
                        answer = input.next();
                        if (answer == "A") {
                            point = 10;
                            totalPoints += point;
                            flag2 = true;
                        } else {
                            point = 0;
                            totalPoints += point;
                            flag2 = true;
                        }
                    }
                } else if (choice == 3) {
                    if (flag3) {
                        System.out.println("Already answered");
                        continue;
                    } else {
                        System.out.println("Question of Math: ");
                        System.out.println("A.   B.   C.   D.   ");
                        answer = input.next();
                        if (answer == "A") {
                            point = 10;
                            totalPoints += point;
                            flag3 = true;
                        } else {
                            point = 0;
                            totalPoints += point;
                            flag3 = true;
                        }
                    }
                } else if (choice == 4) {
                    if (flag4) {
                        System.out.println("Already answered");
                        continue;
                    } else {
                        System.out.println("Question of GK: ");
                        System.out.println("A.   B.   C.   D.   ");
                        answer = input.next();
                        if (answer == "A") {
                            point = 10;
                            totalPoints += point;
                            flag4 = true;
                        } else {
                            point = 0;
                            totalPoints += point;
                            flag4 = true;
                        }
                    }
                } else if (choice == 5) {
                    if (flag1 && flag2 && flag3 && flag4) {
                        System.out.println("Total Mark: " + totalPoints);
                        if (totalPoints <= 10) {
                            System.out.println("No bonus points earned");
                            System.out.println("Total score out of 50: " + totalPoints);
                            System.out.println("Your IQ level is below average.");
                            break;
                        } else if (totalPoints == 20) {
                            System.out.println("2 bonus points earned");
                            System.out.println("Total score out of 50: " + totalPoints + 2);
                            System.out.println("Your IQ level is average.");
                            break;
                        } else if (totalPoints == 30) {
                            System.out.println("5 bonus points earned");
                            System.out.println("Total score out of 50: " + totalPoints + 5);
                            System.out.println("You are intelligent.");
                            break;
                        } else if (totalPoints == 40) {
                            System.out.println("10 bonus points earned");
                            System.out.println("Total score out of 50: " + totalPoints + 10);
                            System.out.println("You are genius.");
                            break;
                        }
                    } else {
                        System.out.println("You need to re-appear the test.");
                    }
                } else {
                    System.out.println("Re-enter the choice.");
                    continue;
                }
            }
        }
    }
}
