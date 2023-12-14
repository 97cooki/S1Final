import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

class Main
{
public static void main(String[] args)
{
    //new java object to format moneysss
    NumberFormat money = NumberFormat.getCurrencyInstance();

    ClawMachine person1 = new ClawMachine("Audrey", true, false, false);
    ClawMachine person2 = new ClawMachine("Kelsey", false, true, true);
    ClawMachine person3 = new ClawMachine("Hershey", true, false, true);
    ClawMachine person4 = new ClawMachine("Sarah", false, true, false);
    ClawMachine person5 = new ClawMachine("Mario", true, false, true);

    //create random object
    Random random = new Random();

    //Intro
    System.out.println("Many people are at the arcade today! There are many claw machines to choose from. However, card or cash, you must convert the money into tokens. Every dollar is 4 tokens. Who has card and who has cash?" + "\n");

    //Static method call to count how many people have card/cash
    System.out.println(ClawMachine.getPeopleCard() + " people have cards and " +
            ClawMachine.getPeopleCash() + " people have cash." + "\n");
    System.out.println("Okay, let's see who bought some tokens!\n");

    //create random int to generate money amounts
    int randomMula = random.nextInt(100);
    //uses setter to create currency amount
    //getters to get the name/card to convert into token unit
    person1.setCardAmount(randomMula);
    System.out.println(person1.getName() + " had " +
            money.format(person1.getCardAmount()) + ". Now she/he has " +
            person1.moneyToTokens() + " tokens.");

    randomMula = random.nextInt(100);
    person2.setCashAmount(randomMula);
    System.out.println(person2.getName() + " had " +
            money.format(person2.getCashAmount()) + ". Now she/he has " +
            person2.moneyToTokens() + " tokens.");

    randomMula = random.nextInt(100);
    person3.setCardAmount(randomMula);
    System.out.println(person3.getName() + " had " +
            money.format(person3.getCardAmount()) + ". Now she/he has " +
            person3.moneyToTokens() + " tokens.");

    randomMula = random.nextInt(100);
    person4.setCashAmount(randomMula);
    System.out.println(person4.getName() + " had " +
            money.format(person4.getCashAmount()) + ". Now she/he has " +
            person4.moneyToTokens() + " tokens.");

    randomMula = random.nextInt(100);
    person5.setCardAmount(randomMula);
    System.out.println(person5.getName() + " had " +
            money.format(person5.getCardAmount()) + ". Now she/he has " +
            person5.moneyToTokens() + " tokens." + "\n");

    System.out.println("Now it is time to play some claw machines! Let's find out who succeeds!\n");

    //uses getters to get name/boolean for who "won" something
    System.out.println("Did this person win something?\n");
    System.out.println(person1.getName() + " - " + person1.isHasCaught());
    System.out.println(person2.getName() + " - " + person2.isHasCaught());
    System.out.println(person3.getName() + " - " + person3.isHasCaught());
    System.out.println(person4.getName() + " - " + person4.isHasCaught());
    System.out.println(person5.getName() + " - " + person4.isHasCaught() + "\n");

    System.out.println("Hopefully everybody had a great time! If you want to get 20 more tokens, you can create an account for free!\n");

    //uses getters for name to create an account according to class info
    System.out.println(person2.getName() + " created an account: " + person2.CreateAccount());
    System.out.println(person3.getName() + " created an account: " + person3.CreateAccount());
    System.out.println(person5.getName() + " created an account: " + person5.CreateAccount() + "\n");
    
    System.out.println("Thank you for playing guys! Come back soon for a new and improved arcade...");
    } //end main method
} //end Main class