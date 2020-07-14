package com.goranm.factoryvjezbaklase.model.enums

sealed class Species {
    object GermanShepard: Species()
    class Bulldog(val vacinatted: Boolean): Species()
    class Puddle(val vacinatted: Boolean): Species()
}
fun checkIsDogVaccinated(species: Species) : Boolean{
    return when(species){
        is Species.GermanShepard -> false
        is Species.Bulldog -> species.vacinatted
        is Species.Puddle -> species.vacinatted
    }
}