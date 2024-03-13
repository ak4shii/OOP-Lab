import java.util.Scanner;

public class DaysOfMonth{
    public static int leapYear(String month){
        int noD;
        switch (month){
            case "January", "Jan.", "Jan", "1":
                noD = 31;
                break;
            case "February", "Feb.", "Feb", "2":
                noD = 29;
                break;
            case "March", "Mar.", "Mar", "3":
                noD = 31;
                break;
            case "April", "Apr.", "Apr", "4":
                noD = 30;
                break;
            case "May", "5":
                noD = 31;
                break;
            case "June", "Jun", "6":
                noD = 30;
                break;
            case "July", "Jul", "7":
                noD = 31;
                break;
            case "August", "Aug.", "Aug", "8":
                noD = 31;
                break;
            case "September", "Sep.", "Sep", "9":
                noD = 30;
                break;
            case "October", "Oct.", "Oct", "10":
                noD = 31;
                break;
            case "November", "Nov.", "Nov", "11":
                noD = 30;
                break;
            case "December", "Dec.", "Dec", "12":
                noD = 31;
                break;
            default:
                noD = 0;
                break;
        }
        return noD;
    }

    public static int normalYear(String month){
        int noD;
        switch (month){
            case "January", "Jan.", "Jan", "1":
                noD = 31;
                break;
            case "February", "Feb.", "Feb", "2":
                noD = 28;
                break;
            case "March", "Mar.", "Mar", "3":
                noD = 31;
                break;
            case "April", "Apr.", "Apr", "4":
                noD = 30;
                break;
            case "May", "5":
                noD = 31;
                break;
            case "June", "Jun", "6":
                noD = 30;
                break;
            case "July", "Jul", "7":
                noD = 31;
                break;
            case "August", "Aug.", "Aug", "8":
                noD = 31;
                break;
            case "September", "Sep.", "Sep", "9":
                noD = 30;
                break;
            case "October", "Oct.", "Oct", "10":
                noD = 31;
                break;
            case "November", "Nov.", "Nov", "11":
                noD = 30;
                break;
            case "December", "Dec.", "Dec", "12":
                noD = 31;
                break;
            default:
                noD = 0;
                break;
        }
        return noD;
    }

    public static boolean monthCheck(String[] monthAvailable, String res){
        for (String month:monthAvailable){
            if (res.compareTo(month) == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        while (year <= 0){
            System.out.print("This is not a valid year, please enter again: ");
            year = input.nextInt();
        }

        String[] monthAvail = {"January", "Jan.", "Jan", "1", "February", "Feb.", "Feb", "2", "March", "Mar.", "Mar", "3", "April", "Apr.", "Apr", "4", "May", "5", "June", "Jun", "6", "July", "Jul", "7", "August", "Aug.", "Aug", "8", "September", "Sep.", "Sep", "9", "October", "Oct.", "Oct", "10", "November", "Nov.", "Nov", "11", "December", "Dec.", "Dec", "12"};
        System.out.print("Enter the month: ");
        String month = input.nextLine();
        month = input.nextLine();
        while (monthCheck(monthAvail, month) == false){
            System.out.print("This is not a month, please enter again: ");
            month = input.nextLine();
        }
        
        int days;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            days = leapYear(month);
        else
            days = normalYear(month);
        System.out.println("The month " + month + " of the year " + year + " has " + days + " days.");
        
        input.close();
   }
}