package com.pettinder.app.modules.screentwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pettinder.app.R
import com.pettinder.app.databinding.RowScreentwoBinding
import com.pettinder.app.modules.screentwo.`data`.model.ScreentwoRowModel
import kotlin.Int
import kotlin.collections.List

class ScreentwoAdapter(
  var list: List<ScreentwoRowModel>
) : RecyclerView.Adapter<ScreentwoAdapter.RowScreentwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScreentwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_screentwo,parent,false)
    return RowScreentwoVH(view)
  }

  override fun onBindViewHolder(holder: RowScreentwoVH, position: Int) {
    val screentwoRowModel = ScreentwoRowModel()
    // TODO uncomment following line after integration with data source
    // val screentwoRowModel = list[position]
    holder.binding.screentwoRowModel = screentwoRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ScreentwoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ScreentwoRowModel
    ) {
    }
  }

  inner class RowScreentwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowScreentwoBinding = RowScreentwoBinding.bind(itemView)
  }
}
