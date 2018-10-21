package br.com.school.cesar.projeto.crudanimaisdeestimao.room

import android.arch.persistence.room.Room
import android.content.Context
import br.com.school.cesar.projeto.crudanimaisdeestimao.R

object AccessDatabase {

    fun open (context: Context) : AppDataBase{
        return Room.databaseBuilder(
                context,
                AppDataBase::class.java,
                context.getString(R.string.database)).allowMainThreadQueries().build()
    }
}