
package juego_batallas;

public class Guerrero extends Criatura {
    private String armaNombre;
    private Arma arma;
 
    public Guerrero(String nombre, int salud, int fuerza, String armaNombre, Arma arma) {
        super(nombre, salud, fuerza);
        this.armaNombre = armaNombre;
        this.arma = arma;
    }
 
    @Override
    public void atacar(Criatura objetivo) {
        System.out.println(nombre + " ataca con su espada " + armaNombre + " y con el arma " + arma.getNombre());
        int daño = fuerza + arma.getDañoAdicional();
        objetivo.defender(daño);
    }
 
    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }
}
 