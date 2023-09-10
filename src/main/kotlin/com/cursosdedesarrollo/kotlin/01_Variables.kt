package com.cursosdedesarrollo.kotlin

fun main(args : Array<String>) {

    // declaración de variable inmutable con inferencia de tipos
    val inmutable = 2
    //  inmutable = 3 // -> no se puede cambiar

    // Declaración de variable mutable con inferencia de tipos
    var mutable = 2
    mutable = 3

    // declaración con tipo sin inferencia de tipo
    val miEntero: Int = 27

    // declaración con tipo sin inferencia de tipo
    val miEntero2: Int
    // inicialización
    miEntero2 = 32

    // más ejemplos de uso
    val fecha = "29th March, 1709"
    // fecha = "25th December, 1600" // no puede cambiar

    var coche = "Toyota Matrix"
    coche = "Mercedes-Maybach" // puede cambiar


    var edad = 12
    //edad = "12 años" // Error: no puede cambiar de tipo


    // Declaración de variables de números
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("Valores de números")
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)


    // Declaración
    val a: Int
    // inicialización
    a = 10000

    println(a === a) // Prints 'true'
    val boxedA: Int = a
    val anotherBoxedA: Int = a
    // No son la misma variable
    println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
    // pero contienen el mismo valor
    println(boxedA == anotherBoxedA) // Prints 'true'

    // más ejemplos de casting
    var miInt3 = 987
    val miLong2 = miInt3.toLong()
    val cadena = "101"
    miInt3 = cadena.toInt()


    // Tipos de números
    val miInt = 55
    val miLong = 40L
    val miFloat = 34.43F
    val miDouble = 45.78
    val miHexadecimal = 0x0F
    val miBinario = 0b010101

    // Tipos de datos Booleanos
    val miTrue: Boolean = true
    val miFalse = false

    // Cadenas de caracteres
    val miString = "This is a String"
    val stringEscapada = "This is a string with new line \n"

    var stringMultiLinea = """
        Primera línea
        Segunda
        Tercera """
    println("Cadena larga:"+stringMultiLinea)
    //concatenación o llenado de cadenas
    val balance = 200
    val mensaje = "El balance es de $balance"
    //mensaje = "El balance es de \$balance"

    stringMultiLinea = """
        $miString
        Primera línea
        Segunda
        Tercera """
    println(mensaje)
    //acceso a métodos de un objeto
    val nombre = "Carlos"
    val mensaje2 = "La primera letra del nombre es ${nombre.first()}"


    // variables nullables
    val a3: String = "abc"
    //a3 = null // compilation error
    //declaro una variable nullable
    var b3: String? = "abc"
    b3 = null // ok
    println("b3 vale ${b3?.length}")

    //intento acceder a un valor sabiendo que debe existir
    val l = a3.length
    println(l)
    //accedo a un valor nullable intentando capturar el valor de la vairable si existe
    var l3: Int? = b3?.length ?:-1

    if(b3!=null){
        l3=b3?.length
    }else{
        l3=-1
    }
    val l2 = b3?.length
    //val l2 = b3!!.length
    println("Valor nullable:"+l2)


    println(b3?.length)
    b3=null
    if (b3 != null) {
        println(b3.length)
    }
    //println(b3!!.length)

    val b5 = b3

}