package com.androidcourse.androidlabs.presentation.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidcourse.androidlabs.R
import com.androidcourse.androidlabs.databinding.ItemAnimalBinding
import com.bumptech.glide.Glide

class AnimalAdapter(
    private val animalsList: List<AnimalUIModel>,
    private val onItemClick: (model: AnimalUIModel) -> Unit = {}
) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val animalBinding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context))

        return AnimalViewHolder(animalBinding, onItemClick)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animalsList[position])
    }

    override fun getItemCount(): Int {
        return animalsList.size
    }

    class AnimalViewHolder(
        private val animalBinding: ItemAnimalBinding,
        private val onItemClick: (model: AnimalUIModel) -> Unit
    ) :
        RecyclerView.ViewHolder(animalBinding.root) {

        fun bind(model: AnimalUIModel) {
            with(animalBinding) {
                Glide.with(itemView)
                    .load(model.icon)
                    .centerCrop()
                    .placeholder(animalBinding.imageView.drawable)
                    .error(R.drawable.ic_broken_image)
                    .fallback(R.drawable.ic_no_image)
                    .into(animalBinding.imageView)


                textName.text = model.name
                textAge.text = model.age.toString()

                button.setOnClickListener {
                    onItemClick(model)
                }
            }
        }

    }
}