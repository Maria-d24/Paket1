package Paket.Lesson2;

public class SwitchExample {




    public static void main(String[] args){
       System.out.println(printMonth(1));
        System.out.println(printMonth(2));
        System.out.println(printMonth(3));
       System.out.println(printMonth(4));
       System.out.println(printMonth(5));
       System.out.println(printMonthBySwitch(6));
     System.out.println(printMonthBySwitch(7));
       System.out.println(printMonthBySwitch(8));
       System.out.println(printMonthBySwitch(9));
        System.out.println(printMonthBySwitch(10));
        System.out.println(printMonthBySwitch(11));
       System.out.println(printMonthBySwitch(12));
        System.out.println(printMonthBySwitch(13));


    }

    private static String printMonth(int monthNumber) {
        if (monthNumber == 1)   return "January";
        if (monthNumber == 2)   return "February";
        if (monthNumber == 3)   return "March";
        if (monthNumber == 4)   return "April";
        if (monthNumber == 5)   return "May";
        if (monthNumber == 6)   return "June";
        if (monthNumber == 7)   return "July";
        if (monthNumber == 8)   return "August";
        if (monthNumber == 9)   return "September";
        if (monthNumber == 10)   return "October";
        if (monthNumber == 11)   return "November";
        if (monthNumber == 12)   return "December";
        return "Unknown month";
    }

    private static String printMonthBySwitch(int monthNumber) {


        switch (monthNumber) {
                case 12:
                 case 1:
                case 2: System.out.println("Winter");
                break;
                case 3:
               case 4:
            case 5:     System.out.println("Spring");
                break;
            case 6:
               case 7:
               case 8:
                System.out.println("Summer");
                break;
            case 9:
               case 10:
                   case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown month");
   break;
        }

return "ok";

    }}

