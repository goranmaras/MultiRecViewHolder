import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.goranm.factoryvjezbaklase.adapter.DataWrapper
import com.goranm.factoryvjezbaklase.R
import com.goranm.factoryvjezbaklase.model.DataForDisplay
import com.goranm.factoryvjezbaklase.model.Man
import com.goranm.factoryvjezbaklase.model.Pet
import kotlinx.android.synthetic.main.item_animal.view.*
import kotlinx.android.synthetic.main.item_human.view.*
import kotlinx.android.synthetic.main.item_human_and_pet.view.*

class RecyclerViewAdapter(private val list: List<DataWrapper>): RecyclerView.Adapter<RecyclerViewAdapter.BaseViewHolder<Any>>() {

    inner class HumanViewHolder(itemView: View): BaseViewHolder<Man>(itemView){
        override fun bind(item: Man) {
            itemView.tvNameOfPerson.text = item.name
            itemView.tvLastName.text = item.lName
            itemView.tvAdress.text = item.adress
            itemView.tvPhoneNum.text = item.phoneNumber
        }
    }

    inner class PetViewHolder(itemView: View): BaseViewHolder<Pet>(itemView){
        override fun bind(item: Pet) {
            itemView.tvAnimalName.text = item.name
            itemView.tvAnimalSpecies.text = item.species.toString()
        }
    }

    inner class DataViewHolder(itemView: View): BaseViewHolder<DataForDisplay>(itemView){
        override fun bind(item: DataForDisplay) {
            itemView.tvDataForViewPerson.text = item.man.name
            itemView.tvDataForViewPet.text = item.pet.name
        }
    }

    abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: T)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Any> {
        return when(viewType) {
            R.layout.item_human -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_human, parent, false)
                HumanViewHolder(view) as BaseViewHolder<Any>
            }
            R.layout.item_animal -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_animal, parent, false)
                PetViewHolder(view) as BaseViewHolder<Any>
            }
            R.layout.item_human_and_pet -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_human_and_pet, parent, false)
                DataViewHolder(view) as BaseViewHolder<Any>
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].layoutID
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Any>, position: Int) {
        val element = list[position].data
        holder.bind(element)
    }

    override fun getItemCount(): Int = list.size


}