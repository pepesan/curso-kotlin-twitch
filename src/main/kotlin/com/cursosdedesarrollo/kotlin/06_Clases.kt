package com.cursosdedesarrollo.kotlin

// Declaración de Clase
class Factura {
}

// Clase con constructora primaria
class Clase
    constructor(
        var nombre: String
    ){

}

// Declaración de clase con varias
// constructoras y métodos
class Persona {
    var nombre: String? = null

    constructor() {
        this.nombre = ""
    }

    constructor(nombre: String) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Persona[nombre:" + this.nombre + "]"
    }
}

// getters y setter sencillos en Kotlin
class Girl {
    var age: Int = 0
        //get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge: Int = 0
}

// getters y setter tradicionales
class Contador{
    private var contador:Int=0

    constructor(contador:Int =0){
        this.contador=contador
    }
    fun getContador():Int{
        return this.contador
    }
    fun inc(valor:Int=1){
        this.contador+=valor
    }
}

// clase de tipo data
data class Person(var name: String="") {

}

data class Person2(var name: String="") {
    var age: Int = 0
}


// clases de tipo Open
open class Madre{
    var nombre: String? = null

    constructor(){
        this.nombre=""
    }
    constructor(nombre: String){
        this.nombre=nombre
    }
    override fun toString():String{
        return "Madre[nombre:"+
                this.nombre+"]"
    }
}

class Hija: Madre {
    var herencia:String? = null
    constructor(){
        super.nombre=""
        this.herencia=""
    }
    constructor(nombre:String){
        super.nombre=nombre
        this.herencia=""
    }
    constructor(
        nombre:String,
        herencia:String){
        super.nombre=nombre
        this.herencia=herencia
    }
    override fun toString():String{
        return "Hija[herencia:"+
                this.herencia+
                ",nombre:"+
                this.nombre+"]"
    }
}


class Hija2: Madre  {
    var herencia:String? = null
    constructor()
            : super(""){
        this.herencia=""
    }
    constructor(nombre:String)
            : super(nombre){
        this.herencia=""
    }
    constructor(
        nombre:String,
        herencia:String)
            : super (nombre){
        this.herencia=herencia
    }
    override fun toString():String{
        return "Hija2[herencia:"+
                this.herencia+
                ",nombre:"+
                this.nombre+"]"
    }
}

class Hija3: Madre  {
    var herencia:String? = null

    constructor(
        nombre:String  = "",
        herencia:String = ""):
            super (nombre){
        this.herencia=herencia
    }
    override fun toString():String{
        return "Hija3[herencia:"+
                this.herencia+
                ",nombre:"+
                this.nombre+"]"
    }
}



class Hija4(
    nombre: String = "",
    herencia: String = "")
        : Madre(nombre) {

    private var herencia:String?
        = herencia

    fun getHerencia(): String?{
        return this.herencia;
    }

    fun setHerencia(herencia: String){
        this.herencia = herencia;
    }
    override fun toString():String{
        return "Hija4[herencia:"+
                this.herencia+
                ",nombre:"+
                this.nombre+"]"
    }
}


// Ejemplos de Interfaces

interface MyInterface {
    val prop: Int // abstract
    fun bar()
    fun foo() {
        println("foo")
    }
}
class Child : MyInterface {
    override val prop: Int = 29
    override fun bar() {
        println("bar")
    }
}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}


interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b


fun main(args : Array<String>) {

    // Declaración de Objeto
    val objeto=Factura()
    println(objeto)

    // Invocación con clase con constructora
    val clase=Clase("nombre")
    println(clase.nombre)

    // objetos de clase con llamadas
    // a varias constructoras
    var persona=Persona()
    println(persona)
    persona=Persona("Pepe")
    println(persona)
    persona.nombre="Juan"
    println(persona)

    println("Chicas")
    // Invocación a getters y setters
    // sencillos
    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: edad actual = ${maria.actualAge}")
    println("Maria: edad fingida = ${maria.age}")


    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: edad actual = ${angela.actualAge}")
    println("Angela: edad fingida = ${angela.age}")

    // getters y setter tradicionales
    var contador=Contador(2)
    contador.inc(2)
    println(contador.getContador())

    // clase de tipo data
    var person: Person= Person()
    println(person)
    println(person.name)

    person= Person("Pepe")
    println(person)
    println(person.name)

    var person2: Person2= Person2()
    println(person2)
    println(person2.name)
    println(person2.age)

    person2= Person2("Pepe")
    println(person2)
    println(person2.name)


    // Ejemplos de herencia
    println("ejemplos de herencia")
    val objetoMadre=Madre()
    println(objetoMadre)
    val objetoMadreParametro =
        Madre("Maria")
    println(objetoMadreParametro)

    var hija=Hija()
    println(hija)
    hija=Hija("Luisa")
    println(hija)
    println(hija.nombre)
    hija=Hija(
        "Luisa",
        "Total")
    println(hija)
    println(hija.nombre)
    println(hija.herencia)

    val hija2 = Hija()
    println(hija2)

    val hija4 = Hija4(
        "Alicia",
        "Parcial")
    println(hija4)
    println(hija4.nombre)
    println(hija4.getHerencia())


    val child=Child()
    child.foo()
    child.bar()






    val b = BaseImpl(10)
    Derived(b).print()
}


