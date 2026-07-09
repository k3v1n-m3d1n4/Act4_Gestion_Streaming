package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlataformaStreaming {
 List<CuentaUsuario> list = new ArrayList<>();
public void registrar(CuentaUsuario cuentaUsuario){
    list.add(cuentaUsuario);
    System.out.println("Cuenta Registrada con exito :)");
}

public void reporte(){
double total =0;
for (CuentaUsuario c: this.list){
    double costo= c.obtenerTotalAPagar();
    total+= costo;
    System.out.println("Correo Electronico: "+ c.getCorreoElectronico()+ "   Meses: " +c.getMesesActivo()+ "   Plan Suscripcion: " + c.Plan()+ "  Costo: " +costo);
    System.out.println("Beneficios: " + c.beneficios());

}
    System.out.println("Total recaudado:  " + total);
}


}
