package TP1;

public class EJ4_TP1_OzoresMatias {
    public static void main(String[] args) throws Exception {
    	System.out.println("EJ4 | TP1 | Ozores M.");
        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
    	int[] numeros = {1,3,3,4,5}; // un array de valores enteros que seran utilizados para calcular el total de la suma del conjunto
    	int total = 0; // aqui se guardara el total, se le inicializa en 0 para que no haya problemas con valores basura
    	
    	for (int numero: numeros) { // utilizo un ciclo for-each para realizar la suma del total a partir de mi array de enteros
    		total+=numero; // indico que el valor de total se vaya actualizando a medida que se recorre el array
    	}
    	
    	System.out.println("El total es: " + total); // imprimo el valor final de total (osea la suma de todos los valores del array)
    }
}
