package com.androidcourse.androidlabs.presentation.list

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimalUIModel(
    val name: String,
    val age: Int,
    val icon: String?,
    val description: String,

    ) : Parcelable