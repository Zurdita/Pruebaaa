package com.ifes.dominio;

import javax.jdo.annotations.*;

@PersistenceCapable(table = "persona", detachable = "true")
@DatastoreIdentity(strategy = IdGeneratorStrategy.IDENTITY, column = "ID")
public class Persona {

    // Si preferís declarar el id, usá wrapper y @PrimaryKey:
    // @PrimaryKey
    // @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    // @Column(name = "ID")
    // private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DOCUMENTO")
    private Integer documento;

    @Column(name = "COLORDEOJOS")
    private String colorDeOjos;

    // OBLIGATORIO para JDO
    protected Persona() {}

    public Persona(String nombre, String apellido, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    // getters/setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public Integer getDocumento() { return documento; }
    public void setDocumento(Integer documento) { this.documento = documento; }
    public String getColorDeOjos() { return colorDeOjos; }
    public void setColorDeOjos(String colorDeOjos) { this.colorDeOjos = colorDeOjos; }

    @Override public String toString() {
        return "Persona{nombre='" + nombre + "', apellido='" + apellido +
               "', documento=" + documento + ", colorDeOjos='" + colorDeOjos + "'}";
    }
}
