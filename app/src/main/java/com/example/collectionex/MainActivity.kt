package com.example.collectionex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		var list1 = mutableListOf("홍길동", "전우치"); // 값 변경이 가능한 리스트 생성
		 // list의 가장 끝에 "임꺽정" 추가 및 가장 앞에"둘리"추가후 list값들 출력
		list1.add("임꺽정")
		list1.add(0, "둘리")

		for(i in 0 until list1.size){
			Log.d("Collection1", "${list1.get(i)}")
		}
		// 둘리, 홍길동, 전우치, 임꺽정
		
		list1.removeAt(2) 	// list에서 2번 인덱스에 해당하는 값 삭제
		list1.remove("둘리")	// list에서 "둘리"라는 값 삭제

		for(i in 0 until list1.size){
			Log.d("Collection1", "${list1.get(i)}")
		}

		var list2 = mutableListOf<String>()
		// 제네릭으로 리스트에 저장될 값의 자료형을 지정한 빈 리스트 생성
		list1.add("test1")
		list1.add("test2")
		Log.d("listTest", "list2의 두번째값 : ${list1.get(1)}")

		var set = mutableSetOf("a", "b", "c", "c")
		Log.d("setTest", "set의 전체 값 : ${set}")

		var set2 = mutableListOf<String>()
		// 제네릭으로 셋에 들어갈 값의 자료형을 지정한 빈 셋 생성
		set2.add("abc")
		set2.add("def")
		set2.add("ghi")
		set2.remove("def")
		Log.d("setTest", "set의 전체 값 : ${set2}")

		// 맵 사용
		var map = mutableMapOf<String, String>()
		map.put("k1", "둘리")
		map.put("k2", "또치")
		map.put("k3", "홍길동")
		Log.d("setTest", "map의 k1 값 : ${map.get("k1")}")
		Log.d("setTest", "map의 전체 값 : ${map}")

		map.put("k2", "고길동")	// 동일한 키가 있을 경우 덮어씀
		Log.d("setTest", "map의 전체 값 : ${map}")

		map.remove("k3")	//
		Log.d("setTest", "map의 전체 값 : ${map}")


	}
}