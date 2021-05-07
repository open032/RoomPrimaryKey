package lex.neuron.roomforeignkey.room

import androidx.room.Embedded
import androidx.room.Relation

data class TitleListAndMemo(
    @Embedded
    val title: TitleList,
    @Relation(
        parentColumn = "id",
        entityColumn = "titleList"
    )
    val memo: List<Memo>

)
