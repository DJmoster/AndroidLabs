package com.androidcourse.androidlabs.models

data class Figure(val width: Double, val height: Double) {
    var area: Double = 0.0
        get() = this.width * this.height
        private set
}
