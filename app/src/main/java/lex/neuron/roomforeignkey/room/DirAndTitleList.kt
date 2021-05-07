package lex.neuron.roomforeignkey.room

import androidx.room.Embedded
import androidx.room.Relation

data class DirAndTitleList (
    @Embedded
    val dir: Dir,
    @Relation(
        parentColumn = "id",
        entityColumn = "dir"
    )
    var titleList: TitleList,
    @Relation(
        parentColumn = "id",
        entityColumn = "titleList"
    )
    val memo: List<Memo>
)