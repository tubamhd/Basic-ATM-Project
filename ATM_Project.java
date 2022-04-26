import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chance = 3;
        int select;
        while (chance > 0) {
            //----------------USER AREA----------------
            System.out.println("Welcome to The P.R. Bank!\nPlease Enter Details Below!");
            System.out.print("Username:  ");
            String username = input.nextLine();
            System.out.print("Password:  ");
            String password = input.nextLine();

            if (username.equals("tubamhd") && password.equals("09876tb")) {
                System.out.println("Login Successful");
                //-------------ACCOUNT AREA-------------
                do {
                    int balance = 3400;
                    System.out.print("Please Choose the Process\n" +
                            "* * * Process * * *\n" +
                            "1: Deposit\n" +
                            "2: Withdraw\n" +
                            "3: Balance\n" +
                            "4: Exit  \n"+
                    "Your Choice:   ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Your balance: "+ balance);
                            System.out.print("How much money do you want to deposit?  ");
                            int amount = input.nextInt();
                            balance = balance + amount;
                            System.out.println("New Balance:  " + balance);
                        case 2:
                            System.out.println("Your Balance:  "+ balance);
                            int amount1;
                            System.out.print("How much money do you want to withdraw?  ");
                            amount1 = input.nextInt();
                            if (amount1 > balance){
                                System.out.println("Not Enough Balance!");
                            }else {
                                balance -= amount1;
                                System.out.println("New Balance:  "+ balance);
                            }
                        case 3:
                            System.out.println("Your Balance: "+ balance);
                    }
                }while(select != 4);
                System.out.println("See You Again!");
            }else{
                chance--;
                System.out.println("Wrong username or password. Try Again!");
                if (chance == 0){
                    System.out.println("Your account is blocked. Please contact with your bank!");
                }else{
                    System.out.println("Remaining chance: "+ chance);
                }
            }
        }
    }
}

















