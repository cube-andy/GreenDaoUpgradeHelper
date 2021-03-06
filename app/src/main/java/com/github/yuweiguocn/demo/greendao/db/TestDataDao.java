package com.github.yuweiguocn.demo.greendao.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TEST_DATA".
*/
public class TestDataDao extends AbstractDao<TestData, Long> {

    public static final String TABLENAME = "TEST_DATA";

    /**
     * Properties of entity TestData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TestString = new Property(1, String.class, "testString", false, "TEST_STRING");
        public final static Property TestLong = new Property(2, Long.class, "testLong", false, "TEST_LONG");
        public final static Property TestDate = new Property(3, java.util.Date.class, "testDate", false, "TEST_DATE");
        public final static Property TestInt = new Property(4, Integer.class, "testInt", false, "TEST_INT");
        public final static Property TestBoolean = new Property(5, Boolean.class, "testBoolean", false, "TEST_BOOLEAN");
    }


    public TestDataDao(DaoConfig config) {
        super(config);
    }
    
    public TestDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TEST_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TEST_STRING\" TEXT," + // 1: testString
                "\"TEST_LONG\" INTEGER," + // 2: testLong
                "\"TEST_DATE\" INTEGER," + // 3: testDate
                "\"TEST_INT\" INTEGER," + // 4: testInt
                "\"TEST_BOOLEAN\" INTEGER);"); // 5: testBoolean
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TEST_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TestData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String testString = entity.getTestString();
        if (testString != null) {
            stmt.bindString(2, testString);
        }
 
        Long testLong = entity.getTestLong();
        if (testLong != null) {
            stmt.bindLong(3, testLong);
        }
 
        java.util.Date testDate = entity.getTestDate();
        if (testDate != null) {
            stmt.bindLong(4, testDate.getTime());
        }
 
        Integer testInt = entity.getTestInt();
        if (testInt != null) {
            stmt.bindLong(5, testInt);
        }
 
        Boolean testBoolean = entity.getTestBoolean();
        if (testBoolean != null) {
            stmt.bindLong(6, testBoolean ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TestData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String testString = entity.getTestString();
        if (testString != null) {
            stmt.bindString(2, testString);
        }
 
        Long testLong = entity.getTestLong();
        if (testLong != null) {
            stmt.bindLong(3, testLong);
        }
 
        java.util.Date testDate = entity.getTestDate();
        if (testDate != null) {
            stmt.bindLong(4, testDate.getTime());
        }
 
        Integer testInt = entity.getTestInt();
        if (testInt != null) {
            stmt.bindLong(5, testInt);
        }
 
        Boolean testBoolean = entity.getTestBoolean();
        if (testBoolean != null) {
            stmt.bindLong(6, testBoolean ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TestData readEntity(Cursor cursor, int offset) {
        TestData entity = new TestData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // testString
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // testLong
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // testDate
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // testInt
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0 // testBoolean
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TestData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTestString(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTestLong(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setTestDate(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setTestInt(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setTestBoolean(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TestData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TestData entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TestData entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
