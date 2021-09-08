package com.grupomabarak.holaandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.io.println as println

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Leccion 1
        //variablesYConstantes()

        // Leccion 2
        //tipoDeDatos()

        // Leccion 3
        //sentenciaIf()

        // Leccion 4
        //sentenciaWhen()

        // Leccion 5
        //arrays()

        //Leccion 6
        //maps()

        //Leccion 7
        //loops()

        //Leccion 8
        //nullSafety()

        // leccion 10
        clases()
    }
    /*
     Funcion de prueba
     */
    private fun variablesYConstantes(){
        // Variables
        var myFirstVariable = " Hola Daniel"
        var myFirstNumber = 1
        println(myFirstVariable)

        // Constantes
        val myFirstConstant = "contantante"
        myFirstVariable = myFirstConstant

    }

    /* Practica tipos de datos*/
    private  fun  tipoDeDatos(){
        //String
        val myString: String = "Hola"
        val myString2 = "Dos"
        val myString3:String = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        var myInt: Int = 1
        var myInt2 = 2
        println( myInt + myInt2)

        // Decimales (Float, Double)
        val myDouble: Double = 1.5
        val myFloat: Float = 5.5f
        println(myDouble + myFloat)

        // Boolean (Bool)
        var myBool : Boolean = true
        var myBool2 = false
    }

    /* practica sentencia If */
    private fun sentenciaIf(){
        var myNumber = 11
        if (myNumber < 10){
            println("$myNumber es menor que 10")
        }else{
            if (myNumber == 10){
                println("$myNumber es igual que 10")
            }else{
                println("$myNumber es mayor que 10")
            }
        }

    }

    private fun sentenciaWhen(){
        // when con String
        val country = "America"

        when(country){
            "España" -> {
                println("El idioma es Español")
            } "México" -> {
            println("El idioma es Español")
            } "USA" -> {
            println("El idioma es Ingles")
            }else -> {
            println("ninguno")
            }
        }
    }

    private  fun arrays(){
        val name = "Brais"
        val surname = "Moure"
        val company = "MoureDev"
        val age = "32"

        // Creacion de un Array
        val myArray:ArrayList<String> = arrayListOf<String>()
        // Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        println(myArray)

        // añador un conjunto de datos
        myArray.addAll(listOf("Hola", "como estan?"))
        println(myArray)

        println(myArray[0])

        //eliminar datos
        myArray.removeAt(4)

        myArray.forEach {
            println(it)
        }

        //Otras operaciones
        println( myArray.count())
    }

    /* Mapas llamados diccionarios */
    private  fun  maps(){
        var myMap: Map<String,Int> = mapOf()

        // añadir valores
        //myMap = mapOf("Brais" to  1,"Daniel" to 5, "Areli" to 29)
        myMap = mutableMapOf("Brais" to  1,"Daniel" to 5, "Areli" to 29)
        println(myMap)

        // añadir un solo valor
        myMap["Octavio"] = 7
        // Actualizar
        myMap.put("Estefany", 50)
        println(myMap)

        println("Daniel " + myMap["Daniel"])

        myMap.remove("Daniel")
        println(myMap)

    }

    fun loops(){
        // Bucles
        var myArray :List<String> = listOf("Hola","Como","Estan","En","Casa")
        var myMap = mutableMapOf("Brais" to  1,"Daniel" to 5, "Areli" to 29)

        // For
        for ( x:String in myArray ){
            println(x)
        }
        for (x in myMap){
            println("${x.key}-${x.value}")
        }

        for ( x in 0 .. 10){
            println(x)
        }

        for ( x in 9 until  30){
            println(x)
        }

        for ( x in 0 .. 10 step 2){
            println(x)
        }

        for ( x in 10  downTo  0){
            println(x)
        }

        val myNumericArray: IntRange = (0 .. 20)
        for (x in myNumericArray){
            println(x)
        }

        // while
        var x = 0

        while( x < 10){
            println(x)
            x ++
        }
    }

    fun nullSafety(){
        var mySafety:String? = "Daniel"
        println(mySafety)
        mySafety = null
        println(mySafety)

        mySafety = "jaja"
        mySafety = null
        mySafety?.let {
            mySafety = mySafety + " " + "Hola"
           println(mySafety)
        }?: run {
            println(mySafety)
        }
    }

    fun clases(){
        val brais = Programmer("Daniel",29, arrayOf(Programmer.len.Foxpro))
        println(brais.name)
        //brais.code()
        val nuevo = Programmer("Sara",30, arrayOf(Programmer.len.Java,Programmer.len.Js), arrayOf(brais))
        //nuevo.code()
        println("${nuevo.friends?.first()?.name }")
    }
}