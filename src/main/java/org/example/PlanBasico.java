package org.example;

public class PlanBasico implements PlanSuscripcion{  //implementacion


    @Override
    public double calcularCosto(int meses) {
        return meses*5;
    }
}
