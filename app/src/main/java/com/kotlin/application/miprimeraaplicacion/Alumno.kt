package com.kotlin.application.miprimeraaplicacion

class Alumno {

    var codigo: Int? = null
    var nombre: String?= null
    var documento: String?= null

    constructor(codigo: Int, nombre: String, documento: String){
        this.codigo = codigo
        this.nombre = nombre
        this.documento = documento
        println("Codigo: ${this.codigo}")
        println("Nombre: ${this.nombre}")
        println("Documento: ${this.documento}")
    }

}

fun main(args: Array<String>){
    var alumno1 = Alumno(1, "Aldo",
            "44131203")



}