package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){

    print("Ingrese su edad:")
    var edad = readLine()

    if(edad!!.toInt() > 20)
        println("Eres joven")

}