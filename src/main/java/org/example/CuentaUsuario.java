package org.example;

public class CuentaUsuario {
    private String CorreoElectronico;
    private int mesesActivo;
    private PlanSuscripcion planSuscripcion;

    public CuentaUsuario(String correoElectronico, int mesesActivo, PlanSuscripcion planSuscripcion) {
        CorreoElectronico = correoElectronico;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public int getMesesActivo() {
        return mesesActivo;
    }

    public void setMesesActivo(int mesesActivo) {
        this.mesesActivo = mesesActivo;
    }

    public PlanSuscripcion getPlanSuscripcion() {
        return planSuscripcion;
    }

    public void setPlanSuscripcion(PlanSuscripcion planSuscripcion) {
        this.planSuscripcion = planSuscripcion;
    }
}
