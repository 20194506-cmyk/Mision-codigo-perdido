public class Main {
    public static void main(String[] args) {

        // 🧙 Crear el héroe
        Heroe heroe = new Heroe("Arthur", 1, 50);

        // ⚒️ Crear el poder
        Poder poder = new Poder("Llama del Dragón", 50);

        // ⚔️ Entrenar al héroe
        heroe.entrenar();

        // 🔥 Activar el poder
        System.out.println(poder.activar());

        // 📊 Mostrar estado final del héroe
        System.out.println("=== ESTADO FINAL ===");
        System.out.println("Nombre: " + heroe.nombre);
        System.out.println("Nivel: " + heroe.nivel);
        System.out.println("Poder: " + heroe.poder);
    }
}