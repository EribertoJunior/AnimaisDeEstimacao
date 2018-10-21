package br.com.school.cesar.projeto.crudanimaisdeestimao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.school.cesar.projeto.crudanimaisdeestimao.adapter.AdapterRecyclerViewAnimais
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.AccessDatabase
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.dao.AnimalDAO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var animalDAO: AnimalDAO

    override fun onRestart() {
        super.onRestart()
        carregarLista()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalDAO = AccessDatabase.open(this).animalDao()
        val teste = Animal()
        teste.nome = "Tobby"
        teste.especie = "Cachorro"
        teste.raca = "Pudle"

        animalDAO.salvar(teste)

        carregarLista()

        floatingActionButton.setOnClickListener {
            startActivity(Intent(this, FormularioAnimalActivity::class.java))
        }

        recyclerViewListaDeAnimais.layoutManager = LinearLayoutManager(this)

    }

    fun carregarLista() {
        recyclerViewListaDeAnimais.adapter = AdapterRecyclerViewAnimais(animalDAO.listar())
    }
}
