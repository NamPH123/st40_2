package com.namseox.st040_mecut.data.api.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.namseox.st040_mecut.data.model.VideoModel;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VideoModel> __insertionAdapterOfVideoModel;

  private final EntityDeletionOrUpdateAdapter<VideoModel> __deletionAdapterOfVideoModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVideoModel = new EntityInsertionAdapter<VideoModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `VideoModel` (`path`,`isVideo`,`check`,`checkCut`,`checkTick`,`id`,`size`,`name`,`date`,`duration`) VALUES (?,?,?,?,?,nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, VideoModel value) {
        if (value.getPath() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPath());
        }
        final int _tmp = value.isVideo() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        final int _tmp_1 = value.getCheck() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        final int _tmp_2 = value.getCheckCut() ? 1 : 0;
        stmt.bindLong(4, _tmp_2);
        final int _tmp_3 = value.getCheckTick() ? 1 : 0;
        stmt.bindLong(5, _tmp_3);
        stmt.bindLong(6, value.getId());
        stmt.bindLong(7, value.getSize());
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        stmt.bindLong(9, value.getDate());
        if (value.getDuration() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDuration());
        }
      }
    };
    this.__deletionAdapterOfVideoModel = new EntityDeletionOrUpdateAdapter<VideoModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `VideoModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, VideoModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM VideoModel";
        return _query;
      }
    };
  }

  @Override
  public long setTheme(final VideoModel sound) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfVideoModel.insertAndReturnId(sound);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteTheme(final VideoModel sound) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfVideoModel.handle(sound);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<VideoModel> getAllTheme() {
    final String _sql = "SELECT * FROM VideoModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfIsVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "isVideo");
      final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "check");
      final int _cursorIndexOfCheckCut = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCut");
      final int _cursorIndexOfCheckTick = CursorUtil.getColumnIndexOrThrow(_cursor, "checkTick");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final List<VideoModel> _result = new ArrayList<VideoModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final VideoModel _item;
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final boolean _tmpIsVideo;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsVideo);
        _tmpIsVideo = _tmp != 0;
        final boolean _tmpCheck;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfCheck);
        _tmpCheck = _tmp_1 != 0;
        final boolean _tmpCheckCut;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfCheckCut);
        _tmpCheckCut = _tmp_2 != 0;
        final boolean _tmpCheckTick;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfCheckTick);
        _tmpCheckTick = _tmp_3 != 0;
        _item = new VideoModel(_tmpPath,_tmpIsVideo,_tmpCheck,_tmpCheckCut,_tmpCheckTick);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final int _tmpSize;
        _tmpSize = _cursor.getInt(_cursorIndexOfSize);
        _item.setSize(_tmpSize);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        _item.setDate(_tmpDate);
        final String _tmpDuration;
        if (_cursor.isNull(_cursorIndexOfDuration)) {
          _tmpDuration = null;
        } else {
          _tmpDuration = _cursor.getString(_cursorIndexOfDuration);
        }
        _item.setDuration(_tmpDuration);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<VideoModel> getItem(final int name) {
    final String _sql = "SELECT * FROM VideoModel WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, name);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfIsVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "isVideo");
      final int _cursorIndexOfCheck = CursorUtil.getColumnIndexOrThrow(_cursor, "check");
      final int _cursorIndexOfCheckCut = CursorUtil.getColumnIndexOrThrow(_cursor, "checkCut");
      final int _cursorIndexOfCheckTick = CursorUtil.getColumnIndexOrThrow(_cursor, "checkTick");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final List<VideoModel> _result = new ArrayList<VideoModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final VideoModel _item;
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final boolean _tmpIsVideo;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsVideo);
        _tmpIsVideo = _tmp != 0;
        final boolean _tmpCheck;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfCheck);
        _tmpCheck = _tmp_1 != 0;
        final boolean _tmpCheckCut;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfCheckCut);
        _tmpCheckCut = _tmp_2 != 0;
        final boolean _tmpCheckTick;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfCheckTick);
        _tmpCheckTick = _tmp_3 != 0;
        _item = new VideoModel(_tmpPath,_tmpIsVideo,_tmpCheck,_tmpCheckCut,_tmpCheckTick);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final int _tmpSize;
        _tmpSize = _cursor.getInt(_cursorIndexOfSize);
        _item.setSize(_tmpSize);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        _item.setDate(_tmpDate);
        final String _tmpDuration;
        if (_cursor.isNull(_cursorIndexOfDuration)) {
          _tmpDuration = null;
        } else {
          _tmpDuration = _cursor.getString(_cursorIndexOfDuration);
        }
        _item.setDuration(_tmpDuration);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
