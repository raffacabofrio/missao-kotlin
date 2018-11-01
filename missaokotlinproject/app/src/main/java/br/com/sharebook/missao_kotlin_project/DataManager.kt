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
        var course = courses["android_intents"] as CourseInfo

        var note = NoteInfo( course, "note a1", "note a1 text")
        notes.add(note)

        note = NoteInfo(course, "note a2", "note a2 text")
        notes.add(note)

        note = NoteInfo(course, "note a3", "note a3 text")
        notes.add(note)


        course = courses["java_lang"] as CourseInfo

        note = NoteInfo(course, "java 1", "java 1 text")
        notes.add(note)

        note = NoteInfo(course, "java 2", "java 2 text")
        notes.add(note)
    }

}