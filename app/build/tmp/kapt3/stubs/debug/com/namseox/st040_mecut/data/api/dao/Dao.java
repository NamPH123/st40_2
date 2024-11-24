package com.namseox.st040_mecut.data.api.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\u0003H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/namseox/st040_mecut/data/api/dao/Dao;", "", "deleteAll", "", "deleteTheme", "sound", "Lcom/namseox/st040_mecut/data/model/VideoModel;", "getAllTheme", "", "getItem", "name", "setTheme", "", "st040_mecut1.0.0_11.24.2024_debug"})
@androidx.room.Dao
public abstract interface Dao {
    
    @androidx.room.Query(value = "SELECT * FROM VideoModel")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.namseox.st040_mecut.data.model.VideoModel> getAllTheme();
    
    @androidx.room.Insert
    public abstract long setTheme(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel sound);
    
    @androidx.room.Delete
    public abstract int deleteTheme(@org.jetbrains.annotations.NotNull
    com.namseox.st040_mecut.data.model.VideoModel sound);
    
    @androidx.room.Query(value = "SELECT * FROM VideoModel WHERE id = :name")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.namseox.st040_mecut.data.model.VideoModel> getItem(int name);
    
    @androidx.room.Query(value = "DELETE FROM VideoModel")
    public abstract int deleteAll();
}