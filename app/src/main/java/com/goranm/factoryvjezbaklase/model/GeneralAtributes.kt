package com.goranm.factoryvjezbaklase.model

interface GeneralAtributes{
    val name: String
    val height: Float
    val weight: Float

    fun eat(){
        println("eating...")
    }
    fun sleep(){
        println("sleeping...")
    }
    fun repeat(){
        println("repeating...")
    }
}