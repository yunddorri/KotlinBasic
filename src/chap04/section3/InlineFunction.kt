package chap04.section3

inline fun shortFunc(a:Int, noinline out:(Int)-> Unit){
    println("Hello")
    out(a)
    println("Goodbye")
}

fun main() {
    shortFunc(3){
        println("a: $it")

    }
}