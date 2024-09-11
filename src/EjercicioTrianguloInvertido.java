
public class EjercicioTrianguloInvertido {

	public static void main(String[] args) {
		// TODO 
		/*//
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		int lineas = 10;
        for (int cont = 1; cont <= lineas; cont--) {
         for (int contDos = lineas; contDos < cont; contDos ++) {
        		System.out.print("*");
        	}//for anidado
         System.out.println();
        }//for
	}//main

}//class
