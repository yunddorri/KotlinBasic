package chap04.section4

var global = 10
fun main() {
    global = 15
    println("$global")
    userFunc()
    println("$global")
}

fun userFunc(){
    global = 20
}