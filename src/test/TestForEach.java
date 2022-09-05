
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
       //NO ES POSIBLE UTILIZAR VAR!!! ARRAYS
       //PAra tipos de variables si es posible el tipo var
        int edades[] = {5,4,2,6,8};
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println("Edad: "+ edades[i]);
//        }
//ForEach
        for (int edad : edades) 
        {
            System.out.println("Edad: "+ edad);    
        }
        //No tenemos acceso a un contador
        //Si se necesita un indice[x]se necesita for no forEach
        
        Persona personas[] = {new Persona("Alex"),new Persona("Agustin"),new Persona("Lourdes")};
        for(Persona persona:personas)//Se puede utilizar el tipo Object pero se recomienda utilizar el tipo del mismo"Persona"
        {
            System.out.println(persona);   
        }
    }
    
}
