package kr.nepp.kotlinbasic_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

//            btnLog가 클릭되면 할일

            Log.d("메인화면", "로그 찍기 버튼 눌림")

        }

        btnLog.setOnLongClickListener {

            Log.d("메인화면", "로그 버튼 길게 눌림")

            return@setOnLongClickListener true
        }

    }
}