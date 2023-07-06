package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import javax.naming.ldap.LdapName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creando objetos
        Samurai samurai=new Samurai();
        //Samurai samuraiDos=new Samurai();
        Herramienta Herramienta=new Herramienta("escopeta",90.0);
        Herramienta herramientaDos=new Herramienta();
        Scanner entradaporTeclado= new Scanner(System.in);

        // UTILIZAR-ACCERDER-VER-MODIFICAR-OPERAR-REVISAR-VALIDAR
        // LOS ATRIBUTOS Y METODOS DE UNA CLASE
        samurai.setNombres("Cromerov Skill");
        System.out.print("digita la edad del primer samirai: ");
        samurai.setEdad(entradaporTeclado.nextInt());

        System.out.println("*****RESULTADOS***");
        System.out.println("El samurai:" + samurai.getNombres()+ "Tiene: "+samurai.getEdad());

        //System.out.print("Digita el nombre del 2 samurai: ");
        //samuraiDos.nombres=entradaporTeclado.nextLine();


    }
}