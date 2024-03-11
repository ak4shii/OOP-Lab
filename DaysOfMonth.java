import java.util.Scanner;

public class DaysOfMonth{
    int leapYear(String month){
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

    int normalYear(String month){
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
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the month: ");
        String month = input.nextLine();
        month = input.nextLine();
        
        DaysOfMonth obj = new DaysOfMonth();
        int days;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    days = obj.leapYear(month);
                    System.out.println("The month " + month + " of the year " + year + " has " + days + " days.");
                }
                else{
                    days = obj.normalYear(month);
                    System.out.println("The month " + month + " of the year " + year + " has " + days + " days.");
                }
            }
            else{
                days = obj.leapYear(month);
                System.out.println("The month " + month + " of the year " + year + " has " + days + " days.");
            }
        }
        else{
            days = obj.normalYear(month);
            System.out.println("The month " + month + " of the year " + year + " has " + days + " days.");
        }
        
        input.close();
   }
}