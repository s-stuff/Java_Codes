
import java.util.*;


class Commision{
    
 double Monthly_Salary;
 double rate;
double commission;
double Total_commission;


public double commision_rate_calc(double r, double Salary ) {
   Total_commission = (r/100)*Salary;
   double Total_salary = Salary - Total_commission;
  System.out.println("Total comission: " + Total_commission + "\nTotal Salary: " + Total_salary);
  return Total_commission;
}


  public void Commision_calc() {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Your Salary here: ");
     Monthly_Salary = sc.nextDouble();

     if(7500 >= Monthly_Salary) {

           commision_rate_calc(20, Monthly_Salary);
         
          
     } else if(7500 <= Monthly_Salary && 8999 >= Monthly_Salary) {
      commision_rate_calc(30, Monthly_Salary);

     } else  {
        commision_rate_calc(40, Monthly_Salary);
     
     }
  }
}

public class comission_calc{
    
 
  public static void main(String[] args) {
    Commision obj = new Commision();
    obj.Commision_calc();
  }

}
