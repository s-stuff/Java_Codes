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

   public void reveresd_hill_pattern(int n, String s) {
       
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

        // obj.increasing_triangle(4, "* ");
        // obj.decreasing_triangle(5, "* ");
        //obj.right_side_increasing_triangle(5, "* ");
        // obj.right_side_decreasing_triangle(5, "* ");
        // obj.hill_pattern(4, "* ");
        // obj.reveresd_hill_pattern(5, "* ");
        //obj.diamond_pattern(5, "* ");
        //obj.left_side_hill(5, "* ");
       // obj.right_side_hill(5, "* ");

        //going too add more pattern just for practice :)
    }
}
