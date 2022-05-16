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

        btnCondition.setOnClickListener {

//            1. if 문 테스트

            val userAge = 18

            if (userAge >= 20) {
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (userAge >= 17) {
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "중학생 이하 입니다.", Toast.LENGTH_SHORT).show()
            }

//            2. when 테스트

            val num = 30

            when (num) {

                10 -> {
                    Log.d("when테스트", "10인경우")
                }
                15 -> Log.d("when", "15인 경우 - 코드 한줄")
                20, 30, 40 -> Log.d("when", "20,30,40 중 하나")
                in 41..100 -> Log.d("when", "41~100 사이의 값")
                else -> Log.d("when", "그 외의 모든 경우")

            }

        }

        btnRepeat.setOnClickListener {

//            1. 정석 - ArrayList 연계

            val studentList = ArrayList<String>()
            studentList.add("홍길동")
            studentList.add("임꺽정")
            studentList.add("장길산")


            for ( name  in  studentList ) {
                Log.d("정석for문", name)
            }

//            2. 0~4 , 0~5 직전 (자바식 for)

            for (i in  0..4) {

                Log.d("0~4", i.toString())
            }

            for (i  in   0 until 5) {
                Log.d("0~5직전", i.toString())
            }


        }


        btnCopy.setOnClickListener {

//            edtMessage에 입력된 내용 (text 속성 값) 을 변수에 담자.

//            cf) EditText의 text속성을 가져올떄는 toString()을 거쳐서 가져오는게 편하다.

            val inputMessage = edtMessage.text.toString()

//            txtMessage의 text 속성에 값을 담아주자.

            txtMessage.text = inputMessage

        }


    }
}