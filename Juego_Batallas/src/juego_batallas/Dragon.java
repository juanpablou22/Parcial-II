
package juego_batallas;


public class Dragon extends Criatura implements Volador {
    private String escamas;
    private Arma arma;
 
    public Dragon(String nombre, int salud, int fuerza, String escamas, Arma arma) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
        this.arma = arma;
    }
 
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con fuego (fuerza x2) y con su arma: " + arma.getNombre());
        int daño = (fuerza * 2) + arma.getDañoAdicional();
        objetivo.defender(daño);
    }
 
    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }
 
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
 
    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterrizó.");
    }
}
