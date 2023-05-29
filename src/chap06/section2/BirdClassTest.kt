package chap06.section2

class Bird constructor(name:String, wing:Int, beak: String){
    //프로퍼티 나열
    var name: String = name
    val wing: Int = wing
    var beak: String = beak

//    constructor(name: String, wing: Int, beak: String){//부생성자 사용한 방법
//        this.name = name
//        this.wing = wing
//        this.beak = beak
//    }
    // 메서드 나열
    fun fly(){
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")

    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}