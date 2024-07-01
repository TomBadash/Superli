package PresentationLayer;
import DomainLayer.Facade;
import java.util.ArrayList;
import java.util.Scanner;

public class ProduceReports {
    //   *****Menu Functions****
    /***
     *Name:InventoryReport - A methods which print the inventory report by asked categories or the full inventory.
     * Args: None
     * Returns: None
     */
    public static void  InventoryReport(){
        System.out.println("""
                If you want to watch all items for sale please type 'All' and then press ENTER.
                Else, if you want to watch items by categories please type 'Category' and then press ENTER""");
        Scanner scan = new Scanner(System.in);
        String which = scan.nextLine();
        while (!(which.equals("All") || which.equals("Category"))){
            System.out.println("Please type 'All' or 'Category' as you are required");
            which = scan.nextLine();
        }
        if (which.equals("All")) {
            System.out.println(Facade.showAllItemsCtr());
            return;
        }
        ArrayList<String> askCatCorrect = Management.showCatalogChoices(scan);
        if (askCatCorrect == null)
            return;
        System.out.println(Facade.showByCatCtr(askCatCorrect.get(0), askCatCorrect.get(1), askCatCorrect.get(2)));
    }

    /***
     *Name:ExpiredReport - A methods which print the expired items report. After you will produce this report it will
     * be removed from the program!
     * Args: None
     * Returns: None
     */
    public static void  ExpiredReport(){
        System.out.println(Facade.showExpReportsCtr());
    }

    /***
     *Name:DamagedReport - A methods which print the damaged items report. After you will produce this report it will
     * be removed from the program!
     * Args: None
     * Returns: None
     */
    public static void  DamagedReport(){
        System.out.println(Facade.showDamageReportsCtr());
    }
    public static void  ReturnToMainMenu(){
        System.out.println("Returning to main menu...\n");

    }
    public static String PrintMenu() {
        return """
                What report would you like to produce today?
                1. Produce an inventory report
                2. Produce an expired report
                3. Produce a damaged report
                4. Return to main menu
                """;
    }
    public static void runMenu(){
        int choice = 0;
        while (choice!=4){
            choice = GetChoice();
        }
    }
    public static int GetChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(PrintMenu());
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> InventoryReport();
            case 2 -> ExpiredReport();
            case 3 -> DamagedReport();
            case 4 -> ReturnToMainMenu();
            default -> System.out.println("Please choose valid number between 1-5");

        }
        return userInput;
    }
}