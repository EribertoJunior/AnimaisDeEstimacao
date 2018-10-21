package br.com.school.cesar.projeto.crudanimaisdeestimao.room.dao

import android.arch.persistence.room.*
import br.com.school.cesar.projeto.crudanimaisdeestimao.model.Animal

@Dao
interface AnimalDAO {

    @Query("Select * From animal")
    fun listar(): List<Animal>

    @Insert
    fun salvar(vararg animal: Animal)

    @Delete
    fun deletar (vararg animal: Animal)

    @Update
    fun atualizar(vararg animal: Animal)
}