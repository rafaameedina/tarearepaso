package mascotas;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas(7);

        tiendaMascotas.agregarMascota("Lucia",4, "Caballo");
        tiendaMascotas.agregarMascota("Martin", 5, "Perro");
        tiendaMascotas.agregarMascota("Jose", 8, "Oso");

        tiendaMascotas.venderMascota("Lucia");

        tiendaMascotas.mostrarInventario();
    }
}
