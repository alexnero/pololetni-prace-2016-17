import java.util.*;
public class Median {
     public static int[] zvetsi(int[] soucasne, int novaVelikost) {
        int[] nove = new int[novaVelikost];
        for (int i = 0; i < soucasne.length; i++) {
            nove[i] = soucasne[i];
        }
        return nove;
    }
  public static void main(String[] args) {
    int pole[] = new int[1];
    int pocet = 0;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    while (sc.hasNextInt()) {
      pole[pocet] = sc.nextInt();
      pocet++;
      if (pocet == pole.length) {
          pole = zvetsi(pole, pole.length + 1);
          } 
    }
       Arrays.sort(pole, 0, pocet); 
    for ( int i = 0; i < pole.length; i++)  {
     System.out.printf("%d ", pole[i]);
     }
     System.out.println();
    double median;
     if ((pocet) % 2 == 0) {
          median = pole[pocet/2] + pole[pocet/2 - 1]/2; 
           } else {
          median = pole[pocet/2];
           }
      System.out.println(median);
   }
  }
