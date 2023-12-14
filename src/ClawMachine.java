public class ClawMachine {
    //Instantiate Variables
    private String name;
    private int cashAmount;
    private int cardAmount;
    private boolean hasCard;
    private boolean hasCash;
    private boolean hasCaught;

    //static variables
    //how many people use card and cash
    private static int peopleCard = 0;
    private static int peopleCash = 0;

    //Create Constructors
    //Default Constructor
    public ClawMachine()
    {
        name = "";
        cashAmount = 0;
        cardAmount = 0;
        hasCard = false;
        hasCash = false;
        hasCaught = false;
    } //end default constructor

    //4 param constructor
    public ClawMachine(String name, boolean hasCard, boolean hasCash, boolean hasCaught)
    {
        this.name = name;
        this.cashAmount = 0;
        this.cardAmount = 0;
        this.hasCard = hasCard;
        this.hasCash = hasCash;
        this.hasCaught = hasCaught;

        if (hasCard)
        {
            peopleCard++;
        }
        else if (hasCash)
        {
            peopleCash++;
        }
    } //end 4 param constrictr

    //Create Getters & Setters
    //Getters
    //gets first param and outputs it - which is name of the obj
    public String getName() {return name;}
    //gets cash amount set and outputs it - which is cash amount of the obj
    public int getCashAmount() {return cashAmount;}
    //gets card amount set and outputs it - which is card amount of the obj
    public int getCardAmount() {return cardAmount;}
    //gets last param and outputs it - true or false if the obj has won
    public boolean isHasCaught() {return hasCaught;}

    //static getters - count of ppl who have card/cash
    public static int getPeopleCard() {return peopleCard;}
    public static int getPeopleCash() {return peopleCash;}

    //Setters
    //will set amount of total cash person has
    public void setCashAmount(int cashAmount) {this.cashAmount = cashAmount;}
    //will set amount of total card amount person has
    public void setCardAmount(int cardAmount) {this.cardAmount = cardAmount;}

    //Create Brain Methods
    //will return true if person has enough cash to buy claw
    public String toString()
    {
        return "Name: " + this.name +
                "\nDoes this person have a card? " + this.hasCard +
                "\nDoes this person have cash? " + this.hasCash +
                "\nHas this person caught anything at the claw machines?"                     + this.hasCaught;
    }

    //will return amount of tokens converted from money given
    public int moneyToTokens()
    {
        //1 dollar = 4 credits
        //need more than 1 dollar to purchase or be able to have any tokens
        if (this.hasCash && this.cashAmount >= 1)
        {
            int cashTokens = this.cashAmount * 4;
            return cashTokens;
        }
        else if (this.hasCard && this.cardAmount >= 1)
        {
            int cardTokens = this.cardAmount * 4;
            return cardTokens;
        }
        else
        {
            return 0;
        }
    }

    //will create account based upon person's information
    public String CreateAccount()
    {
        String firstInitial = this.name.substring(0,1);
        String lastTwo = this.name.substring(name.length()-3);
        String accountNumber = firstInitial + lastTwo + this.name.toLowerCase();
        return accountNumber.toUpperCase();
    }
} //end ClawMachine class