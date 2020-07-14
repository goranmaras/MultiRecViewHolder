package com.goranm.factoryvjezbaklase.model

import com.goranm.factoryvjezbaklase.model.enums.Colors
import com.goranm.factoryvjezbaklase.model.enums.Species

//staviti u interface
abstract class Animal(
     override val name: String,
     override val height: Float,
     override val weight: Float,
     open val species: Species,
     open val age: Int,
     open val color: Colors
) : GeneralAtributes{}