package com.raywenderlich.android.majesticreader.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface DocumentDao {

    @Insert(onConflict = REPLACE)
    fun addDocument(document: DocumentEntity)

    @Query("SELECT * FROM document")
    fun getDocuments(): List<DocumentEntity>

    @Delete
    fun removeDocument(document: DocumentEntity)
}
