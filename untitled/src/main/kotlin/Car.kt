open class Car (
    _countWheels: Int = 4,
    _countDoors: Int = 4,
    _powerMotor: Int,
    _model: String){

    private val countWheels: Int
    private val countDoors: Int
    private val powerMotor: Int
    private val model: String

    init {
        countWheels = _countWheels
        countDoors = _countDoors
        powerMotor = _powerMotor
        model = _model
    }

    var beep: String = "bip-bip"

   open fun printInfo(){
        println("Car Info: model: $model power: $powerMotor," +
                " count doors: $countDoors, " +
                "count wheels: $countWheels")
    }

    open fun printBeep(){
        for(i in 0..3) println(beep)
    }
}