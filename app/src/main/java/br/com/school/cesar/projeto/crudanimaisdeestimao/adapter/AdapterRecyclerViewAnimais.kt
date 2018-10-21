package br.com.school.cesar.projeto.crudanimaisdeestimao.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import br.com.school.cesar.projeto.crudanimaisdeestimao.R
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal
import kotlinx.android.synthetic.main.animal_item.view.*

class AdapterRecyclerViewAnimais(
        private val mValues: List<Animal>
) : RecyclerView.Adapter<AdapterRecyclerViewAnimais.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.animal_item, parent, false)
        return ViewHolder(view)
    }
    private val mOnClickListener: View.OnClickListener
    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as Animal
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            //mListener?.onListFragmentInteraction(item)
            Toast.makeText(v.context, item.nome, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = mValues.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.tvNome.text = item.nome
        holder.tvRaca.text = item.raca
        holder.tvEspecie.text = item.especie

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val tvNome: TextView = mView.tvNome
        val tvEspecie: TextView = mView.tvEspecie
        val tvRaca: TextView = mView.tvRaca

        override fun toString(): String {
            return super.toString() + " '" + tvNome.text + "'"
        }
    }
}