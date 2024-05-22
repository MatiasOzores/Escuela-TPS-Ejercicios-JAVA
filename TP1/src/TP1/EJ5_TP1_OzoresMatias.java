package TP1;
import java.util.Scanner;

public class EJ5_TP1_OzoresMatias {
    public static void main(String[] args) throws Exception {
    	System.out.println("EJ5 | TP1 | Ozores M.");
        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        Scanner scanner = new Scanner(System.in);
        int numeroUno, numeroDos;
        char operador;
        
        System.out.println("Ingrese su primer numero: ");
        numeroUno = scanner.nextInt();
        
        System.out.println("Ingrese su segundo numero: ");
        numeroDos = scanner.nextInt();
        
        System.out.println("Ingrese el operador (+,-,*,/): ");
        operador = scanner.next().charAt(0);
        
        scanner.close();
        
        float resultado = 0;
        
        switch (operador) {
            case '+':
                resultado = numeroUno + numeroDos;
                break;
            case '-':
                resultado = numeroUno - numeroDos;
                break;
            case '*':
                resultado = numeroUno * numeroDos;
                break;
            case '/':
                if (numeroDos != 0) {
                    resultado = (float) numeroUno / numeroDos;
                } else {
                    System.out.println("Error: Dividiste por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operador no válido");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}
