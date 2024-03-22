public class Calculadora {

    double numero1;
    double numero2;

   
    public Calculadora(double a, double b) {
        this.numero1 = a;
        this.numero2 = b;
    }

    public double suma() {
        return this.numero1 + this.numero2;
    }

    public double resta(){

        return this.numero1 - this.numero2;
    }

    public double multiplicacion(){

        return this.numero1 * this.numero2;
    }

    public double dvision(){

        return this.numero1 / this.numero2;
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double calcularPotencia(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }
      public double raizCuadrada(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
    }
  
  }
