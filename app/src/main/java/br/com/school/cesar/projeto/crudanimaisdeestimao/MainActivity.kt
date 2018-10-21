package br.com.school.cesar.projeto.crudanimaisdeestimao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.AccessDatabase
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.dao.AnimalDAO

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

    }
}
