public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String numeroTelefono;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
     public void setNombre(String nombre) {
        System.out.println(this.nombre);
     }
    
}
