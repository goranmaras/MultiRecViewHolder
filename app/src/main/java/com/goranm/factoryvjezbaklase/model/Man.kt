package com.goranm.factoryvjezbaklase.model

import com.goranm.factoryvjezbaklase.model.enums.CarBodyShapes
import com.goranm.factoryvjezbaklase.model.enums.Colors
import com.goranm.factoryvjezbaklase.model.enums.Species

data class Man(
    override var name: String = "",
    override val height: Float = 0f,
    override val weight: Float = 0f,
    val lName: String = "",
    val adress: String = "",
    val phoneNumber: String = "",
    val auto: Car = Car("", CarBodyShapes.MINIVAN,false,Colors.WHITE)
) : GeneralAtributes{

    override fun eat() {
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }
}