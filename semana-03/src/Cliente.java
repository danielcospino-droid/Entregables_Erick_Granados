package semana-03.src.co.edu.sena.semana03;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;

    // Constructor completo
    public Cliente(String nombre, String email, String telefono) {
        setNombre(nombre);
        setEmail(email);
        setTelefono(telefono);
    }

    // Constructor parcial
    public Cliente(String nombre, String email) {
        this(nombre, email, "Sin teléfono");
    }

    // Constructor mínimo
    public Cliente(String nombre) {
        this(nombre, nombre.toLowerCase().replace(" ", "") + "@example.com");
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isBlank()) {
            this.telefono = "Sin teléfono";
        } else {
            this.telefono = telefono;
        }
    }

    // Método de negocio
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + ", Email: " + email + ", Teléfono: " + telefono);
    }

    // Método auxiliar privado
    private boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }
}
