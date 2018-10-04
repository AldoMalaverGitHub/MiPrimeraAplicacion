package com.kotlin.application.miprimeraaplicacion

enum class TipoArchivoEnum {

    XLS(1, "EXCEL"),
    TXT(2, "NOTEPAD"),
    PDF(3, "ADOBE"),
    AVI(4, "Media Player"),
    FTL(5, "Freemarker");

    var indice:Int?= null
    var valor:String?= null
    constructor(indice: Int, valor: String){
        this.indice = indice
        this.valor = valor
    }
}

fun main(args: Array<String>) {
    println(TipoArchivoEnum.AVI)
}