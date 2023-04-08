package com.drovo.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.drovo.nestedrecyclerview.R
import com.drovo.nestedrecyclerview.databinding.ItemMovieBinding
import com.drovo.nestedrecyclerview.model.MovieModel

class MovieAdapter(
    private val movieModel: List<MovieModel>
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val binding: ItemMovieBinding = ItemMovieBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount() = movieModel.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.binding.apply {
            imgviwMovie.load(movieModel[position].imageUrl)
        }
    }

}