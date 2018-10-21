package br.com.school.cesar.projeto.crudanimaisdeestimao.util

import android.app.Application
import android.arch.persistence.room.Room
import br.com.school.cesar.projeto.crudanimaisdeestimao.R
import br.com.school.cesar.projeto.crudanimaisdeestimao.room.AppDataBase

class MyAplication : Application() {

    companion object {
        var database: AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
                this,
                AppDataBase::class.java,
                "testestestes").allowMainThreadQueries().build()
    }
}