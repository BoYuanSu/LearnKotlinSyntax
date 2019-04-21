fun main() {

    val printMessage = { message: String -> println(message) }

//    fun printMessage(message: String) {
//        println(message)
//    }

    printMessage("Hello World!")


    val sumA = { x: Int, y: Int -> x + y }

    println(sumA(5, 3))

    val sumB: (Int, Int) -> Int = { x, y -> x + y }

    println(sumB(1, 1))

    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request

        // we got back data

        // there were no network data

        completion()
    }

    downloadData("fakeURL.com", {
        println("The code in this block, will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // send a download request
        // we got back car data

        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }
    downloadCarData("fakeUrl.com") { car ->
        println(car.color)
        println(car.make)
    }
    downloadCarData("fakeUrl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruck(url: String, completion: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we get the request back
        val webRequesSuccess = false
        if (webRequesSuccess) {
            // recieved truck data
            val truck = Truck("Ford", "F-150", 10000)

            completion(truck, true)
        } else {
            completion(null, false)
        }
    }
    downloadTruck("fakeUrl.com") { truck, success ->
        if (success) {
            // do something with our truck
            truck?.towing()
        } else {
            // handle the web request fail
            println("Something went wrong!")
        }
    }


}

