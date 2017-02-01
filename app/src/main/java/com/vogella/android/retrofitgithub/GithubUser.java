package com.vogella.android.retrofitgithub;

/**
 * Creado por Antonio Sáiz. Fecha: 01/02/2017.
 */

//Usado para mapear las claves JSON al objeto por GSON
public class GithubUser {

    String login;
    String name;
    String email;

    @Override
    public String toString() {
        return(login);
    }
}
