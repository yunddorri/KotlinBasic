package chap06.section5

class PrivateTest{
    private var i = 1
    private fun privateFunc(){
        i += 1
        println(i)
    }
    fun access(){ //Public
        privateFunc()
    }
}

class OtherClass{
    //공개 생성 불가
    fun test(){
        val pc = PrivateTest()
        pc.access()
    }
}
fun main() {
    val pc = PrivateTest()
    // pc.i = 3 불가능 private이라
    pc.access() //public이라!
}

fun topFunction(){
    val pc = PrivateTest()
}