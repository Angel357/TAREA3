
package tarea3;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Tarea3 {
    Scanner scan=new Scanner(System.in);
    Scanner scan2=new Scanner(System.in);
    int opcion, opcionUsuario,contUsers;
    String[] users;
    String Vusuario, P1,P2;
  
    public static void main(String[] args) {
        Tarea3 t=new Tarea3();
        t.Menu();
    }
    public void Menu(){
        System.out.println("                            Tarea 3\n");
        System.out.println("                            201603079\n");
        System.out.println("                          1. Usuarios");
        System.out.println("                          2. Palabras Palindromas");    
        System.out.println("                          3. Salir\n");   
        opcion=scan.nextInt();
        switch(opcion){
            case 1:
                Usuarios();
                break;
            case 2:
                Palindromas();
                break;
            case 3:
                System.exit(0);
                break;
            default:
               System.out.println("\n\n       Solo puede usar numeros del 1 al 3 intentelo de nuevo\n\n");
               Menu();
                break;
        } 
    }
    public void Usuarios(){
            System.out.println("\n\n                    Menu de usuarios\n");
            System.out.println("                   1. Ingresar Usuarios");
            System.out.println("                   2. Mostrar todos los usurios");
            System.out.println("                   3. Mostrar usuario personalizado");
            System.out.println("                   4. Menu Principal");
            System.out.println("                   5. Salir");
            opcion=scan.nextInt();
            switch(opcion){
                case 1:
                    users=new String[5];
                    System.out.println("\n\n");
                    for(int x=0;x<5;x++){
                        System.out.println("Ingrese el usuario numero: "+(x+1));
                        users[x]=scan.next();
                    }
                    System.out.println("\n\n");
                    Usuarios();
                    break;
                case 2:
                    System.out.println("\n\n");
                    System.out.println("     Usuarios Registrados");
                    for(int x=0;x<5;x++){
                        System.out.println(x+1+". "+users[x]);
                    }
                    Usuarios();
                    break;
                case 3:
                    contUsers=0;
                    System.out.println("\n\n");
                    System.out.println("\nQue usuario desea verificar?\n");
                    Vusuario=scan.next();
                    for(int x=0;x<5;x++){
                        if(Vusuario.equals(users[x])){
                            System.out.println("                Usuario\n");
                            System.out.println("                "+users[x]);
                            System.out.println("\n\n");
                        }
                        else{
                            contUsers++;
                        }
                    }
                    if(contUsers==5){
                        System.out.println("\n\n");
                        System.out.println("                   El usuario que desea encontrar no se encuentra registrado");
                        System.out.println("\n\n");
                    }
                    Usuarios();
                    break;
                case 4:
                       Menu();
                    break;
                case 5:
                       System.exit(0);
                    break;
                default:
                    System.out.println("\n\n       Solo puede usar numeros del 1 al 5 intentelo de nuevo\n\n");
                    Usuarios();
                    break;
            }
            
        }
    public void Palindromas(){
        P2="";
        System.out.println("\n\n                    Ingrese la palabra que desea conocer si es Palindroma o no.\n\n");
        P1=scan2.nextLine();
        System.out.println("\n\n");
        int n=P1.length()-1;
        for(int x=P1.length();x>0;x--){
            P2=P2+P1.charAt(n);
            n--;
        }
        P1=P1.toLowerCase();
        P1=P1.replaceAll("\\s","");
        P2=P2.toLowerCase();
        P2=P2.replaceAll("\\s","");
        if(P1.equals(P2)){
            System.out.println("\n\n\n           La palabra o frase es Palindroma\n\n\n ");
            Menu();
        }
        else{
            System.out.println("\n\n\n           La palabra o frase NO es Palindroma\n\n\n ");
            Menu();
        }
        
    }
}
