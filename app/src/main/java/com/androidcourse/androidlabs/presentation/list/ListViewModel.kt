package com.androidcourse.androidlabs.presentation.list

import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {

    val animalsList: List<AnimalUIModel> = listOf(
        AnimalUIModel(
            "test1",
            2,
            DOG_IMAGE,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
        ),
        AnimalUIModel(
            "test2",
            11,
            CAT_IMAGE,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
        ),
        AnimalUIModel(
            "test3",
            1,
            DOG_IMAGE,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
        ),
        AnimalUIModel(
            "test4",
            7,
            CAT_IMAGE,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nec eros et orci rutrum vulputate. Morbi molestie quis urna at bibendum. Integer vel velit convallis, malesuada lorem in, molestie felis."
        ),
    )

    companion object {
        private const val DOG_IMAGE = "https://freesvg.org/img/doushouqi-dog.png"
        private const val CAT_IMAGE = "https://freesvg.org/img/black_cat_black_and_white.png"
    }
}