package com.quanty.computers_firm.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quanty.computers_firm.R
import com.quanty.kotlintest.model.components.ComponentsItem
import kotlinx.android.synthetic.main.components_item.view.*


class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var list_start = emptyList<ComponentsItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.components_item, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = list_start[position].Model
        holder.itemView.item_sale.text = list_start[position].idC
        holder.itemView.item_pay.text = list_start[position].Price_R.toString()
    }

    override fun getItemCount(): Int {
        return list_start.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<ComponentsItem>){
        list_start = list
        notifyDataSetChanged()
    }
}