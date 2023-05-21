package com.example.lab2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab2.databinding.ItemPlayerBinding

class PlayerAdapter(
    val context: Context,
    val onClick: (model: Player, position: Int) -> Unit,
) : RecyclerView.Adapter<PlayerAdapter.PlayerHolder>() {
    private val list = ArrayList<Player>()

    inner class PlayerHolder(val binding: ItemPlayerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(player: Player, position: Int) {
            binding.tvName.text = player.name
            binding.tvDisc.text = player.Number.toString()
            Glide.with(context)
                .load(player.ResId)
                .into(binding.iv)
            binding.position.text = player.Position
            binding.button.setOnClickListener {
                onClick(player, position)
                val navController = binding.root.findNavController()
                val bundle = Bundle()
                bundle.putString("myTextView", player.Plot)
                bundle.putString("myTextView2", player.name)
                bundle.putInt("myImage", player.ResId)
                navController.navigate(R.id.firstToSecond, bundle)


            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerHolder {
        val view = ItemPlayerBinding.inflate(LayoutInflater.from(context), parent, false)
        return PlayerHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlayerHolder, position: Int) {
        val manga = list[position]
        holder.bindView(manga, position)


    }

    fun setNewData(newList: List<Player>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()

    }
}