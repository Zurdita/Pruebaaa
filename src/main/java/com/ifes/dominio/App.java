package com.ifes.dominio;

import repositorio.IRepositorio;
import repositorio.Repositorio;

public class App {
    public static void main(String[] args) {
        IRepositorio<Persona> repositorio = new Repositorio<>("mysql"); // <- nombre PU

<<<<<<< HEAD
        //Persona p = new Persona("Juan", "Perez", 47188273);
        //repositorio.guardar(p);

        System.out.println("Listo. Verifica en Workbench: SELECT * FROM datanucleus.persona;");

        Persona p2= repositorio.consultar(Persona.class, 1);

        System.out.println(p2);

        
=======
        Persona p = new Persona("Juan", "Perez", 47188273);
        repositorio.guardar(p);

        System.out.println("Listo. Verifica en Workbench: SELECT * FROM datanucleus.persona;");
>>>>>>> ae472f8ac45d2e9e2ccc77bc8ea4df57010c1911
    }
}
