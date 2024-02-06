package mascotas;

public class TiendaMascotas {
    Mascota[] inventario;
    int cantidadMascotas;

    public TiendaMascotas(){
        this.inventario = new Mascota[100];
        cantidadMascotas = 0;
    }
    public TiendaMascotas(int cantidadMascotas){
        this.cantidadMascotas=cantidadMascotas;
    }

    public void agregarMascota(String nombre, int edad, String tipoAnimal){
        Mascota mascota = new Mascota(nombre, edad, tipoAnimal);
        inventario[cantidadMascotas]=mascota;
        cantidadMascotas++;
        System.out.println("La mascota "+nombre+" se ha añadido correctamente");
    }

    public void venderMascota(String nombre){
        for (int i = 0; i > cantidadMascotas; i++) {
            if (inventario[i].getNombre().equals(nombre)) {
                System.out.println("La mascota " + inventario[i].getNombre() + " se ha vendido correctamente");
                inventario[i]=null;
                for (int j = 0; j < cantidadMascotas; j++) {
                    inventario[j] = inventario[j + 1];
                }
                cantidadMascotas--;
                return;
            }
        }
        System.out.println("La mascota con nombre "+nombre+" no se encuentra");
    }

    public void mostrarInventario(){
        System.out.println("El inventario de la tienda:");
        for (int i = 0; i < cantidadMascotas; i++) {
            System.out.println("nombre: "+inventario[i].getNombre());
        }
    }
}