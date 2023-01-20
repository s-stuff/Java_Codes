
import java.util.Scanner;

// time converter

class converter{

    double hour;
    double day;
    double year;
    double month;



   public void hour_day() {

    for(;;) {
    Scanner sc = new Scanner(System.in);
    System.out.print("""
        
    Press 1 : hour to day
    Press 2: day to hour
    Enter here: """);

       int input = sc.nextInt();


        if(input == 1) {

            // hour to day
            //Days = hours ÷ 24

            
            System.out.print("Enter Hour: ");
            hour = sc.nextDouble();
            day =  hour/24;
            System.out.format(hour + " hour in day : " + day);
        break;
        }  else if( input == 2) {

            // days to hour
            //hour = day*24
            System.out.print("Enter day: ");
            day = sc.nextDouble();
            hour =  day*24;
            System.out.format(day + " day in hour : " + hour);
         break;
        } else {

            System.out.println("Error, try again");
         
        }


       }
   }
   public void day_month() {

    for(;;) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
            
        Press 1 : day to month
        Press 2: month to day
        Enter here: """);
    
           int input = sc.nextInt();
    
    
            if(input == 1) {
    
         
    
                
                System.out.print("Enter Day: ");
                day = sc.nextDouble();
                if(day == 28 || day == 31||day == 30) {


                    System.out.format(day + " day in month: 1" );
                } else {

                    month =  day/30.417;
                    System.out.format(day + " day in month: " + month);
                }               
            break;
            }  else if( input == 2) {
    
                
                System.out.print("Enter Month: ");
                month = sc.nextDouble();
                day =  month*30.417;
                System.out.format(month + " month in day: " + day);
             break;
            } else {
    
                System.out.println("Error, try again");
             
            }
    
    
           }

   }
   public void month_year( ) {
    for(;;) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
            
        Press 1 : month to year
        Press 2: year to month
        Enter here: """);
    
           int input = sc.nextInt();
    
    
            if(input == 1) {
    
      
    
                
                System.out.print("Enter month: ");
                month = sc.nextDouble();
                year =  month/12;
                System.out.format(month + " month in year : " + year);
            break;
            }  else if( input == 2) {
    
       
                System.out.print("Enter year: ");
                year = sc.nextDouble();
                month =  12*year;
                System.out.format(year  + " year in month: " + month);
             break;
            } else {
    
                System.out.println("Error, try again");
             
            }
    
    
           }

   }
}

public class time_converter{

   
   static void menu( ) {

   for(;;) {

       converter obj = new converter();
    Scanner sc = new Scanner(System.in);
        System.out.print("""

       Press 1:  hour-day

       Press 2: day-month

       Press 3: month-year

       Enter here: """);
  int input = sc.nextInt();

  if(input == 1) {
        
    obj.hour_day();
     break;
  } else if(input == 2) {

  obj.day_month();
  break;
  } else if(input == 3) { 

    obj.month_year();
 break;
  } else {

 System.out.println("Error, try again");
  }
    
   }

    }
     public static void main(String[] args) {
        
        menu();
    

}
}