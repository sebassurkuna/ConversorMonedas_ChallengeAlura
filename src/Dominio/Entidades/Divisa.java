package Dominio.Entidades;

public class Divisa {
    private String nombre = "";
    private float valorDolar = 0;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getValorDolar() {
        return valorDolar;
    }
    public void setValorDolar(float valorDolar) {
        this.valorDolar = valorDolar;
    }
}
