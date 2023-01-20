import java.util.Scanner;

class Area_calculator{

    double radius;
    double Side;
    double lenght;
    double breadth;
    double height;

    public void Circle(double radius){
       
         double area = (22/7)*(Math.pow(radius,2));
         System.out.println("Area: " + area);
    } 
    public void Square(double Side){
       
        double area = Math.pow(Side,2);
        System.out.println("Area: " + area);
   } 
   public void Rectangle(double lenght, double breadth, double height){
       
    double area = lenght*breadth*height;
    System.out.println("Area: " + area);
} 
  public void menu() {

    for(;;) {
    Scanner sc = new Scanner(System.in);
    System.out.print("""
            
            Menu: 

            Press 1 -- Find the area of Circle.
            Press 2 -- Find the area of Square.
            Press 3 -- Find the area of Rectangle. 

            Enter here: """);
      int input = sc.nextInt();   
      
    
    
      if(input == 1) {
  
        System.out.print("Enter radius: ");   
        radius = sc.nextDouble();
        Circle(radius);
        break;
      } else if(input == 2) {
        System.out.print("Enter side: ");   
        Side = sc.nextDouble();
        Square(Side);
        break;
      } else if(input == 3 ) {

        System.out.print("Enter lenght: ");   
        lenght = sc.nextDouble();
        System.out.print("Enter breadth: ");   
        breadth = sc.nextDouble();
        System.out.print("Enter height: "); 
        height = sc.nextDouble();

        Rectangle(lenght, breadth, height   );
        break;
      } else {

        System.out.println("Error, try again");
        
    }
}
}
}
public class Area {
  
    public static void main(String[] args) {
        
      Area_calculator obj = new Area_calculator();

        obj.menu();


        
    }
    
}
