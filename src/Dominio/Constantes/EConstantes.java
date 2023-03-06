package Dominio.Constantes;

public class EConstantes {
    private static String[] opcionesDivisas = 
    {
        "USD","EUR"
    };
    private static float[] equivalenciaDivisas = 
        {
            1,1.07f
        };
    public static String[] getOpcionesDivisas() {
        return opcionesDivisas;
    }
	public static float[] getEquivalenciaDivisas() {
		return equivalenciaDivisas;
	}

}
