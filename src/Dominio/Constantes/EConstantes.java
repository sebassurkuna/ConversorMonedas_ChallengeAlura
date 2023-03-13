package Dominio.Constantes;

public class EConstantes {
    private static String[] opcionesDivisas = 
    {
        "USD","EUR","COP","MXN","CNY","RUB"
    };
    private static float[] equivalenciaDivisas = 
    {
    		1,1.07f,0.00021f,0.055f,0.15F,0.013f
    };
    
    private static String[] opcionesTemp = 
        {
            "°C","°F","°K"
        };
    
    public static String[] getOpcionesDivisas() {
        return opcionesDivisas;
    }
	public static float[] getEquivalenciaDivisas() {
		return equivalenciaDivisas;
	}
	public static String[] getOpcionesTemp() {
		return opcionesTemp;
	}

}
