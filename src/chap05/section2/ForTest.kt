package chap05.section2

fun main() {
    var total = 0

    for (num in 1..100 step 2){ //홀수 합 구하기
        total += num

    }
    println("total: $total")
}