package com.kotlin.application.miprimeraaplicacion

abstract class Persona {
    var nombre:String?=null
    abstract fun correr()
    abstract fun saltar()
}

class Hombre :Persona() {
    override fun correr() {
        TODO("not implemented")
    }

    override fun saltar() {
        TODO("not implemented")
    }
}