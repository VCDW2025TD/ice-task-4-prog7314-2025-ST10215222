package vcmsa.projects.memestream.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MemeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(memes: List<Meme>)

    @Query("SELECT * FROM memes")
    fun getAllMemes(): LiveData<List<Meme>>
}
