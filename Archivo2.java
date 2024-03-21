import java.util.Random;

public class Archivo2 {
    private Random random;

    public Archivo2() {
        this.random = new Random();
    }
    public int generarNumeroAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
