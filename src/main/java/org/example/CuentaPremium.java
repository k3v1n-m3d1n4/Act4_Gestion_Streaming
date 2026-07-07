package org.example;

public class CuentaPremium extends CuentaUsuario{
    public CuentaPremium(String correoElectronico, int mesesActivo) {
        super(correoElectronico, mesesActivo, new PlanPremium());
    }

    @Override
    public String Plan() {
        return "Plan Premium";
    }
}
