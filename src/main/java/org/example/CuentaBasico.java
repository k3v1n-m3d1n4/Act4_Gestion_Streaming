package org.example;

public class CuentaBasico extends CuentaUsuario{

    public CuentaBasico(String correoElectronico, int mesesActivo) {
        super(correoElectronico, mesesActivo, new PlanBasico());
    }

    @Override
    public String Plan() {
        return " Basico.";
    }

    @Override
    public String beneficios() {
        return "1 pantalla, " + "Calidad SD";
    }
}
