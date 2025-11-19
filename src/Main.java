import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Moin Moin!"); //greeting

        Scanner scan = new Scanner(System.in); //scanner object



//Create Person objects
        Person person_1 = new Person("Aam", "Rupali", 1, 2, 2020);
        Person person_2 = new Person("Champa", "Kola", 2, 3, 2023);
        Person person_3 = new Person("Kalo", "Jaam", 3, 4, 2024);




        //ask for user_input

        while (true) {
            System.out.println("Enter 1,2,3 to select a person,and Enter 4 to display all, 0 to exit: ");
            int entered_number = scan.nextInt(); //Read integer input

            if (entered_number == 0) {  //Termination of the program
                System.out.println("Bye");
                System.exit(0);
            } else if (entered_number == 4) { //displaying all information
                person_1.display_info();
                person_2.display_info();
                person_3.display_info();
            } else if (entered_number >= 1 && entered_number <= 3) {
                System.out.println("Enter new first name: ");
                String newFirst_name = scan.next();

                System.out.println("Enter new last name: ");
                String newLast_name = scan.next();

                System.out.println("Enter day of name change: ");
                int Day = scan.nextInt();
                System.out.println("Enter month of name change: ");
                int Month = scan.nextInt();
                System.out.println("Enter year of name change: ");
                int Year = scan.nextInt();
                scan.nextLine(); //consume next line

                switch (entered_number) {
                    case 1:
                        person_1.changeName(newFirst_name, newLast_name, Day, Month, Year);
                        break;
                    case 2:
                        person_2.changeName(newFirst_name, newLast_name, Day, Month, Year);
                        break;
                    case 3:
                        person_3.changeName(newFirst_name, newLast_name, Day, Month, Year);
                        break;
                }


            } else {
                System.out.println("Invalid input");


            }
        }

    }
}