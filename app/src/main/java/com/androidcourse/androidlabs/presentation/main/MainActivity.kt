package com.androidcourse.androidlabs.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidcourse.androidlabs.R
import com.androidcourse.androidlabs.databinding.ActivityMainBinding
import com.androidcourse.androidlabs.presentation.details.DetailsActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalsList = listOf(
            AnimalUIModel(
                "test1",
                2,
                R.drawable.ic_cat_icon,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
            ),
            AnimalUIModel(
                "test2",
                11,
                R.drawable.ic_cat_icon,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
            ),
            AnimalUIModel(
                "test3",
                1,
                R.drawable.ic_dog_icon,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
            ),
            AnimalUIModel(
                "test4",
                7,
                R.drawable.ic_dog_icon,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
            ),
        )

        val adapter = AnimalAdapter(animalsList) {
            startActivity(
                Intent(this, DetailsActivity::class.java)
                    .putExtra("animalModel", it)
            )
        }

        binding.recyclerView.adapter = adapter


    }
}