import java.util.Scanner;
public class Name {
    public static void main(String[] args) {

        System.out.println("Moin Moin!"); //greeting

        Scanner scan = new Scanner(System.in); //scanner object



//Create array of Person objects
        Person[] person = new Person[3];
        person[0] = new Person("Aam", "Rupali", 1, 2, 2020);
        person[1] = new Person("Misty", "Alu", 1, 2, 2020);
        person[2] = new Person("Champa", "Kola", 1, 2, 2020);




        //ask for user_input

        while (true) {
            System.out.println("Enter 1,2,3 to select a person,and Enter 4 to display all, 0 to exit: ");
            int entered_number = scan.nextInt(); //Read integer input

            if (entered_number == 0) {  //Termination of the program
                System.out.println("Bye");
                System.exit(0);
            } else if (entered_number == 4) { //displaying all information
                for (int i = 0; i < person.length; i++){
                    person[i].display_info();
                }
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

                int selectedIndex = entered_number - 1; //Convert the user input (1,2,3) to array index(0,1,2)
                Person selected = person[selectedIndex];

                selected.changeName(newFirst_name, newLast_name, Day, Month, Year);


            } else {
                System.out.println("Invalid input");


            }
        }

    }
}

