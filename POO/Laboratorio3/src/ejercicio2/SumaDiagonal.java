package ejercicio2;

import javax.swing.JOptionPane;

public class SumaDiagonal {

	public static void main(String[] args) {
		String inputstr;
		int tamMatriz;
		
		//bucle do-while cuando ingrese un numero negativo o 0
		
		do {
		
		inputstr = JOptionPane.showInputDialog("Ingrese EL tamano de la matriz cuadrada");
		tamMatriz = Integer.parseInt(inputstr);
		
		if (tamMatriz <=0) {
			
			JOptionPane.showMessageDialog(null, "la matriz debe ser de temaño positivo");
			
		}
		}while(tamMatriz <= 0 );
		
		int matriz[][]= new int[tamMatriz][tamMatriz];
		
		//ingresar los valores en la matriz
		
		for (int i = 0; i < tamMatriz; i++) {
			for (int j = 0; j < tamMatriz; j++) {
				String matrizInput = JOptionPane.showInputDialog(null,"Ingresa el valor de matriz["+ i +"]"+"[" + j +" ]");
				matriz[i][j]=Integer.parseInt(matrizInput);
				
			}
			
		}
		
		int sumaDiagonal = 0;
		int sumaInvertida = 0;
		
		for (int i = 0; i < tamMatriz; i++) {
			
			sumaDiagonal += matriz[i][i];
			
		}
		
		for (int i = tamMatriz - 1, j = 0; i >= 0; i--, j++) {

			
			sumaInvertida += matriz[i][j];
			
			
		}
		//construyendo el mensaje de la matriz
		
		StringBuilder matrizSalida= new StringBuilder();
		
		matrizSalida.append("Matriz Ingresada \n");
		
		for (int i = 0; i < tamMatriz; i++) {
			matrizSalida.append("[ ");
			for (int j = 0; j < tamMatriz; j++) {
				matrizSalida.append(matriz[i][j]).append(" ");
				
			}
			matrizSalida.append("]\n");
			
		}
		
		matrizSalida.append("la suma en diagonal es: ").append(sumaDiagonal).append("\n");
		matrizSalida.append("la suma en diagonal invertida es: ").append(sumaInvertida).append("\n");
		
		
		JOptionPane.showMessageDialog(null, matrizSalida.toString(), "Suma de Matrices",JOptionPane.INFORMATION_MESSAGE);
		
		
		

	}

}
