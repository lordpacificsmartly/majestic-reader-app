package com.raywenderlich.android.majesticreader.framework.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkDao;", "", "addBookmark", "", "bookmark", "Lcom/raywenderlich/android/majesticreader/framework/db/BookmarkEntity;", "getBookmarks", "", "documentUri", "", "removeBookmark", "app_debug"})
public abstract interface BookmarkDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity bookmark);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM bookmark WHERE documentUri = :documentUri")
    public abstract java.util.List<com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity> getBookmarks(@org.jetbrains.annotations.NotNull()
    java.lang.String documentUri);
    
    @androidx.room.Delete()
    public abstract void removeBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity bookmark);
}