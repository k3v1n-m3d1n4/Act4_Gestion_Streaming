package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;  //main
        PlataformaStreaming plataformaStreaming = new PlataformaStreaming();
        do {
            System.out.println("--PLATAFORMA DE STREAMING--");
            System.out.println("1) Plan Basico");
            System.out.println("2) Plan Estandar");
            System.out.println("3) Plan Premium   ");
            System.out.println("4) Imprimir Reporte ");
            System.out.println("5) Salir");
            System.out.println("Selecciona una opción:");
            opc = sc.nextInt();
            sc.nextLine();



            if (opc > 0 && opc <= 3) {
                System.out.println("Ingresa tu correo electronico ");
                String correo = sc.nextLine();
                System.out.println("Ingresa los meses");
                int meses = sc.nextInt();
                switch (opc) {
                    case 1:
                        CuentaBasico cuentaBasico = new CuentaBasico(correo, meses);
                        plataformaStreaming.registrar(cuentaBasico);
                        break;

                    case 2:
                        CuentaEstandar cuentaEstandar = new CuentaEstandar(correo, meses);
                        plataformaStreaming.registrar(cuentaEstandar);
                        break;
                    case 3:
                        CuentaPremium cuentaPremium = new CuentaPremium(correo, meses);
                        plataformaStreaming.registrar(cuentaPremium);
                        break;
                }
            } else if (opc == 4) {
                plataformaStreaming.reporte();

            }


        }
        while (opc != 5);
    }
}


