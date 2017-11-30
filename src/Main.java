import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    static Names listOfNames;
    static ArrayList<Thread> allTheThreads;
    static Zoo myZoo;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        listOfNames = new Names();
        allTheThreads = new ArrayList<>();
        myZoo = new Zoo();


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
                case 0:
                {
                    break;
                }
                case 1:
                {
                    addAnimal();
                }

                case 2:
                {

                }

                case 3:

                {


                }



            }
        }while(menuChoice != 0);

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
        int choice;
        System.out.println("To add monkey press 1\n");

        choice = scan.nextInt();

        switch (choice)
        {
            case 1:
            {
                int randNum = (int) ((Math.random()*100)%14);
                Monkey temp = new Monkey(randNum,listOfNames.getRandomName(),"");
                myZoo.addAnimal(temp);
                Thread tTemp = new Thread(temp);
                allTheThreads.add(tTemp);
                tTemp.setDaemon(true);
                tTemp.start();
                System.out.println(temp.get_name() +" The Ape Was Added to the Zoo");
            }

        }
    }
}
