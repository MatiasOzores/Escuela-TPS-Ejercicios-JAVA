package TP1;

public class EJ1_TP1_OzoresMatias {
	public static void main(String[] args) throws Exception{
		System.out.println("EJ1 | TP1 | Ozores M.");
        new ProcessBuilder("cmd","/c","pause").inheritIO().start().waitFor();
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();


        for(int x=1; x < 100; x++) {
            if(x % 2 == 0){
                System.out.println("PAR");
            }


            else{
                System.out.println(x);
            }
        }
	}
}
