package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){
    factorial()
}

fun factorial(){
    print("Ingrese número::")
    var numero:Int = readLine()!!.toInt()
    var resultado = 1
    for(x in 1..numero){
        resultado *= x
    }

    println("El factorial es: $resultado")
}