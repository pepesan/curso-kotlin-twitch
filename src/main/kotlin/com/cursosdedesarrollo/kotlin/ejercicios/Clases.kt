package com.cursosdedesarrollo.kotlin.ejercicios

// 2
class Cliente// 8
    (
    nombre: String = "",
    direccion: String = "",
    tlf: String = "",
    email: String = "",// 5
    private var cotizacion: Float = 0F,// 10
    private var totalCotizaciones: Float = 0F
    ) {
    var nombre: String? = nombre
    var direccion: String? = direccion
    var tlf: String? = tlf
    var email: String? = email

    // 6
    fun setCotizacion (
        cotizacion :Float){
        // 11
        this.totalCotizaciones+=
            cotizacion
        // 6
        this.cotizacion = cotizacion
    }

    // opcional
    fun getCotizacion(): Float{
        return  this.cotizacion
    }

    fun getTotalCotizaciones(): Float{
        return  this.totalCotizaciones
    }



    // opcional
    override fun toString(): String {
        return "Cliente(cotizacion=$cotizacion, totalCotizaciones=$totalCotizaciones, nombre=$nombre, direccion=$direccion, tlf=$tlf, email=$email)"
    }

}
// 1
fun main() {
    // 3
    val indra = Cliente()
    // 4
    indra.nombre = "Indra"
    indra.direccion = "Madrid"
    indra.tlf = "911234567"
    indra.email = "info@indra.es"
    // 7
    indra.setCotizacion(23F)

    println(indra)

    // 9
    val cgi = Cliente()
    println(cgi)

    val nntData = Cliente("NTT Data")
    println(nntData)

}