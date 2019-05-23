package com.example.taller4.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.taller4.Entities.Editorial

@Dao
interface EditorialDAO {

    @Query("SELECT * FROM Editorial")
    fun getallEditorial():LiveData<List<Editorial>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEditorial(editorial: Editorial)

    @Update
    fun update(editorial: Editorial)

    @Delete
    fun deleteEditorial(editorial: Editorial)

}