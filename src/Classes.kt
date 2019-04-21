//class Car constructor(val make: String, val model: String, var color: String) {
//
//    fun accelerate() {
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck constructor(val make: String, val model: String, val towingCapacity: Int) {
//    fun two() {
//        println("taking the horses to the rodeo")
//    }
//
//    fun details() {
////        println("This is a $towingCapacity $make $model")
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make: String, val model: String) {

    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }

}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {

    override fun accelerate(){
        println("We are going ludicrous model!")
        super.accelerate()
        this.brake()
    }
}

class Truck(make: String, model: String, towingCapacity: Int) : Vehicle(make, model) {

    fun towing(){
        println("Truck towing~")
    }

}

fun main(args: Array<String>) {


    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()
    tesla.park()
    tesla.brake()

    val truck = Truck("Ford", "F-150", 10000)

    truck.accelerate()
    truck.park()
    truck.brake()

//    val car = CarDemo("", "")
//
//    val car_ = Car("ToYoTa", "Avalon", "Red")
//    println(car_.make)
//    println(car_.model)
//    car_.accelerate()
//    car_.details()
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.two()
//    truck.details()
}