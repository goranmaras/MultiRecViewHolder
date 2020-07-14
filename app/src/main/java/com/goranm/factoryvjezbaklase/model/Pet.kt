package com.goranm.factoryvjezbaklase.model

import com.goranm.factoryvjezbaklase.model.enums.Colors
import com.goranm.factoryvjezbaklase.model.enums.Species

data class Pet(
    override val name: String,
    override val height: Float,
    override val weight: Float,
    override val species: Species,
    override val age: Int,
    override val color: Colors,
    val vaccinated: Boolean
): Animal(name, height, weight, species, age, color) {

    override fun sleep() {
        super.sleep()
    }
    override fun repeat() {
        super.repeat()
    }

}