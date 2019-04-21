fun main(args: Array<String>) {


    var name: String = "JohnyB"
//    name = null
    var nullableName: String? = "Do I really exist?"

    nullableName = null

    // null Check
    var length = 0

    if (nullableName != null) {
        length = nullableName.length
    } else {
//        println()
        length = -1
    }
//    println(nullableName.length)
    println(length)

    val l = if (nullableName != null) nullableName.length else -1

    // secound method Safe Call Operator?
    println(nullableName?.length)

    // Third method is Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // !!
    println(nullableName!!.length)
}
