package com.example.takeyournote

import androidx.lifecycle.LiveData
import com.example.takeyournote.Database.Notes
import com.example.takeyournote.Database.NotesDao

class NoteRepository(private val notesDao: NotesDao) {

    val allNotes: LiveData<List<Notes>> = notesDao.getAllNotes()

    suspend fun insert(note: Notes){
        notesDao.insert(note)
    }

    suspend fun delete(note: Notes){
        notesDao.delete(note)
    }
}