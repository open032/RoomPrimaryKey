package lex.neuron.roomforeignkey

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import lex.neuron.roomforeignkey.room.Dir
import lex.neuron.roomforeignkey.room.MainDatabase
import lex.neuron.roomforeignkey.room.Memo
import lex.neuron.roomforeignkey.room.TitleList

class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et: EditText = findViewById(R.id.et)
        val tv: TextView = findViewById(R.id.tv)
        val btnAdd: Button = findViewById(R.id.btn_add)
        val btnAddTl: Button = findViewById(R.id.btn_add_tl)
        val btnShow: Button = findViewById(R.id.btn_show)
        val btnShowTl: Button = findViewById(R.id.btn_show_tl)
        val btnDel = findViewById<Button>(R.id.btn_delete)


        val db = MainDatabase.getInstance(this).titleListDao()

        var str = "str"

        val memo1: Memo

        btnAdd.setOnClickListener {
            GlobalScope.launch {
                db.insertDir(Dir("Two", 2))
            }
        }
        btnAddTl.setOnClickListener {
            GlobalScope.launch {
                db.insertTitleList(TitleList("Botanic", 3, 2))
            }
        }

        btnShow.setOnClickListener {
            GlobalScope.launch {
//                str = db.queryAllDir().toString()
            }
            Log.e(TAG, "queryTl $str")
        }

        btnShowTl.setOnClickListener {
            GlobalScope.launch {
                str = db.queryAll().toString()
            }
            Log.e(TAG, "queryAll $str")
        }



    }
}
