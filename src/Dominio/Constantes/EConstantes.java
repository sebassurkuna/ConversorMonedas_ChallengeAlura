package Dominio.Constantes;

public class EConstantes {
    private static String[] opciones = {"Divisas","Temperatura"};
    private static String[] opcionesDivisas = 
    {
        "Dolar a Euro","Euro a Dolar"
    };

    public static String[] getOpcionesDivisas() {
        return opcionesDivisas;
    }

    public static String[] getOpciones() {
        return opciones;
    }

}
