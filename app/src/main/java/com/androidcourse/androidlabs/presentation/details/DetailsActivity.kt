package com.androidcourse.androidlabs.presentation.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidcourse.androidlabs.databinding.ActivityDetailsBinding
import com.androidcourse.androidlabs.presentation.main.AnimalUIModel

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalModel: AnimalUIModel? = intent.getParcelableExtra("animalModel")

        if (animalModel == null) {
            finish()

        } else {
            with(binding) {
                imageView.setImageResource(animalModel.icon)

                textName.text = animalModel.name
                textAge.text = animalModel.age.toString()
                textDescription.text = animalModel.description
            }
        }


    }
}