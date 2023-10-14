package com.cursosdedesarrollo.kotlin

class MiClase(nombre: String = "") {
    var nombre: String? = nombre
}
fun main() {
    var objeto = MiClase("ApliArte")
    println(objeto.nombre)
    objeto = MiClase()
    println(objeto.nombre)
}