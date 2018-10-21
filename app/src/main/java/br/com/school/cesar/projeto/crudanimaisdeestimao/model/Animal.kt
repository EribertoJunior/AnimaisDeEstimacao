package br.com.school.cesar.projeto.crudanimaisdeestimao.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity
class Animal : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
    lateinit var nome: String
    lateinit var especie: String
    lateinit var raca: String
}