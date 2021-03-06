package io.github.ceraalex99.petandgo;

import Entities.Usuario;
import hibernate.BD.UsuariosBD;

import java.util.List;

public class Main {



    public int sum(int a, int b){
        return a + b;
    }

    public int mult(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.print("hola");


        UsuariosBD usuariosBD = new UsuariosBD();

        //Prueba Add user
        Usuario user = new Usuario("Mercedee10", "Mercedee10", "Mercedee10", "Mercedee10", "1234", ".com");
        usuariosBD.add(user);

        //Update
        user.setNombre("dolores2");
        usuariosBD.update(user);

        //Prueba getUser
        user = usuariosBD.get(11);
        System.out.println(user.toString());

        //Prueba getAll
        List<Usuario> usuarios = usuariosBD.getAll();
        for (Usuario user1 : usuarios) {
            System.out.println(user1.toString());
        }

    }
}
