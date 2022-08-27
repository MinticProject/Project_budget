
package com.project_budget.project_budget.Models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class RolModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String rol;

    @OneToMany(mappedBy = "rol_id")
    private List<EmpleadoModel> empleado;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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

}