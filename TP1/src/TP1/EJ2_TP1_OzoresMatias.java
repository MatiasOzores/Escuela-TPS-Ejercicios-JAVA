package TP1;

public class EJ2_TP1_OzoresMatias {
	public static void main(String[] args) throws Exception {
        System.out.println("EJ2 | TP1 | Ozores M.");
        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


        for (int x = 50; x < 100; x++) {
            esPrimo(x);
        }
    }

	public static void esPrimo(int x) {
        int cont = 0;


        for (int x_temp = 1; x_temp <= x; x_temp++) {
            if (x % x_temp == 0) {
                cont++;
            }
        }


        if(cont > 2){
            for (int x_temp = 1; x_temp <= x; x_temp++) {
                if (x % x_temp == 0) {
                    System.out.print(x_temp + " ");
                }
            }
        }


        else{
            System.out.print("PRIMO");
        }


        System.out.println("");
    }
}
