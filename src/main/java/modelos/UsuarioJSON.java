package modelos;

public class UsuarioJSON {
    private Long id;
    private String username;
    private String nombre;
    private String correo;

    public Long getId() {
        return id;
    }

    public UsuarioJSON(Long id, String username, String nombre, String correo) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
