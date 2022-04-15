public class Coche {
    int puertas = 0;

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.contarpuertas();

        System.out.println(miCoche.puertas);

    }

    public void contarpuertas() {
        this.puertas++;
    }
}
