package com.androidcourse.androidlabs.models

abstract class Animal(
    private val name: String,
    private val age: Int,
) {

    fun getName(): String {
        return this.name
    }

    fun getAge(): Int {
        return this.age
    }

    abstract fun play()
}