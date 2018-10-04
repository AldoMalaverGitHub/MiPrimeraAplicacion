package com.kotlin.application.miprimeraaplicacion

open class Alumno1(){
    var nombres: String? = null
    var edad: Int? = null

    constructor(nombres: String, edad: Int):this(){
        this.nombres = nombres
        this.edad = edad
        println("nombres: ${nombres}")
        println("edad: ${edad}")
    }
}
class Profesor: Alumno1{

    constructor(nombres: String, edad: Int, apellidos: String):
            super(nombres, edad){

    }

}

fun main(args: Array<String>){
    var alumno1 = Alumno1("Aldo", 18)
    var profesor1 = Profesor("Aldo", 18, "Malaver")
    var alumno2 = Alumno(1, "Aldo", "44131203")

}
