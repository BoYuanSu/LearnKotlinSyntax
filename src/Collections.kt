fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Luke"))
    println(imperials)

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falconn", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))
    println(rebelVehiclesMap.keys)
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falconn", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")

    println(rebelVehicles)
    rebelVehicles.remove("Bobaaa")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles.isEmpty())
}