package com.kotlin.application.miprimeraaplicacion

import java.util.*

fun main(args: Array<String>){
    print("ingrese valor:")
    var valor = readLine()!!.toString()
    var arreglo = valor.split("", "*")
    var factorial = 1

    println("tamanio:" + arreglo.size)
    for(x in 1..arreglo.size - 1)
       factorial *= x

    print(factorial)
    var final = hashMapOf<String, String>()
    while(final.size < factorial){
        Collections.shuffle(arreglo)
        final.put(arreglo.joinToString(prefix = "",
                postfix = "", separator = ""),"1")
    }

}