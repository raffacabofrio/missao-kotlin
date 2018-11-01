package br.com.sharebook.missao_kotlin_project

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init{
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "android Programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "android async Programming and services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_lang", title = "Java Fundamentals")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals: THE CORE")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes(){
        var course = CourseInfo("android_intents", "android Programming with intents")
        var note = NoteInfo(course, "note 1", "note 1")
        notes.add(note)

        note = NoteInfo(course, "note 2", "note 2")
        notes.add(note)

        note = NoteInfo(course, "note 3", "note 3")
        notes.add(note)
    }

}