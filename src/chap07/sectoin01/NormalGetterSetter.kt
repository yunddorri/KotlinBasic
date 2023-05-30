package chap07.sectoin01

// 직접 구성한 기본 게터와 세터
class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) { //커스터머 세터 구성
            field = value + 10
        }
}

fun main() {
    val user1 = User(1, "Kildong", 30)
    user1.name = ""
    user1.age = 35 // 세터
    println("user1.age = ${user1.age}") // 게터
}