package org.example;

public class CuentaEstandar extends CuentaUsuario{
    public CuentaEstandar(String correoElectronico, int mesesActivo) {
        super(correoElectronico, mesesActivo, new PlanEstandar());


    }

    @Override
    public String Plan() {
        return " Estandar";
    }

    @Override
    public String beneficios() {
        return "2 pantallas, " + "Calidad Full HD";
    }
}
