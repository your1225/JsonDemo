package com.yourstar.jsondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val student1: Student = Student("Jack", 20, Score(80, 90,90))
//        val gson:Gson = Gson()
//        val jsonStudent1: String = gson.toJson(student1)

//        val gson:Gson = Gson()
//        val jsonStudent1: String = "{\"age\":20,\"name\":\"Jack\",\"score\":{\"chinese\":90,\"english\":90,\"grade\":\"A\",\"math\":80}}"
//        val student: Student = gson.fromJson(jsonStudent1, Student::class.java)

//        val student1: Student = Student("Jack", 20, Score(91, 90, 90, "A"))
//        val student2: Student = Student("Lisa", 20, Score(80, 80, 80, "B"))
//        val students = listOf<Student>(student1,student2)
//
//        val gson: Gson = Gson()
//        val jsonStudents = gson.toJson(students)


        val jsonStudents = "[{\"age\": 20,\"name\": \"Jack\",\"score\": {\"chinese\": 90,\"english\": 90,\"grade\": \"A\",\"math\": 91}},{\"age\": 20,\"name\": \"Lisa\",\"score\": {\"chinese\": 80,\"english\": 80,\"grade\": \"B\",\"math\": 80}}]"

        val gson: Gson = Gson()
        val listType = object : TypeToken<List<Student>>() { }.type
        val students = gson.fromJson<List<Student>>(jsonStudents, listType)
    }
}
