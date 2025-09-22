package vcmsa.projects.memestream


import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import vcmsa.projects.memestream.data.Meme

@Database(entities = [Meme::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun memeDao(): MemeDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "memestream-database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
