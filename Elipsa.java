public class Elipsa {
     
    public static boolean vElipse(int x, int y, int a, int b) {
    return ((double) x*x)/ ((double) a*a) + ((double) y*y) / ((double) b*b) < 1;
    }
   
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for (int y = -b; y <= b; y++) {
            for (int x = -a; x <= a; x++) {
                
                if (vElipse(x,y,a,b))  {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
             }
            System.out.println();
        }       
      }
    }

