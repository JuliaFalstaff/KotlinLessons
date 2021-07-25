package com.example.myapplication

object Repository: IRepository {

    private val movies: List<Movie> = listOf(
            Movie("Paterson", "jim Jarmusch"),
            Movie("Pulp Fiction", "Quentin Tarantino"),
            Movie("Scoop", "Woody Allen"),
    )

    override fun getMovie(): List<Movie> {
        return movies
    }
}

interface IRepository {
    fun getMovie(): List<Movie>
}
