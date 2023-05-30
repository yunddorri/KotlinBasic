package chap06.section3

open class Bird(var name: String, var wing: Int, var beak: String) {//주생성자, 프로퍼티 선언

    open fun fly(){
        println("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak){
    override fun fly(){
        println("QuickFly")
    }
    fun singHigh(){
        println("sing High")
    }
}

class Parrot : Bird {
    //부생성자
    var language: String
    constructor(name: String, wing: Int, beak: String, language: String) : super (name, wing, beak){
        this.language = language
    }

    override fun fly(){
        println("slow Fly")
        super.fly()
    }

    fun speak(){
        println("Speak: $language")
    }
}

fun main() {
    val lark = Lark("mylark", 2, "short")
    val parrot = Parrot("myparrot", 2, "long", "English")

    println("lark - name: ${lark.name}")
    println("parrot - name: ${parrot.name}, lang: ${parrot.language}")
}