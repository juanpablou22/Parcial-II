package juego_batallas;

public class Arma {

    private String nombre;
    private int dañoAdicional;

    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    public void atacarConArma(Criatura objetivo) {
        objetivo.defender(dañoAdicional);
        System.out.println("Ataque con arma " + nombre + ", daño: " + dañoAdicional);
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }

    public String getNombre() {
        return nombre;
    }
}
