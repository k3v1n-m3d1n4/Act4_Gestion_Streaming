package org.example;

public abstract class CuentaUsuario {
    private String CorreoElectronico;
    private int mesesActivo;
    private PlanSuscripcion planSuscripcion;

    public CuentaUsuario(String correoElectronico, int mesesActivo, PlanSuscripcion planSuscripcion) {
        CorreoElectronico = correoElectronico;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }

    public double obtenerTotalAPagar() {
        return planSuscripcion.calcularCosto(mesesActivo);
    }

    public abstract String Plan();

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
