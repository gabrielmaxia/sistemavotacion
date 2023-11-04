/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemavotaciones;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author ag045
 */
public class GenerarContrasena {
    public String generarcadena(int length){
        String abc_minuscula = "abcdefghijklmnopqrstuvwxyz";
        String abc_mayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String simbolos ="!$%&=#/";
        String numeros ="0123456789";
        
        String caracteres = abc_minuscula + abc_mayuscula + simbolos + numeros;
        
        Random mrandon = new Random();
        
        String result ="";
        for (int i = 0; i <length; i++){
            
            int posicion = mrandon.nextInt(caracteres.length());
            char caracter = caracteres.charAt(posicion);
            result += caracter;
        }
        
        
      return result;  
      
    }
    
     }


