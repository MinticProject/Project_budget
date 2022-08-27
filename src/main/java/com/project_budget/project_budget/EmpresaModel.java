package com.project_budget.project_budget;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String direccion;
    private Long telefono;
    private String nit;

    @OneToMany(mappedBy = "empresa_id")
    private List<EmpleadoModel> empleado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<EmpleadoModel> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<EmpleadoModel> empleado) {
        this.empleado = empleado;
    }


}
