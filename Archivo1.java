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
  
  }
