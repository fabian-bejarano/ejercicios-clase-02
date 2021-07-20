package co.edu.utp.misiontic2022.clase2;

import java.util.Scanner;

public class NumerodeSuerte {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una fecha: "); // 12/07/1980
        String fecha = input.nextLine();
        
        input.close();
        
        int indiceSeperador1 = fecha.indexOf("/");
        
        int dia = Integer.parseInt(fecha.substring(0, indiceSeperador1));
        
        System.out.println(dia);
    }
    
}
