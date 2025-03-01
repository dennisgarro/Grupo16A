public class Boleto {
    int numeroSerie;
    String nombreComprador;
    double precio;

    public Boleto(int numeroSerie, String nombreComprador, double precio) {
        this.numeroSerie = numeroSerie;
        this.nombreComprador = nombreComprador;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "[Fila: " + numeroSerie + ", Comprador: " + nombreComprador + ", Precio: $" + precio + "]";
    }
}
