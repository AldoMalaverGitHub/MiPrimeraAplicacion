package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){

    print("Ingrese nota:")
    var nota:Int = readLine()!!.toInt()

    if(nota >= 0 && nota <= 10)
        println("Jalado")

    else if(nota >= 11 && nota <= 13)
        println("Regular")

    else if(nota >= 14 && nota <= 16)
        println("Bueno")

    else if(nota >= 17 && nota <= 18)
        println("Excelente")

    else if(nota >= 19 && nota <= 20)
        println("Sobresaliente")
}