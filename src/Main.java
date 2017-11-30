import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    static Names listOfNames;
    static ArrayList<Thread> allTheThreads;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        listOfNames = new Names();
        allTheThreads = new ArrayList<>();

        mainMenu();

    }


    public static void mainMenu()
    {
        int menuChoice;

        do
        {
            printMenuChoises();
            menuChoice = scan.nextInt();

            switch (menuChoice)
            {
                case 1:
                {
                    addAnimal();
                }



            }
        }while((menuChoice != 0));

    }

    private static void printMenuChoises()
    {
        System.out.println("Press 1 to add an Animal to the zoo\n"
        + "press 2 to visit an animal from the zoo\n"
        + "press 3 to take an animal out from the zoo\n"
        +"Press 0 to exit\n");
    }


    private static void addAnimal()
    {

    }
}
