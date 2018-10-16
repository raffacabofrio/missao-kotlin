package br.com.sharebook.missao_kotlin_project

class CourseInfo (val courseId:String, val title: String)

class NoteInfo(var course: CourseInfo, var title:String, var text:String)