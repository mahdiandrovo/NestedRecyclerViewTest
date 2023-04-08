package com.drovo.nestedrecyclerview.utils

import com.drovo.nestedrecyclerview.model.MainModel
import com.drovo.nestedrecyclerview.model.MovieModel

object SampleData {
    private val movieModel = listOf(
        MovieModel(Images.imageUrl0),
        MovieModel(Images.imageUrl1),
        MovieModel(Images.imageUrl2),
        MovieModel(Images.imageUrl3),
        MovieModel(Images.imageUrl4),
        MovieModel(Images.imageUrl5),
        MovieModel(Images.imageUrl6),
        MovieModel(Images.imageUrl7),
        MovieModel(Images.imageUrl8),
        MovieModel(Images.imageUrl9)
    )

    val collection = listOf(
        MainModel("All movies", movieModel),
        MainModel("Want to see", movieModel.reversed()),
        MainModel("Popular movies", movieModel.shuffled()),
        MainModel("War movies", movieModel),
        MainModel("Top rated movies", movieModel)
    )
}