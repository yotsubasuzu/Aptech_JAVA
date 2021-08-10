import java.util.Scanner;
public class Player {
    private String name;
    private int age;
    private String gender;

    Scanner input = new Scanner(System.in);

    public Player() {
        name = "";
        age = 0;
        gender = "";
    }

    public Player(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails(String match){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
        System.out.println("Enter Numer of Games, performance, grade");
        String numGame = input.nextLine();
        String performance = input.nextLine();
        String grade = input.nextLine();

        switch(match){
            case "Test Match": 
                TestMatch testMatch1 = new TestMatch();
                testMatch1.calculateIncome(numGame);
                testMatch1.calculateBonus(performance, grade);
            case "World Cup": 
                WorldCup worldCup1 = new WorldCup();
                worldCup1.calculateIncome(numGame);
                worldCup1.calculateBonus(performance, grade);
        }
    }
}

