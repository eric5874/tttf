import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.tttf.Entry

@Dao
interface EntryDao {
    @Insert
    suspend fun addEntry(entry: Entry)

    @Query("SELECT * FROM entries")
    suspend fun getAllEntries(): List<Entry>
}
