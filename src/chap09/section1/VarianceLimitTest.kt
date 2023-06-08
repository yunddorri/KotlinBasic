package chap09.section1

open class Animal(val size: Int)
class Cat(val jump: Int) : Animal(50)

class Spider(val poison: Boolean) : Animal(1)

class Box2<out T>

fun main() {
    val c1: Animal = Cat(20)
    val s1: Animal = Spider(true)

    var a1: Animal = c1
    a1 = s1

    println("s1 ${a1.size}")

    val b1:  Box2<Animal> = Box2<Animal>()
    val b2: Box2<Animal> = Box2<Cat>()
    val b3 = Box2<Spider>()
    val b4 = Box2<Int>()
}