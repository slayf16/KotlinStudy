class Truck : Car{

    private val countWheels: Int
    private val countDoors: Int
    private val powerMotor: Int
    private val model: String
    var countTrailer: Int
    private val volumeTrailer: Double
    constructor(
        countWheels: Int = 6,
        countDoors: Int = 2,
        powerMotor: Int,
        model: String,
        countTrailer:Int = 1,
        volumeTrailer:Double) :super(countWheels,countDoors,powerMotor,model){
            this.countWheels = countWheels
            this.countDoors = countDoors
            this.powerMotor = powerMotor
            this.model = model
            this.countTrailer = countTrailer
            this.volumeTrailer = volumeTrailer
        }

    override fun printBeep() {
        println("booooooooooooooo")
    }

    override fun printInfo() {
        println("Car Info: model: $model power: $powerMotor," +
                " count doors: $countDoors, " +
                "count wheels: $countWheels," +
                "count Trailer: $countTrailer," +
                "volume Trailer: $volumeTrailer")
    }
    private val fillingPercentageTrailer = mutableListOf<Int>(0)

    fun setPercentTrailer(percent: Int){
        fillingPercentageTrailer.clear()
        for(i in 0 .. countTrailer){
            fillingPercentageTrailer.add(percent)
        }
    }
    fun getPercentTrailer(){
        println("count trailer = $countTrailer")
        for (i in 0 until countTrailer)
            println("trailer $i = ${fillingPercentageTrailer[i]}")
    }
}
