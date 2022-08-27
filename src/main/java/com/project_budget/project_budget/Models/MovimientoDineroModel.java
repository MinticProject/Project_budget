package com.project_budget.project_budget.Models;

import javax.persistence.*;

@Entity
    @Table(name = "movimientodinero")
    public class MovimientoDineroModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique = true,nullable = false)
        private Long id;

        private float monto;
        private String concepto;

        //relacion una a muchos con la tabla empresa
        @ManyToOne
        @JoinColumn(name="empleado_id",referencedColumnName="id", insertable=false, updatable=false)
        private EmpleadoModel empleado_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}

