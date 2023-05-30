package chap07.sectoin01

class Person(var id: Int, val name: String, val age: Int)

fun main() {
    val person = Person(1, "Kildong", 30)
    person.id = 2 //setter 작동
    println(person.id) //getter 작동
}