/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemavotaciones;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ag045
 */
public class SistemaVotaciones {

    public static void main(String[] args) {
          Scanner contra = new Scanner(System.in);
        int numero;
        System.out.println("ingresa la contraseña admin");
        numero = contra.nextInt();
        
        if (numero == 1234){
            System.out.println("contraseña correcta");
        
       System.out.println("SISTEMA DE VOTACIONES"); 
       System.out.println("1) CREAR USUARIO DEL SISTEMA");
       System.out.println("2) MODIFICAR USUARIO DEL SISTEMA ");
       System.out.println("3) REINICIAR CONTRASEÑA");
       
       Scanner REGISTOU = new Scanner(System.in);
        int REU;
        System.out.println("INGRESE UNA OPCION");
        REU = REGISTOU.nextInt();
        
        if (REU == 1){
       
       Scanner usuario = new Scanner(System.in);
        String usuar;
        System.out.println("ingresa tu nombre");
        usuar = usuario.nextLine();
        
        Scanner APELLIDO = new Scanner(System.in);
        String APELL;
        System.out.println("ingresa tu apellido");
        APELL = APELLIDO.nextLine();
        
        Scanner CORREO = new Scanner(System.in);
        String CO;
        System.out.println("ingresa tu correo");
        CO = CORREO.nextLine();
        }
        
         Scanner ROL = new Scanner(System.in);
        int R;
        System.out.println("CUAL ES TU ROL");
        System.out.println("1) administrador");
        System.out.println("2) registradores de votantes");
        System.out.println("3) votantes ");
        System.out.println("4) auditor");
        R = ROL.nextInt();
        if(R==1){
            
            Scanner GDE = new Scanner(System.in);
         int GD;
          System.out.println("REGISTRO DE VOTANTES ");  
          System.out.println("1) GESTION DE ELECCIONES  ");
          System.out.println("2) GESTION DE CANDIDATOS  ");
          System.out.println("3) CONFIGURACION DE OPCIONES DE ELECCION");
          GD = GDE.nextInt();
          if(GD==1){
              
          
             Scanner CELX = new Scanner(System.in);
            int CEL;
            System.out.println("1) CREAR ELECCIONES  ");
            System.out.println("2) ELIMINAR ELECCIONES  ");
            CEL = CELX.nextInt();
            
            
            if(CEL==1){
                
            registroVotantesAdmin relec=new registroVotantesAdmin();
            relec.crearArchivosDeTexto();
            
            if(CEL==2){
                EliminarArchivo elimi = new EliminarArchivo();
                elimi.eliminar();
            }
            }
            }
            
            if(GD==2){
                Scanner ing = new Scanner(System.in);
                        int inge;
                System.out.println("INCLUSION Y GESTION DE CANDIDATOS  ");
                System.out.println("1) AGREEGAR INFORMACION DE CANDIDATOS");
                System.out.println("2) MODIFICAR INFORMACION DE CANDIDATOS  ");
                System.out.println("3) ELIMINAR CANDIDATOS");
                inge = ing.nextInt();
                if(inge==1){
                    AgregarINfoCandidatos aginc = new AgregarINfoCandidatos();
                    aginc.agragarinfo();
                }
                
            
            if(GD==3){
                System.out.println("CONFIGURACION DE OPCIONES DE ELECCION ");
                //DEFINIR LOS CANDIDATOS QUE PARTICIPARAN
                //MOSTRAR CANDIDATOS EN EL SISTEMA
            }
          
          }
        }
            
        if(R==2){        
         Scanner cmr = new Scanner(System.in);
         int cm;
          System.out.println("REGISTRO DE VOTANTES ");  
          System.out.println("1) CREAR USUARIO  ");
          System.out.println("2) MODIFICAR USUARIO  ");
          System.out.println("3) REINIICAR CONTRRASEÑA ");

          cm = cmr.nextInt();
          if(cm == 1){    
        Scanner edad = new Scanner(System.in);
         int ed;
         System.out.println("eddad");
         ed = edad.nextInt();
          if(ed >= 18){
        System.out.println("tu contraseña");
        GenerarContrasena cada = new GenerarContrasena();
              System.err.println("CONTRASEÑA:"+ cada.generarcadena(16));
               Scanner nombre = new Scanner(System.in);

        guardarContra guac = new guardarContra();
        System.err.println("CONTRASEÑA:"+ cada.generarcadena(16));
               Scanner guarc = new Scanner(System.in);
        String nom;
        System.out.println("ingresa tu nombre");
        nom = nombre.nextLine();
        
        Scanner APELLp = new Scanner(System.in);
        String APEL;
        System.out.println("ingresa tu apellido");
        APEL = APELLp.nextLine();
        
        Scanner CORRE = new Scanner(System.in);
        String C;
        System.out.println("ingresa tu cui");
        C = CORRE.nextLine();
        
        Scanner sexo = new Scanner(System.in);
        String s;
        System.out.println("ingresa tu sexo");
        s = sexo.nextLine();
        
        Scanner FECHAN = new Scanner(System.in);
        String FECHA;
        System.out.println("ingresa tu fecha de nacimiento");
        FECHA =FECHAN.nextLine();
        
        Scanner DIRECCION = new Scanner(System.in);
        String DIRRECCIONR;
        System.out.println("ingresa tu direccion de recidencia");
        DIRRECCIONR = DIRECCION.nextLine();
        
        Scanner DIRECCIONd = new Scanner(System.in);
        String DIRRECCIONRd;
        System.out.println("ingresa tu direccion departamento");
        DIRRECCIONRd = DIRECCIONd.nextLine();
        
        Scanner DIRECCIONM = new Scanner(System.in);
        String DIRRECCIONRM;
        System.out.println("ingresa tu municipio de recidencia ");
        DIRRECCIONRM = DIRECCIONM.nextLine();
          }       
        
        if (R==3){
            System.out.println("ACCESO DEL VOTANTE ");
            //INGRESAR CORREO Y CONTRASEÑA 
            //CUI 
            
            System.out.println("EJECUCION DE ELECCIONES ");
            System.out.println("ELIJE UNA OPCION");
            System.out.println("ESCRIBE'SI'PARACONFIRMAR ");
        }  
        
        if(R==4)
            System.out.println("AUDITOR");
        //MOSTRAR LA CANTIDAD DE VOTOS PARA CADA CANDIDATO
        //CANTIDAD DE VOTOS DE HOMBRES Y MUJERES CON PORCENTAEGE,LUGAR
        
          }
        }
        
        
        }
        else{
              System.out.println("verifica tu contraseña"); 
                }
        }
    }
    
    
