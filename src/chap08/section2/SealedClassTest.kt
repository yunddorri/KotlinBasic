package chap08.section2

sealed class Result{
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

fun main() {
    val result = Result.Success("Success")
    println(eval(result))
}

fun eval(result: Result): String = when(result){
    is Result.Success -> result.message
    is Result.Error -> result.message
}