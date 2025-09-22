package vcmsa.projects.memestream.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memes")
data class Meme(
    @PrimaryKey val id: String,
    val title: String,
    val imageUrl: String
)
