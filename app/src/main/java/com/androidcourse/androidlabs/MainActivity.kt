package com.androidcourse.androidlabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidcourse.androidlabs.models.Animal
import com.androidcourse.androidlabs.models.Bird
import com.androidcourse.androidlabs.models.Dog
import com.androidcourse.androidlabs.models.Fish
import com.androidcourse.androidlabs.models.enums.FishType
import com.androidcourse.androidlabs.models.interfaces.Swim
import com.androidcourse.androidlabs.models.interfaces.Voice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animals = arrayOf<Animal>(
            Dog("Jonny Silverhand", 5),
            Bird("V", 2),
            Fish("Jack", 1, FishType.SEA)
        )

        animals.forEach {
            it.play()
        }

        val fish: Swim = Fish("Jack", 1, FishType.HOME)
        println(fish.canSwimInSea())

        val animalsWithVoice = arrayOf<Voice>(
            Dog("Jonny Silverhand", 5),
            Bird("V", 2)
        )

        animalsWithVoice.forEachIndexed { index, element ->
            if (index % 2 == 0) {
                element.voiceLoud()

            } else {
                element.voiceQuiet()
            }
        }
    }
}