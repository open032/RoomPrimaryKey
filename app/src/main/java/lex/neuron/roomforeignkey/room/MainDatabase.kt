package lex.neuron.roomforeignkey.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Dir::class, TitleList::class, Memo::class],
    version = 1, exportSchema = false
)
abstract class MainDatabase : RoomDatabase() {

    abstract fun titleListDao(): TitleListDao

    companion object {
        private var INSTANCE: MainDatabase? = null

        fun getInstance(context: Context): MainDatabase{
            return if (INSTANCE == null) {
                Room.databaseBuilder(context,MainDatabase::class.java, "user_database").build()
            } else {
                INSTANCE!!
            }
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}