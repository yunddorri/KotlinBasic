package chap08.section2

interface Switcher{
    fun on() : String
}
class Smartphone(val model: String){
    val cpu = "Exynos"
    inner class ExternalStorage(val size: Int){
        fun getInfo() = println("$model : Installed on $cpu with $size Gb")
    }

    fun powerOn():String{
        class Led(val color: String){
            fun blink() = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher{
            override fun on(): String{
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(128)
    mySdcard.getInfo()
    println(Smartphone("S8").powerOn())
}