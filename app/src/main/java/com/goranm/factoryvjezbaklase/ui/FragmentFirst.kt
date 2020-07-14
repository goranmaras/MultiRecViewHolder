package com.goranm.factoryvjezbaklase.ui

import RecyclerViewAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.goranm.factoryvjezbaklase.adapter.DataWrapper
import com.goranm.factoryvjezbaklase.R
import com.goranm.factoryvjezbaklase.model.Car
import com.goranm.factoryvjezbaklase.model.DataForDisplay
import com.goranm.factoryvjezbaklase.model.Man
import com.goranm.factoryvjezbaklase.model.Pet
import com.goranm.factoryvjezbaklase.model.enums.CarBodyShapes
import com.goranm.factoryvjezbaklase.model.enums.Colors
import com.goranm.factoryvjezbaklase.model.enums.Species
import kotlinx.android.synthetic.main.fragment_first.*


class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvLjudi.adapter = RecyclerViewAdapter(generateDataList())
        rvLjudi.layoutManager = LinearLayoutManager(context)
        rvLjudi.setHasFixedSize(true)
    }

    private fun generateDataList(): List<DataWrapper> {

        val auto = Car("Bmw,", CarBodyShapes.SPORTSCAR,true, Colors.BLUE)

        val data = listOf<DataWrapper>(
            DataWrapper(
                R.layout.item_human_and_pet, DataForDisplay(
                    Man("Marin", 2.5f, 70f, "Mirović", "Ranog proljeća 23", "0991235134", auto),
                    Pet("Mrki", 0.5f, 20f, Species.Puddle(true), 4, Colors.RED, true)
                )
            ),
            DataWrapper(
                R.layout.item_human,
                Man("Marin", 2.5f, 70f, "Mirović", "Ranog proljeća 23", "0991235134", auto)
            ),
            DataWrapper(
                R.layout.item_animal,
                Pet("Mrki", 0.5f, 20f, Species.Puddle(true), 4, Colors.RED, true)
            )
        )

        return data
    }
    private fun generateMansList(): List<Man>{
        val auto = Car("Bmw,", CarBodyShapes.SPORTSCAR,true, Colors.BLUE)
       val list = listOf<Man>(Man("Marin", 2.5f,70f,"Mirović","Ranog proljeća 23","0991235134",auto),
           Man("Marin", 2.5f,70f,"Mirović","Ranog proljeća 23","0991235134",auto),
           Man("Marin", 2.5f,70f,"Mirović","Ranog proljeća 23","0991235134",auto),Man("Marin", 2.5f,70f,"Mirović","Ranog proljeća 23","0991235134",auto),
           Man("Marin", 2.5f,70f,"Mirović","Ranog proljeća 23","0991235134",auto),Man("Marin", 2.5f,70f,"Mirović","Ranog proljeća 23","0991235134",auto))

        return list
    }
    private fun generatePetsList(): List<Pet>{
        val list = listOf<Pet>(Pet("Mrki", 0.5f,20f, Species.Puddle(true), 4, Colors.RED,true),
            Pet("Mrki", 0.5f,20f, Species.Puddle(true), 4, Colors.RED,true),
            Pet("Mrki", 0.5f,20f, Species.Puddle(true), 4, Colors.RED,true),
            Pet("Mrki", 0.5f,20f, Species.Puddle(true), 4, Colors.RED,true),
            Pet("Mrki", 0.5f,20f, Species.Puddle(true), 4, Colors.RED,true),
            Pet("Mrki", 0.5f,20f, Species.Puddle(true), 4, Colors.RED,true))
        return list
    }
}