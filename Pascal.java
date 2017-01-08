public class Pascal {
  public static void main(String args[]) {
    int PocetRadku = Integer.parseInt(args[0]);
      for (int i = 0; i < PocetRadku; i++){
      {
          System.out.printf("%" + (PocetRadku - i)*2 + "s", "");
// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        }
        int Cislo = 1;
          for (int a = 0; a <= i; a++){
            System.out.printf("%4d", Cislo);
            Cislo = Cislo * (i - a) / (a + 1);
          }
          System.out.println();
        }
      }
    }
 