public class Heroe {
    String nombre;
    int nivel;
    int poder;

    public Heroe(String nombre, int nivel, int poder) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.poder = poder;
    }

    public void entrenar() {
        poder += 10;
    }
}



