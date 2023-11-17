package com.androidcourse.androidlabs.presentation.main

import android.os.Parcelable
import com.androidcourse.androidlabs.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimalUIModel(
    val name: String,
    val age: Int,
    val icon: Int = R.drawable.ic_cat_icon,
    val description: String,

    ) : Parcelable
