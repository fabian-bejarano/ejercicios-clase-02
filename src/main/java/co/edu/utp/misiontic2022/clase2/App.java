package co.edu.utp.misiontic2022.clase2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Crear el objeto de la clase boligrafo
        Boligrafo objBoligrafo1 = new Boligrafo("Negro", "parker", "Aluminio", 467);
        Boligrafo objBoligrafo2 = new Boligrafo("Azul", "Kilometrico", "Plastico", 200);
        
        objBoligrafo1.setColor("Rojo");

        System.out.println(objBoligrafo1.toString());
        System.out.println(objBoligrafo2.toString());
        
        
        objBoligrafo1.escribir(objBoligrafo1.getMarca(), objBoligrafo1.getColor());
        objBoligrafo2.dibujar(objBoligrafo2.getMarca(), objBoligrafo2.getColor());

        /*
        objBoligrafo1.dibujar();
        objBoligrafo1.escribir();
        */
    }
}
