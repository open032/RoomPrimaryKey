package lex.neuron.roomforeignkey.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dir (
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int
)