package chap03.section1

fun sum(a: Int, b:Int):Int{
    return a + b
}

fun max(a: Int, b:Int):Int{
    return if(a > b) a else b
}

fun outfunc(name: String): Unit{
    println("Name: $name")
}

fun main() {// 최상위 함수
    val result1 = sum(2,3)
    val a = 3
    val b = 5
    val result2 = max(a,b)
    outfunc("Kildong")
    //println(result2)
    //println(result1)
}