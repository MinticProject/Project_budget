
package com.project_budget.project_budget.Models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class RolModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String rol;

    @OneToMany(mappedBy = "rol_id")
    private List<EmpleadoModel> empleado;

    public RolModel(Integer id,String rol) {
        this.id = id;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public List<EmpleadoModel> getEmpleado() {
        return empleado;
    }
    public void setEmpleado(List<EmpleadoModel> empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "RolModel [id=" + id +
        ", rol=" + rol + "]";
    }
}