package com.kotlin.application.miprimeraaplicacion

interface AlumnoDao{

    fun guardarAlumno()
    fun buscarAlumno()
    fun eliminarAlumno()
    fun actualizarAlumno()

}

class AlumnoDaoImpl: AlumnoDao {

    private var nombre = ""
    override fun guardarAlumno() {
        TODO("not implemented")
    }

    override fun buscarAlumno() {
        TODO("not implemented")
    }

    override fun eliminarAlumno() {
        TODO("not implemented")
    }

    override fun actualizarAlumno() {
        TODO("not implemented")
    }

    fun getNombre(): String{
        return this.nombre
    }

}

fun main(args: Array<String>) {
    var alumnoDao:AlumnoDao = AlumnoDaoImpl()
    var alumno5 =AlumnoDaoImpl()

}

fun validar(args: Array<Double>){

}
