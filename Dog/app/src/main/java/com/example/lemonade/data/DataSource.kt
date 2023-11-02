package com.example.lemonade.data

import com.example.lemonade.R
import com.example.lemonade.model.Dog

class DataSource {
    fun loadDog() : MutableList<Dog>{
        return mutableListOf(
            Dog(
                R.drawable.tzeitel,
                R.string.TzeitelN,
                R.string.Tzeitel
            ),
            Dog(
                R.drawable.leroy,
                R.string.LeroyN,
                R.string.Leroy
            ),
            Dog(
                R.drawable.frankie,
                R.string.FrankieN,
                R.string.Frankie
            ),
            Dog(
                R.drawable.nox,
                R.string.NoxN,
                R.string.Nox
            ),
            Dog(
                R.drawable.faye,
                R.string.FayeN,
                R.string.Faye
            ),
            Dog(
                R.drawable.bella,
                R.string.BellaN,
                R.string.Bella
            )
        )
    }
}