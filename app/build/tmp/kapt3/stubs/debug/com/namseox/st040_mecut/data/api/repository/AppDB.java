package com.namseox.st040_mecut.data.api.repository;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/namseox/st040_mecut/data/api/repository/AppDB;", "Landroidx/room/RoomDatabase;", "()V", "dbDao", "Lcom/namseox/st040_mecut/data/api/dao/Dao;", "st040_mecut1.0.0_11.24.2024_debug"})
@androidx.room.Database(entities = {com.namseox.st040_mecut.data.model.VideoModel.class}, version = 1, exportSchema = false)
public abstract class AppDB extends androidx.room.RoomDatabase {
    
    public AppDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.namseox.st040_mecut.data.api.dao.Dao dbDao();
}