package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>) {
    println("Ingrese tamanio de Pizza: 1 => pequeña," +
            "2 => mediana, 3 => grande")
    var tamanio = readLine()!!.toInt()
    var precio: Int?? = null
    when (tamanio) {
        1 -> precio = 5
        2 -> precio = 10
        3 -> precio = 20
        else -> println("No ingreso correcto tamanio")
    }
    println ("El precio es: $precio")

    print("Ingrese nota:")
    var nota:Int = readLine()!!.toInt()

    when(nota){
        0,1,2,3,4,5,6,7,8,9,10 -> println("Jalado")
        11,12,13 -> println("Regular")
        14,15,16 -> println("Bueno")
        17,18 -> println("Excelente")
        19,20 -> println("sobresaliente")
        else -> print("fuera de rango")
    }

}