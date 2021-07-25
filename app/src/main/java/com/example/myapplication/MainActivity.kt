package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var buttonMovie: Button
    private lateinit var textViewMovie1: TextView
    private lateinit var textViewMovie2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonMovie = findViewById(R.id.buttonMovie)
        textViewMovie1 = findViewById(R.id.textViewMovie1)
        textViewMovie2 = findViewById(R.id.textViewMovie2)

        buttonMovie.setOnClickListener {
            Toast.makeText(applicationContext, R.string.button_choose, Toast.LENGTH_SHORT).show()
        }

        //data class and show in App
        val movie1: Movie = Movie("Lost in Translation", "Sophia Coppola")
        textViewMovie1.text = movie1.title + " " + movie1.director

        //copy of movie data class
        val movie2 = movie1.copy(title = "On the Rocks")
        textViewMovie2.text = movie2.title + " " + movie2.director


        //Циклы
        val movies: List<Movie> = listOf(
                Movie("Paterson", "jim Jarmusch"),
                Movie("Pulp Fiction", "Quentin Tarantino"),
                Movie("Scoop", "Woody Allen"),
                movie1,
                movie2
        )

        val year = when(movie1.title) {
            "Lost in Translation" -> 2003
            "On the Rocks" -> 2020
            "Scoop" -> 2006
            "Pulp Fiction" -> 1994
            "Paterson" -> 2016
            else -> "Год не определен"
        }

        val genres = when(movie1.title) {
            "Lost in Translation" -> Genres.DRAMA
            "On the Rocks" -> Genres.DRAMA
            "Scoop" -> Genres.COMEDY
            "Pulp Fiction" -> Genres.CRIMINAL
            "Paterson" -> Genres.DRAMA
            else -> "Год не определен"
        }

        for (movie in movies) {
            Log.i("Movie", movie.toString())
        }
    }
}


