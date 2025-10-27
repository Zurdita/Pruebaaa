package com.ifes.dominio;

import repositorio.IRepositorio;
import repositorio.Repositorio;

public class App {
    public static void main(String[] args) {
        IRepositorio<Persona> repositorio = new Repositorio<>("mysql"); // <- nombre PU

        //Persona p = new Persona("Juan", "Perez", 47188273);
        //repositorio.guardar(p);

        System.out.println("Listo. Verifica en Workbench: SELECT * FROM datanucleus.persona;");

        Persona p2= repositorio.consultar(Persona.class, 1);

        System.out.println(p2);

        
    }
}
