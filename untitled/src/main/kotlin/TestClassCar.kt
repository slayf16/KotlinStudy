fun main(){
    val bus = Bus(powerMotor = 100, model = "Pazik", countPassenger = 40)
    bus.printBeep()

    val truck = Truck(powerMotor = 1000, model= "scania", volumeTrailer = 100.0, countTrailer = 2)
    truck.setPercentTrailer(30)
    truck.getPercentTrailer()
    truck.countTrailer = 4
    truck.setPercentTrailer(50)
    truck.getPercentTrailer()
}