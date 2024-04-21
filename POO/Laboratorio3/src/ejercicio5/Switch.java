package ejercicio5;

import java.util.Arrays;
import javax.swing.JOptionPane;
public class Switch {

	public static void main(String[] args) {
		
		String inputTamano = JOptionPane.showInputDialog(null, "Ingrese el tamaño de la matriz en el formato 'filas,columnas':");
		String[] tamano = inputTamano.split(",");
		
		int filas = Integer.parseInt(tamano[0]);
		int columnas = Integer.parseInt(tamano[1]);
		
		int[][] matriz = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				String matrizInput = JOptionPane.showInputDialog(null,"Ingresa el valor de matriz["+ i +"]"+"[" + j +" ]");
				matriz[i][j]=Integer.parseInt(matrizInput);
				
			}
			
		}
		
		int menu = Integer.parseInt(JOptionPane.showInputDialog(String.format("MENU \n"
				+"(1).Mostrar los números ingresado en el arreglo \n"
				+"(2).Mostrar los números pares del arreglo \n"
				+"(3).Mostrar los números impares del arreglo \n"
				+"(4).Mostrar el número mayor del arreglo \n"
				+"(5).Mostrar el número menor del arreglo \n"
				+"(6).Buscar  un  número  dentro  del  arreglo \n"
				+"(7).Ordenar el arreglo de manera ascendente \n"
				+"(0).salir del programa")));
		
		
		switch (menu){
		case 0:
			break;
		case 1:
			
			//construyendo el mensaje de la matriz
			StringBuilder matrizSalida= new StringBuilder();
			matrizSalida.append("Matriz Ingresada \n");

			for (int i = 0; i < filas; i++) {
				matrizSalida.append("[ ");
				for (int j = 0; j < columnas; j++) {
					matrizSalida.append(matriz[i][j]).append(" ");
					
				}
				matrizSalida.append("]\n");
				
			}
			
			JOptionPane.showMessageDialog(null, matrizSalida.toString(), "Valor de la Matriz",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 2:
			//construyendo el mensaje de la matriz
			StringBuilder matrizPar= new StringBuilder();
			matrizPar.append("Numeros pares del arreglo \n");

	        for (int i = 0; i < filas; i++) {
	        	matrizPar.append(" , ");
	            for (int j = 0; j < columnas; j++) {
	                if (matriz[i][j] % 2 == 0) { // Verificar si el elemento es par
	                    matrizPar.append(matriz[i][j]);
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, matrizPar.toString(), "Numeros Pares",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			//construyendo el mensaje de la matriz
			StringBuilder matrizInPar= new StringBuilder();
			matrizInPar.append("Numeros pares del arreglo \n");

	        for (int i = 0; i < filas; i++) {

	            for (int j = 0; j < columnas; j++) {
	                if (matriz[i][j] % 2 != 0) { 
	                    matrizInPar.append(matriz[i][j]);
	                    
	                }
	                
	            }
	           matrizInPar.append(" , "); 
	        }
	        JOptionPane.showMessageDialog(null, matrizInPar.toString(), "Numeros Pares",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			int mayor = matriz[0][0];

			// 
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                if (matriz[i][j] > mayor) {
	                    mayor = matriz[i][j]; 
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null,"EL numero mayor del arreglo es "+mayor,"EL numero mayor de la matriz",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			int menor = matriz[0][0];

	
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                if (matriz[i][j] < menor) { 
	                    mayor = matriz[i][j]; 
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null,"EL numero menor del arreglo es "+menor,"EL numero menor de la matriz",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			
			int numEncontrar = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero que quire encontra \nen el arreglo"));
			boolean encontrado =false;

		
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                if (matriz[i][j] == numEncontrar) { 
	                    encontrado = true; 
	                    JOptionPane.showMessageDialog(null,"El numero "+numEncontrar+" se encuentra en la posicion "+" [ " + i + " ] " + "[ "+ j +" ] ","Numero encontrado",JOptionPane.INFORMATION_MESSAGE);
	                }
	            }
	        }
	        
	        if(!encontrado) {
	        	 JOptionPane.showMessageDialog(null,"EL numero no fue encontrado","NO encontrado",JOptionPane.INFORMATION_MESSAGE);
	        }
	       
			break;
		case 7:
			
	        // Convertir el arreglo bidimensional en un arreglo unidimensional
	        int[] arregloUnidimensional = new int[matriz.length * matriz[0].length];
	        int k = 0;
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                arregloUnidimensional[k++] = matriz[i][j];
	            }
	        }

	        // Ordenar el arreglo unidimensional de manera ascendente utilizando el algoritmo de la burbuja
	        for (int i = 0; i < arregloUnidimensional.length - 1; i++) {
	            for (int j = 0; j < arregloUnidimensional.length - 1 - i; j++) {
	                if (arregloUnidimensional[j] > arregloUnidimensional[j + 1]) {
	                    int temp = arregloUnidimensional[j];
	                    arregloUnidimensional[j] = arregloUnidimensional[j + 1];
	                    arregloUnidimensional[j + 1] = temp;
	                }
	            }
	        }

	        // Convertir el arreglo unidimensional ordenado de nuevo a un arreglo bidimensional
	        k = 0;
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                matriz[i][j] = arregloUnidimensional[k++];
	            }
	        }

	        // Construir el mensaje para mostrar con JOptionPane
	        StringBuilder mensaje = new StringBuilder();
	        mensaje.append("Arreglo bidimensional ordenado:\n\n");
	        for (int[] fila : matriz) {
	            mensaje.append(Arrays.toString(fila)).append("\n");
	        }

	        JOptionPane.showMessageDialog(null, mensaje.toString(), "Arreglo Ordenado", JOptionPane.INFORMATION_MESSAGE);
	   
			break;
		

		default:
			break;
		}
		
		
		
		

	}

}
