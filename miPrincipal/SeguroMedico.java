package miPrincipal;

public class SeguroMedico extends Seguro {
    // No hay atributos propios

    // Constructor
    public SeguroMedico( String nombre, String tipo, double costoMensual)
    {
        super(nombre, tipo, costoMensual);
    }

    // Implementar metodo de instancia setTipo
    public void setTipo(String tipo)
    {
        // El tipo debe ser "Medico"
    }

    // Implementa metodo de instancia setCostoMensual
    public void setCostoMensual(double costo)
    {
        // El costo mensual debe ser de $450.00
    }

    // Metodo toString() igual que en la super clase
}