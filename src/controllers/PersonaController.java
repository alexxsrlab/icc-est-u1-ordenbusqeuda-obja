package controllers;

import models.Persona;
import models.Direccion;

public class PersonaController {

    //Metodo de ordenamiento seleccion descendente
    public void sortByDireccionCodigo(Persona[] personas) {
        int n = personas.length;
    
        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                //if (personas[j].getCodigoDireccion() > personas[maxIndex].getCodigoDireccion()) {
                if ( personas[j].compareCodigoDireccion(personas[i])){
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                Persona aux = personas[maxIndex];
                personas[maxIndex] = personas[i];
                personas[i] = aux;
            }
        }
    }

    public Persona  findByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;

        while ( alto >= bajo){
            int center = (bajo + alto)/2;

            if(personas[center].equalsByCodigoDireccion(codigo)){
                return personas[center];
            }
            if(personas[center].compareCodigoDireccion(codigo)){
                bajo = center + 1 ;

            }else{
                alto = center - 1;
            }
        }
        return null;
    }
}
