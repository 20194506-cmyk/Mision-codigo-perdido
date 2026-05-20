public class Poder {
    String nombre;
    int danio;

    public Poder(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = danio;
    }

    public String activar() {
        return "¡El cielo se quiebra al liberar " + nombre +
               " causando " + danio + " de daño!";
    }
}