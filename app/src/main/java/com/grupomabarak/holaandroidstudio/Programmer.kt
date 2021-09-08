package com.grupomabarak.holaandroidstudio

class Programmer (val name:String,
                  val edad:Int,
                  val lenguajes:Array<len>,
                  val friends: Array<Programmer>? = null){
    enum class len {
        Python,
        Js,
        Java,
        Foxpro
    }

    fun code(){
        for(lenguaje in lenguajes){
            for (l in lenguajes){
                println(lenguaje)
            }
        }
    }
}