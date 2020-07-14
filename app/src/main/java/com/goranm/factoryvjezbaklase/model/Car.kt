package com.goranm.factoryvjezbaklase.model

import com.goranm.factoryvjezbaklase.model.enums.CarBodyShapes
import com.goranm.factoryvjezbaklase.model.enums.Colors

data class Car(
    val model: String,
    val carbodyshape: CarBodyShapes,
    val used: Boolean,
    val color: Colors
) {



}