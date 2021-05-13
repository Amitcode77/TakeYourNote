package com.example.takeyournote.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.takeyournote.Database.Notes

@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Notes)

    @Delete
    suspend fun delete(note: Notes)

    @Query("Select * from notes_table order by id asc")
    fun getAllNotes(): LiveData<List<Notes>>
}