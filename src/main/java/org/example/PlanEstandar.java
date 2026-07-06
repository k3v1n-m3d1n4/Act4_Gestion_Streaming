package org.example;

public class PlanEstandar implements PlanSuscripcion{  //implementacion


    @Override
    public double calcularCosto(int meses) {
        return meses*9;
    }
}
