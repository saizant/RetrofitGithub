package com.vogella.android.retrofitgithub;

/**
 * Creado por Antonio Sáiz. Fecha: 01/02/2017.
 */

//Usado para mapear las claves JSON al objeto por GSON
public class GithubRepo {

    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
