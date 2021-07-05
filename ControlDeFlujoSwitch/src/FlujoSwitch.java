
public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Switch
		 * switch(condicion){
		 * case valor:
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * case valor2:
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 		break;
		 * 	default:
		 * 		codigo por defecto;
		 * 
		 * }
		 * 
		 */
		
		int dia = 10;
		String mensaje = "";
		
		switch(dia) {
		case 1:
			mensaje = "Lunes";
			break;
		case 2:
			mensaje ="Martes";
			break;
		case 3:
			mensaje = "Miercoles";
			break;
		case 4:
			mensaje ="Jueves";
			break;
		case 5:
			mensaje = "Viernes";
			break;
		case 6:
			mensaje = "Sabado";
			break;
		case 7:
			mensaje = "Domingo";
			break;
		default:
			mensaje = "Dia invalido";
			break;
		
		}
		
		System.out.println(mensaje);
		/**
		 * Crear una calculadora que pueda sumar, restar multiplicar y dividir
		 * 2 numeros.
		 * La calculadora debe pedir los dos numeros y posteriormente preguntar
		 * que operacion se quiere realizar, 
		 * le mnu es el siguiente:
		 * 1Suma
		 * 2Resta
		 * 3Multiplicaion
		 * 4Division
		 * 
		 * Al fginal debe mostrar el resultado de la operacion
		 * 
		 * nota: se debe usar el comando switch
		 */
	}

}
