package org.example;

public class CuentaBasico extends CuentaUsuario{

    public CuentaBasico(String correoElectronico, int mesesActivo) {
        super(correoElectronico, mesesActivo, new PlanBasico());
    }

    @Override
    public String Plan() {
        return "¨Plan basico.";
    }
}
