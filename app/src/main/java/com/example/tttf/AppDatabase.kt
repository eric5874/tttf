import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tttf.Entry

@Database(entities = [Entry::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun entryDao(): EntryDao
}
