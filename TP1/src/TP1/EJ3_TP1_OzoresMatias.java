package TP1;
import java.util.Scanner;

public class EJ3_TP1_OzoresMatias {
    public static void main(String[] args) throws Exception {
        System.out.println("EJ3 | TP1 | Ozores M.");
        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner scanner = new Scanner(System.in);
        int num, valido, cont;
       
        do{
            valido = 0;
            cont = 0;
            System.out.print("Ingrese un numero: ");
            num = scanner.nextInt();


            if(num > 100){
                for(int x = 1; x <= num; x++){
                    if(num % x == 0){
                        cont++;
                    }
                }


                // ES PRIMO
                if(cont == 2){
                    valido = 1;
                    System.out.println("Final del programa");
                }


                else{
                    valido = 0;
                }
               
            }


            else{
                valido = 0;
            }


        }while(valido == 0);
        scanner.close();
       
       
    }
}
