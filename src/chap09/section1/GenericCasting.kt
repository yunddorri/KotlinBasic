package chap09.section1

open class Parent

class Child : Parent()

fun main() {
    val obj1:Parent = Parent()
    val obj2:Child = Child()
    val obj3:Parent = Child()

}