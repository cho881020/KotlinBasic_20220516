package kr.nepp.kotlinbasic_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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

        btnToast.setOnClickListener {

//            토스트 띄우기

            Toast.makeText(this, "테스트용 토스트", Toast.LENGTH_SHORT).show()


        }

        btnVariable.setOnClickListener {

//            변수 문법 테스트

            var name1 : String // 변수
            val name2 : String // 상수

//            최초 대입은 val / var 둘다 가능
            name1 = "김철수"
            name2 = "안영희"

            name1 = "이철수"  // var : 다시 대입 가능
//            name2 = "정영희"  // val : 상수이므로 변경 불가


//            변수 초기화 테스트 (정석 방법)

            val year1 = 1998 // year1은 Int로 자동 설정.
//            year1 = "천구백구십팔"  // 설정된 자료형은 계속 유지. (자료형 안맞아서 대입 불가)


        }

    }
}