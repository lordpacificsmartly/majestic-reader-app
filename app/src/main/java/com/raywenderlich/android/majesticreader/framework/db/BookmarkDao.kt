package com.raywenderlich.android.majesticreader.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface BookmarkDao {

    @Insert(onConflict = REPLACE)
    fun addBookmark(bookmark: BookmarkEntity)

    @Query("SELECT * FROM bookmark WHERE documentUri = :documentUri")
    fun getBookmarks(documentUri: String): List<BookmarkEntity>

    @Delete
    fun removeBookmark(bookmark: BookmarkEntity)
}
