package chap09.section1

class Box<T>(a: T) {
    var name = a
}

fun main() {
    val box1: Box<Int> = Box(1)
    val box2 = Box<String>("Kildong")

    println(box1.name)
    println(box2.name)
}