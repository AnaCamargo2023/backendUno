package model;

public class Odontologo {
    private String matricula;
    private String nombre;
    private String apellido;
    private Integer id;

    public Odontologo(String matricula, String nombre, String apellido, Integer id) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}