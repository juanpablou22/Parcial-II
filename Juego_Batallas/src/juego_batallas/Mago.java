
package juego_batallas;

public class Mago extends Criatura implements Magico {
    private String hechizos;
    private Arma arma;
 
    public Mago(String nombre, int salud, int fuerza, String hechizos, Arma arma) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
        this.arma = arma;
    }
 
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " lanza un hechizo y ataca con " + arma.getNombre());
        lanzarHechizo();
        int daño = fuerza + arma.getDañoAdicional();
        objetivo.defender(daño);
    }
 
    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }
 
    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza el hechizo: " + hechizos);
    }
 
    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo hechizo.");
    }
}
 