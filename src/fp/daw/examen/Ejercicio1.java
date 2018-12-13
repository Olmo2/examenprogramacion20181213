package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'mostrarVector' que
	 * reciba mediante un parámetro formal un vector de números enteros y lo muestre por
	 * pantalla en una única línea con el formato siguiente:
	 * 
	 * 				[num1, num2, num3, ...., numN]
	 * 
	 * donde num1, num2, num3, ..., numN son los números almacenados en el vector.
	 */
	
	public static void  mostrarVector(int [] nums  ) {
		int i;
		int n=8;
	//	nums = new int [10] ;
		for( i = 0; i<nums.length; i++) {
//			nums[i] = n;
//			n++;
		System.out.print(nums[i] + ",");
		}
	}
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, la vesión sobrecargada del método anterior que
	 * muestre por pantalla un vector de caracteres con el formato siguiente:
	 * 
	 * 				['c1', 'c2', 'c3', ...., 'cN']
	 * 
	 * donde 'c1', 'c2', 'c3', ...., 'cN' son los caracteres almacenados en el vector.
	 */

	public static void mostrarVector(char [] txt) {
		String palabra= "aprobado";
		txt = new char [8];
		for (int i =0; i < txt.length ; i++) {
			txt [i] = palabra.charAt(i);
			System.out.print("'" + txt[i] +"'"  + ",");
		}
		
	}
	
}
