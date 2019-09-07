/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String id;
        String dominio ;
        String password;
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Captura> listaDomino = new ArrayList<>();
        int option;
        option = 0;
        
        
        do{
            System.out.println("1. Agregar");
            System.out.println("2. Imprimir");
            option = teclado.nextInt();
            switch(option){
                case 1:
                    teclado.nextLine();
                    System.out.print("Ingrese un id: ");
                    id = teclado.nextLine();
                    System.out.println("");
                    System.out.print("Ingrese un dominio: ");
                    dominio = teclado.nextLine();
                    System.out.println("");
                    System.out.print("Ingrese la contraseña: ");
                    password = teclado.nextLine();
                    System.out.println("");
                    listaDomino.add(new Captura(id,dominio,password));
                    break;
                case 2:
                    
                    for(int i=0;i < listaDomino.size();i++){
                        System.out.println("El correo es: "+listaDomino.get(i).getId()+"@"+listaDomino.get(i).getDominio());
                    }
                    break;          
            }        
        }while(option<3);
    }
    
}
