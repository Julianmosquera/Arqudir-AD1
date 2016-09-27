package arqudir;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author julian
 */
public class Arqudir {

    public static void main(String[] args) throws IOException {
        File arquivos = new File("/home/oracle/NetBeansProjects/arquivos/");
        arquivos.mkdir();

        File arquivosdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/");
        arquivosdir.mkdir();

        File Products1 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1");
        Products1.createNewFile();

        File subdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        subdir.mkdir();

        File Products2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2");
        Products2.createNewFile();
        
        File Products1oculto= new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1~");

        if (arquivos.exists()) {
            System.out.println("El archivo " + arquivos + " existe");
        } else {
            System.out.println("No existe el archivo " + arquivos);
        }

        if (arquivosdir.exists()) {
            System.out.println("El archivo" + arquivosdir + " existe");
        } else {
            System.out.println("El archivo " + arquivosdir + " No existe");
        }
        if (Products1.exists()) {
            System.out.println("El archivo " + Products1 + " existe");
        } else {
            System.out.println(" No existe");
        }

        //nº5
        System.out.println("En el directorio arquivosdir hay " + Arrays.toString(arquivosdir.list()));

        //nº6
        System.out.println(" Ruta de arquivos"+arquivos.toString());

        //nº7
        System.out.println("Ruta de arquivos "+arquivos.toString()+" Nombre "+arquivos.getName()+"    Permisos:  leer  "+arquivos.canRead()+" Escribir "+arquivos.canWrite()+" Ejecutar "+arquivos.canExecute());
        

        //nº8
        System.out.println("Poniendolo con el permiso de solo lectura "+arquivos.setReadOnly());
       
        //nº9
        System.out.println("Poniendole de nuevo el permiso de escritura \n "+arquivos.setWritable(true));
        
        
        
        //Borrando
        
        Products2.delete();
        Products1.delete();
        Products1oculto.delete();
        subdir.delete();
        arquivosdir.delete();
        arquivos.delete();
        
    
    
    }
    
    
}