package lex.neuron.roomforeignkey.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface TitleListDao {
    @Insert
    suspend fun insertMemo(user: Memo)

    @Insert
    suspend fun insertTitleList(user: TitleList)

    @Insert
    suspend fun insertDir(user: Dir)

    @Query("SELECT * FROM titlelist")
    suspend fun queryTl(): List<TitleList>

    @Query("SELECT * FROM dir")
    suspend fun queryDir(): List<Dir>

    @Transaction
    @Query("SELECT * FROM dir")
    suspend fun queryAll(): List<DirAndTitleList>

/*
    @Transaction
    @Query("SELECT * FROM dir")
    suspend fun queryAllDir(): List<DirAndTitleList>
*/
/*

    @Query("DELETE FROM memo")
    suspend fun deleteAll();

    @Update
    suspend fun update(user: Memo)

    @Delete
    suspend fun delete(user: Memo)
*/
}