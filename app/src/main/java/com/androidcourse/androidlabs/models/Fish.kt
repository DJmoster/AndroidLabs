package com.androidcourse.androidlabs.models

import com.androidcourse.androidlabs.models.enums.FishType
import com.androidcourse.androidlabs.models.interfaces.Swim

class Fish(name: String, age: Int, private val type: FishType) : Animal(name, age), Swim {
    override fun play() {
        when (type) {
            FishType.HOME -> println("You feed the fish ${getName()} in the aquarium.")
            FishType.SEA -> println("You cant play with ${getName()} fish.")
        }
    }

    fun getType(): FishType {
        return this.type
    }

    override fun canSwimInSea(): Boolean {
        return type == FishType.SEA
    }
}