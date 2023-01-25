import java.util.Scanner;

class PatternMaker{
    
   public void left_side_increasing_triangle(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = 1; j <= i; j++) {

            System.out.print(s);
        }

        System.out.println();
    }

   }

   public void left_side_decreasing_triangle(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = i; j <=n; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
   }

   public void right_side_increasing_triangle(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = i; j <=n; j++) {

            System.out.print( "  ");
        }
        for(int j = 1; j <=i; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
   }

   public void right_side_decreasing_triangle(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = 1; j <=i; j++) {

            System.out.print( "  ");
        }
        for(int j = i; j <=n; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
   }
   
   public void hill_pattern(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = i; j <=n; j++) {

            System.out.print( "  ");
        }
        for(int j = 1; j <i; j++) {

            System.out.print(s);
        }
        for(int j = 1; j <=i; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
   }

   public void reveresed_hill_pattern(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = 1; j <=i; j++) {

            System.out.print( "  ");
        }
        for(int j = i; j <n; j++) {

            System.out.print(s);
        }
        for(int j = i; j <=n; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
   }

   public void diamond_pattern(int n, String s) {
       
    for(int i = 1; i < n ; i++) {
        for(int j = i; j <=n; j++) {

            System.out.print( "  ");
        }
        for(int j = 1; j <i; j++) {

            System.out.print(s);
        }
        for(int j = 1; j <=i; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
    
    
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <=i; j++) {

            System.out.print( "  ");
        }
        for(int j = i; j <n; j++) {

            System.out.print(s);
        }
        for(int j = i; j <=n; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
  
   }

   public void left_side_hill(int n, String s) {
       
    for(int i = 1; i <= n ; i++) {
        for(int j = 1; j < i; j++) {

            System.out.print(s);
        }

        System.out.println();
    }
    for(int i = 1; i <= n ; i++) {
        for(int j = i; j <=n; j++) {

            System.out.print(s);
        }

        System.out.println();
    }

   }
   
   public void right_side_hill(int n, String s) {
       
    for(int i = 1; i < n ; i++) {
        for(int j = i; j <=n; j++) {

            System.out.print( "  ");
        }
        for(int j = 1; j <=i; j++) {

            System.out.print(s);
        }

        System.out.println();
    }

    for(int i = 1; i <= n ; i++) {
        for(int j = 1; j <=i; j++) {

            System.out.print( "  ");
        }
        for(int j = i; j <=n; j++) {

            System.out.print(s);
        }

        System.out.println();
    }

   }
}
 
public class pattern {
    
    public static void main(String[] args) {
        

       PatternMaker obj = new PatternMaker(); 

       int no_symbol;
       String Symbol;
    Scanner sc = new Scanner(System.in);
    System.out.println("""
            Press-1: Left Side Increasing Triangle
            Press-2: Left Side Decrease Triangle
            Press-3: Right Side Increasing Triangle
            Press-4: Right Side Decrease Triangle
            Press-5: Hill 
            Press-6: Reveresed Hill 
            Press-7: Diamond 
            Press-8: Left Side Hill
            Press-9: Right Side Hill


            Enter here: """);
      int input = sc.nextInt();
       switch(input) {


        case 1: System.out.println("Enter Symbol: ");
                Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.left_side_increasing_triangle(no_symbol, Symbol);
                 break;
        case 2:
               System.out.println("Enter Symbol: ");
                Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.left_side_decreasing_triangle(no_symbol, Symbol);
               break;
        case 3:
                System.out.println("Enter Symbol: ");
                Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.right_side_increasing_triangle(no_symbol, Symbol);
               break;
        case 4:
                System.out.println("Enter Symbol: ");
                Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.right_side_decreasing_triangle(no_symbol, Symbol);
               break;
        case 5:
                System.out.println("Enter Symbol: ");
                Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.hill_pattern(no_symbol, Symbol);
               break;
        case 6:
                System.out.println("Enter Symbol: ");
                Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.reveresed_hill_pattern(no_symbol, Symbol);
               break;
        case 7:
                System.out.println("Enter Symbol: ");
               Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.diamond_pattern(no_symbol, Symbol);
               break;
        case 8:

                System.out.println("Enter Symbol: ");
               Symbol = sc.next();
               System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
               no_symbol = sc.nextInt();
               obj.left_side_hill(no_symbol, Symbol);
               break;
        case 9: 
                 System.out.println("Enter Symbol: ");
                 Symbol = sc.next();
                 System.out.println("How Many Number of " + Symbol  + " You Want to print? : ");
                 no_symbol = sc.nextInt();
                 obj.right_side_hill(no_symbol, Symbol);
                 break;


        
 
       }

    }
}
