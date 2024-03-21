import java.util.Random;

public class Archivo2 {
    private Random random;

    public Archivo2() {
        this.random = new Random();
    }
    public int generarNumeroAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
     public int generarNumeroAleatorioMaximo(int max) {
        return random.nextInt(max + 1);
    }
    public int generarNumeroAleatorioDesde1(int max) {
        return random.nextInt(max) + 1;
    }
