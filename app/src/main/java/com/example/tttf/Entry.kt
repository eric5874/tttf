package com.example.tttf

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "entries")
data class Entry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val date: String,
    val item: String,
    val price: Double
)
