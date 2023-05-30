package chap07.section2

class Person1{
    var id: Int = 0
    var name: String = "Horang"
    companion object{
        var language: String = "Korean"
        fun work(){
            println("working...")
        }
    }
}

fun main() {
    println(Person1.language)
    Person1.language = "English"
    println(Person1.language)
    Person1.work()
}