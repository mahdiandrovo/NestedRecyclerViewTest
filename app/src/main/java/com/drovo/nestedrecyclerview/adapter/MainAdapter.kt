package com.drovo.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drovo.nestedrecyclerview.R
import com.drovo.nestedrecyclerview.databinding.ItemParentBinding
import com.drovo.nestedrecyclerview.model.MainModel

class MainAdapter(
    private val collection: List<MainModel>
): RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {

    inner class CollectionViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val binding: ItemParentBinding = ItemParentBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_parent, parent, false)
        return CollectionViewHolder(view)
    }

    override fun getItemCount() = collection.size

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            txtviwMovieName.text = collection.title

            val movieAdapter = MovieAdapter(collection.movieModels)
            recyclerviwMovieChild.adapter = movieAdapter
        }
    }
}