package com.yourstar.jsondemo

import com.google.gson.annotations.SerializedName

data class Student(@SerializedName("name") val name: String, @SerializedName("age") var age: Int, var score: Score)

data class Score(var math: Int, var english: Int, var chinese: Int, val grade: String) {

    //json好像不知道怎么搞
    //lazy 只在第一将你访问属性时计算，以后直接读取计算出来的值，下面的有可能不太好，如果成绩改变，会导致grade错误
//    val grade: String by lazy {
//        if (math >= 90 && english >= 90 && chinese >= 90) {
//            "A"
//        } else if (math >= 80 && english >= 80 && chinese >= 80) {
//            "B"
//        } else {
//            "C"
//        }
//    }
}