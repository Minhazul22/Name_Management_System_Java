import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalTime;


public class Person {
    private String first_name;
    private String last_name;
    private int day;
    private int month;
    private int year;
    private static int personCount = 0;



    //constructor
    public Person(String first_name, String last_name, int day, int month, int year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.day = day;
        this.month = month;
        this.year = year;
        personCount++; //increment when new person is created
    }


    public void display_info(){ //Display Method
        System.out.println("First Name: " + first_name + ", Last Name: " + last_name +
                ", Name Changed Previously: " + day + "/" + month + "/" + year);

    }

    //getter method
    public String getFirstName(){
        return first_name;
    }
    //setter method
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    //getter method for last name
    public String getLast_name(){
        return last_name;
    }
    //setter method
    public void setLast_name(){
        this.last_name = last_name;
    }

    //getter method for day
    public int getDay() {
        return day;
    }
    //setter method for day
    public void setDay(int day) {
        this.day = day;
    }

    //getter method
    public int getMonth() {
        return month;
    }

    public void setMonth(int month){ //
        if (month >= 1 && month <= 12){ //valid month
            this.month = month;
        } else {
            System.out.println("Invalid month! Must be 1-13");
        }
    }




    public void changeName (String new_first_name, String new_last_name, int new_day, int new_month, int new_year) {
        LocalDate oldDate = LocalDate.of(this.year, this.month, this.day);
        LocalDate newDate = LocalDate.of(new_year, new_month, new_day);
        LocalDate DateLimit = oldDate.plusYears(3);

        if (!newDate.isBefore(DateLimit)){
            this.first_name = new_first_name;
            this.last_name = new_last_name;
            this.day = new_day;
            this.month = new_month;
            this.year = new_year;

            System.out.println("Name changed successfully!");
            display_info();

        } else {
            System.out.println("Name can only be changed every 3 years!");
        }


    }

}