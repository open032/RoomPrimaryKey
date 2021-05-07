package lex.neuron.roomforeignkey.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = Dir::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("dir"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class TitleList(
    val name: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(index = true)
    val dir: Int
)