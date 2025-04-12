package juego_batallas;

public class Juego_Batallas {

    public static void main(String[] args) {
        Arma espada = new Arma("Espada de Hierro", 5);
        Arma baston = new Arma("Bastón Mágico", 4);
        Arma garras = new Arma("Garras Afiladas", 6);

        Guerrero guerrero = new Guerrero("Conan", 100, 10, "Espada de Conan", espada);
        Mago mago = new Mago("Gandalf", 80, 8, "Bola de Fuego", baston);
        Dragon dragon = new Dragon("Smaug", 120, 12, "Escamas doradas", garras);

        simularBatalla(guerrero, mago);
        System.out.println("\n----- NUEVA BATALLA -----\n");
        simularBatalla(mago, dragon);
    }

    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("¡Comienza la batalla entre " + criatura1.nombre + " y " + criatura2.nombre + "!");

        int turno = 1;
        while (criatura1.estaViva() && criatura2.estaViva()) {
            System.out.println("\nTurno " + turno + ":");

            criatura1.atacar(criatura2);
            if (!criatura2.estaViva()) {
                break;
            }

            criatura2.atacar(criatura1);
            turno++;
        }

        if (criatura1.estaViva()) {
            System.out.println("\n" + criatura1.nombre + " ha ganado la batalla.");
        } else {
            System.out.println("\n" + criatura2.nombre + " ha ganado la batalla.");
        }
    }
}
