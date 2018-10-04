package com.kotlin.application.miprimeraaplicacion

fun main(args: Array<String>){

    for(x in 0..10){
        if(x == 5){
            println("encontrado")
            break
        }
        println("aun no se encuentra")
    }

    //numero primos
    var contador = 0
    for(x in 1..10){
        contador = 0
        for(y in 1..x){
            if(x%y != 0) continue
            contador++
        }
        if(contador == 2)
            println("$x es primo")
    }
    var abc = 10
    println(abc.inc())
    println(abc.rem(5))
}