package Aplicacion;
import Dominio.Interfaces.IConversorDivisas;
import Dominio.Interfaces.IConversorTemp;

public class Conversor implements IConversorDivisas, IConversorTemp {

	/**
	 * Funcion que permite la conversión entre Divisas tomando el
	 * valor de cada divisa en dolares
	 * @param cantidad
	 * @parama valorDivisaUnoDolar
	 * @param valorDivisaDosDolar
	 * @return float
	 */
    @Override
    public float ConvertirDivisas(float cantidad, float valorDivisaUnoDolar, float valorDivisaDosDolar) {
       float divisaUnoDolares = cantidad*valorDivisaUnoDolar;
       return divisaUnoDolares/valorDivisaDosDolar;
    }

    
    /**
	 * Funcion que permite la conversión entre diferentes escalas de temperatura
	 * @param cantidad
	 * @param tempOrigen
	 * @param tempDestino
	 * @return float
	 */
	@Override
	public float ConvertirTemperatura(float cantidad, String tempOrigen, String tempDestino) {
		float resultado = 0;
		String opcion = tempOrigen + tempDestino;
		switch (opcion) {
		case "12": {
			resultado = ConvCelsiusFahrenheit(1, cantidad);
			break;
		}
		case "13":{
			resultado = ConvCelsiusKelvin(1, cantidad);
			break;
		}
		case "21":{
			resultado = ConvCelsiusFahrenheit(2, cantidad);
			break;
		}
		case "23":{
			float tempIntermedia = ConvCelsiusFahrenheit(2, cantidad);
			resultado = ConvCelsiusKelvin(1, tempIntermedia);
			break;
		}
		case "31":{
			resultado = ConvCelsiusKelvin(2, cantidad);
			break;
		}
		case "32":{
			float tempIntermedia = ConvCelsiusKelvin(2, cantidad);
			resultado = ConvCelsiusFahrenheit(1, tempIntermedia);
			break;
		}
		default:
			resultado = cantidad;
			break;
		}
		return resultado;
	}
	
	/**
	 * Funcion que permite la conversión de Celsius a Fahrenheit y viseversa
	 * dependiendo la opción elegida. <br>
	 * Opción 1: Conversión Celsius a Fahrenheit<br>
	 * Opción 2: Conversión Fahrenheit a Celsius<br>
	 * Default: 0
	 * @param opcion (int)
	 * @param cantidad (float)
	 * @return float
	 */
	private float ConvCelsiusFahrenheit(int opcion, float cantidad) {
		float resultado = 0;
		if(opcion==1) {
			resultado = (cantidad*1.8f)+32;
		}else if (opcion==2) {
			resultado = (cantidad-32)/1.8f;
		}
		return resultado;
	}
	
	/**
	 * Funcion que permite la conversión de Celsius a Kelvin y viseversa
	 * dependiendo la opción elegida. <br>
	 * Opción 1: Conversión Celsius a Kelvin<br>
	 * Opción 2: Conversión Kelvin a Celsius<br>
	 * Default: 0
	 * @param opcion (int)
	 * @param cantidad (float)
	 * @return float
	 */
	private float ConvCelsiusKelvin(int opcion, float cantidad) {
		float resultado = 0;
		if(opcion==1) {
			resultado = cantidad+273.15f;
		}else if (opcion==2) {
			resultado = cantidad-273.15f;
		}
		return resultado;
	}
}
