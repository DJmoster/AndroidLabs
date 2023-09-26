package com.androidcourse.androidlabs.models

import com.androidcourse.androidlabs.models.interfaces.Voice


class Dog(name: String, age: Int) : Animal(name, age), Voice {
    override fun play() {
        println("Dog ${getName()} playing with ball.")
    }

    override fun voiceLoud() {
        println("BOW-WOW")
    }

    override fun voiceQuiet() {
        println("bow-wow")
    }
}