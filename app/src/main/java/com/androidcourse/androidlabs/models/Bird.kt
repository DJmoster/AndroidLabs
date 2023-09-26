package com.androidcourse.androidlabs.models

import com.androidcourse.androidlabs.models.interfaces.Voice

class Bird(name: String, age: Int) : Animal(name, age), Voice {
    override fun play() {
        println("You feed the bird ${getName()} with bread.")
    }

    override fun voiceLoud() {
        println("BIRDSONG")
    }

    override fun voiceQuiet() {
        println("birdsong")
    }
}