package com.example.lab3parte2

data class Persona(var nombre:String, var apellido:String,var telefono:String, var imagen:String){


    override fun toString(): String {
        return nombre?:""
    }

}
