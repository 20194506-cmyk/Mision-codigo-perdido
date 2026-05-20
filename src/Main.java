public class Main {
    public static void main(String[] args) {
        
        Heroe heroe = new Heroe("Arthur", 1, 50);
        
        Poder poder = new Poder("Llama del Dragon", 50);
        
        heroe.entrenar();
        
        System.out.println(poder.activar());
        
        System.out.println("=== Stats del Heroe ===");
        System.out.println("Nombre: " + heroe.nombre);
        System.out.println("Nivel: " + heroe.nivel);
        System.out.println("Poder: " + heroe.poder);
    }
}