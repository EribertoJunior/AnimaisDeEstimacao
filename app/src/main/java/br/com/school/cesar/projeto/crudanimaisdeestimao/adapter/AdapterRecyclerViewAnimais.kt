package br.com.school.cesar.projeto.crudanimaisdeestimao.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.school.cesar.projeto.crudanimaisdeestimao.R
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal

class AdapterRecyclerViewAnimais(
        private val mValues: List<Animal>
) : RecyclerView.Adapter<AdapterRecyclerViewAnimais.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.animal_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mValues.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        /*holder.tvNomeCliente.text = item.cliente.pessoa.nome
        holder.tvResumoEndereco.text = item.enderecoResumido() //DTC_ESTADO().intToSiglaESTADO(item.pessoa.uf!!.toInt())

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            holder.tvFone.text = PhoneNumberUtils.formatNumber(item.cliente.pessoa.celular, Locale.getDefault().country)
        else
            holder.tvFone.text = PhoneNumberUtils.formatNumber(item.cliente.pessoa.celular)

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }*/
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        /*val tvNomeCliente: TextView = mView.tvNomeCliente
        val tvResumoEndereco: TextView = mView.tvResumoEndereco
        val tvFone: TextView = mView.tvFone*/

        /*override fun toString(): String {
            return super.toString() + " '" + tvNomeCliente.text + "'"
        }*/
    }
}