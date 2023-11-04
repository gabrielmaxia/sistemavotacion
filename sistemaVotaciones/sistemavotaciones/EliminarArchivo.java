/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemavotaciones;

import java.io.File;

/**
 *
 * @author ag045
 */
public class EliminarArchivo {
    
    
   public void eliminar(){
       
       final String RUTA = "C:\\Users\\ag045\\OneDrive\\Escritorio\\sistemaVotaciones\\gesitrarElecciones";
       
       try {
           File archivo = new File(RUTA);
           
           if(archivo.delete()){
               
               System.out.println("el archivo fue borrado correctamente");
               
           }
           else{
            System.out.println("error al borrar archivo ");   
           }
           
       }catch (Exception e){
           
       }
       
   }
    
}
