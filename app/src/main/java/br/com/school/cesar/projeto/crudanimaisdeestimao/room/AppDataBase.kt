package br.com.school.cesar.projeto.crudanimaisdeestimao.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.dao.AnimalDAO

@Database(entities = [Animal::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun animalDao() : AnimalDAO
}