import java.util.Scanner;

public class Main {
    static int choice = 0;
    static int counter = 0;

    public static void main(String[] args) {
        TimsItem[] items = new TimsItem[100];
        double total = 0;

        boolean flag = true;

        TimsItem item = null;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Please give your input \n");
            System.out.println("1. Tims Merchendise \n" +
                    "2. Tims Consumables \n" +
                    "3. Done Ordering \n");
            choice = getIntInput(sc);
            if(choice ==1){
                System.out.println("1. Mug \n" +
                        "2. CoffeePowder \n" +
                        "3. Gift card");
                choice = getIntInput(sc);
                switch (choice){
                    case 1:
                        handleItem(new Mug(),items,sc);
                        break;
                    case 2:
                        handleItem(new CoffeePowder(),items,sc);
                        break;
                    case 3:
                        handleItem(new GiftCard(),items,sc);
                        break;
                    default:
                        System.out.println("Invlid Option. Please try again.");
                        break;
                }

            } else if (choice == 2) {
                System.out.println("1. Coffee \n" +
                        "2. Donut \n" +
                        "3. Bagel \n" +
                        "4. Wrap \n" +
                        "5. Sandwich");
                choice = getIntInput(sc);
                switch (choice){
                    case 1:
                        handleItem(new Coffee(),items,sc);
                        break;
                    case 2:
                        handleItem(new Donut(),items,sc);
                        break;
                    case 3:
                        handleItem(new Bagel(),items,sc);
                        break;
                    case 4:
                        handleItem(new Wrap(),items,sc);
                        break;
                    case 5:
                        handleItem(new Sandwich(),items,sc);
                        break;
                    default:
                        System.out.println("Invlid Option. Please try again.");
                        break;

                }

            } else if (choice == 3) {
                flag = false;
            } else {
                System.out.println("Invalid input. Please try again!\n\n");
            }

        }while (flag);

        System.out.println("\n************* \nTotal item ordered" +
                "\n*************");
        for (int i = 0; i< counter; i++){
            total = total + items[i].getPrice();
            System.out.println(items[i]);
        }
        System.out.println("\n*************\n\n" +
                "Total = $"+ total);

        System.out.println("Proceeding Payment");

        authorizePayment(total, sc);





    }
    private static void handleItem(TimsItem item,
                                   TimsItem[] items,
                                   Scanner sc
                                   ){
        if(item instanceof TimsMerchendise){
            System.out.println(
                    "\nName: " + item.getName() +
                            "\nFeatures: " + ((TimsMerchendise) item).getFeatures() +
                    "\nPrice: $" + item.getPrice() +
                    "\n 1. Order this " +
                    "\n 2. Choose again");
        } else if (item instanceof TimsConsumables) {
            System.out.println(
                    "\nName: " + item.getName() +
                            "\nCalories: " +
                    ((TimsConsumables) item).getCalories() +
                            "\nPrice: $" + item.getPrice() +
                    "\n 1. Order this " +
                    "\n 2. Choose again");

        }
        choice = getIntInput(sc);
        if(choice == 1){
            items[counter++] = item;
            item = null;
        }

    }

    private static int getIntInput(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("***Please give integer input.***");
            sc.next();
        }
        int integerNumber = sc.nextInt();
        return integerNumber;
    }

    private static void authorizePayment(double total, Scanner sc){
        System.out.println("\n### YOU HAVE BALANCE OF $30 IN WALLET###");
        System.out.println("Please enter 12 digit credit card number");
        String cardNumber = sc.next();
        System.out.println("Please enter Month and year in MM/YY format");
        String monthAndYear = sc.next();
        System.out.println("Please enter 3 digit CVV");
        String cvv = sc.next();
        if(cardNumber.equalsIgnoreCase(PaymentGateway.CREDIT_CARD_NUMBER)
        && monthAndYear.equalsIgnoreCase(PaymentGateway.MONTH_AND_YEAR)
        && cvv.equalsIgnoreCase(PaymentGateway.CVV)
        && total<PaymentGateway.BALANCE){
            System.out.println("**********************");
            System.out.println("**********************\n");
            System.out.println("Payment is successful.");
        }
        else {
            System.out.println("Payment failed.");
        }
    }
}