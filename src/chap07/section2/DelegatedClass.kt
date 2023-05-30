package chap07.section2

interface Car{
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go() = "는 짐을 적재하며 $power 마력을 가집니다."
}

class SportImpl(val power: String): Car{
    override fun go() = "는 경주용에 사용되며 $power 마력을 가집니다."
}

class CarModel(val model: String, impl: Car): Car{
    fun carInfo(){
        println("$model ${go()}")
    }

    override fun go(): String {
        return "TEST"
    }
}

fun main() {
    val myDamas = CarModel("Damas 2020", VanImpl("100"))
    val my350z = CarModel("350Z 2008", SportImpl("350"))

    myDamas.carInfo()
    my350z.carInfo()
}