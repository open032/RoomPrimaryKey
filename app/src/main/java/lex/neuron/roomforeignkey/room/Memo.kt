package lex.neuron.roomforeignkey.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = TitleList::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("titleList"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Memo(
    @PrimaryKey
    val id: Int,
    val name: String,
    @ColumnInfo(index = true)
    val titleList: Int
)

