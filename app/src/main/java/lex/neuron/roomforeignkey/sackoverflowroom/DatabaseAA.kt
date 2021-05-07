package lex.neuron.roomforeignkey.sackoverflowroom

/*
@Database(entities = [Artist::class, Album::class],
    version = 1, exportSchema = false)
abstract class DatabaseAA: RoomDatabase() {
    abstract fun library(): Library

    companion object {
        private var INSTANCE: DatabaseAA? = null

        fun getInstance(context: Context): DatabaseAA {
            return if (INSTANCE == null) {
                Room.databaseBuilder(context, DatabaseAA::class.java, "user_database").build()
            } else {
                INSTANCE!!
            }
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}*/
