class Bus(
    private val countWheels: Int = 4,
    private val countDoors: Int = 2,
    private val powerMotor: Int,
    private val model: String,
    private var countPassenger: Int
):Car(countWheels, countDoors, powerMotor, model) {
    override fun printBeep() {
        println("gudok")
    }

    override fun printInfo() {
        println("Car Info: model: $model power: $powerMotor," +
                " count doors: $countDoors, " +
                "count wheels: $countWheels" +
                "count passenger: $countPassenger")
    }

    private var timeTable = TimeTable.LunchEvening

    fun setTimeTable(timeTable:TimeTable){
        this.timeTable = timeTable
    }

    fun getTimeTable(): String{
        return when (this.timeTable) {
            TimeTable.LunchEvening -> "from 12 to 18"
            TimeTable.MorningLunch -> "from 8 to 12"
        }
    }
}

enum class TimeTable{
    MorningLunch,
    LunchEvening
}