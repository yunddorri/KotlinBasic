package chap06.section5

import javax.print.attribute.standard.MediaSize.Other

open class Base{
    protected var i = 1 //상속 계열에서만 접근 가능
    protected fun protectedFunc(){
        i += 1
    }
    fun access(){
        protectedFunc()
    }
}

class Derived : Base(){
    var j = 1 + i
    fun derivedFunc(): Int{
        protectedFunc()
        return i
    }
}

class Other{
    fun other(){
        val base = Base()
    }
}

fun main() {
    val base = Base()
    base.access()

    val derived = Derived()
    derived.j = 3
    derived.derivedFunc()
}