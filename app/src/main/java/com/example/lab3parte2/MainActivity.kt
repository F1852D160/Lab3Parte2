package com.example.lab3parte2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val personasList = mutableListOf<Persona>(
            Persona("RAFA","GORGORI","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("MARIBEL","CONDORI","74859632"
                ,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPnZaYySg3F_If2xit9Y2Fo9LTvP74zVdIUYZf772HkLLyk86L44aRjVti00a8NgLCD4E&usqp=CAU"
            ),
            Persona("JUANA","AGUIRRE","74859632",
                "https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("GUADALUPE","MEJIA","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("SILVANA","GUTIERREZ","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),
            Persona("MARIO","MARTINEZ","74859632"
                ,"https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U"
            ),

            )

            val personasAdapter = PersonasAdapter(applicationContext,personasList)
            val r = findViewById<RecyclerView>(R.id.recycler1)
            r.adapter = personasAdapter

          val layout = LinearLayoutManager(applicationContext)
           layout.orientation = LinearLayoutManager.VERTICAL

        r.layoutManager = layout


    }
}