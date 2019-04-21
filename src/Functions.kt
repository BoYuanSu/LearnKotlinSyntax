fun main(args: Array<String>) {
    fun forceChoke() {
        println("You have failed me for the last time Admiral")
    }
    forceChoke()

    fun makAnEntrance(line: String) {
        println(line)
    }

    makAnEntrance("I find your lack of faith disturbing")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): String {
        val goodGuys = rebels + ewoks
        return goodGuys.toString()
    }

    val rebels = calculateNumberGoodGuys(5, 7)

    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5, 7)} rebel scum")

    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }
    vaderIsFeeling()
    vaderIsFeeling("meh")

    val lukeReturns = "fofof"

    fun lukeSay(msg: String){
        println(msg)
    }
    lukeSay(lukeReturns)

}