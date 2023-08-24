package com.iagocarvalho.eletriccarappdioxml.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iagocarvalho.eletriccarappdioxml.R
import com.iagocarvalho.eletriccarappdioxml.domain.Carro

class CarAdapter(private val carro: List<Carro>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewPreco: TextView
        val tvBateria: TextView
        val tvPotencia: TextView
        val tvRecarga: TextView

        init {
            view.apply {
            textViewPreco = view.findViewById(R.id.valor)
            tvBateria = view.findViewById(R.id.Bateria_Valor)
            tvPotencia = view.findViewById(R.id.Potecia_Valor)
            tvRecarga = view.findViewById(R.id.recarga_Valor)

            }


        }

    }
    // cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }


    // pega a quantidade de carros da lista
    override fun getItemCount(): Int = carro.size


    // pega o conteudo da view e troca pela informação do item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.textViewPreco.text = carro[position].preco
        holder.tvBateria.text = carro[position].bateria
        holder.tvPotencia.text = carro[position].potencia
        holder.tvRecarga.text = carro[position].recarga
    }
}

