package br.com.school.cesar.projeto.crudanimaisdeestimao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.AccessDatabase
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.dao.AnimalDAO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animalDAO : AnimalDAO = AccessDatabase.open(this).animalDao()
        val teste = Animal()
        teste.nome = "teste"
        teste.especie = "teste"
        teste.raca = "teste"

        animalDAO.salvar(teste)

        floatingActionButton.setOnClickListener {
            startActivity(Intent(this, FormularioAnimalActivity::class.java))
        }

        //recyclerViewListaDeAnimais.layoutManager = LinearLayoutManager(this)

    }
}
