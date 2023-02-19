package Aplicacion;
import Dominio.Interfaces.IConversorDivisas;

public class Conversor implements IConversorDivisas {

    @Override
    public float ConvertirDivisas(float cantidad, float valorDivisaUnoDolar, float valorDivisaDosDolar) {
       float divisaUnoDolares = cantidad*valorDivisaUnoDolar;
       return divisaUnoDolares/valorDivisaDosDolar;
    }
    
}
