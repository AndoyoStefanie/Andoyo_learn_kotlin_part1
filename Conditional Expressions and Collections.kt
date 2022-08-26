//Conditional Expressions start
//1
fun main(){
    var isTuesday = true
    // Write your code below
    if (isTuesday) {
        println("Take out the trash.")
    }

}
//2
fun main() {
    var saleHappening = false
    var price: Int
    // Write your code below
    if (saleHappening) {
        price = 12
    } else {
        price = 15
    }

    println("The total is $price dollars.")
}
//3
fun main() {
    var d20 = 13
    // Write your code below
    if (d20 >= 17) {
        println("The incantation works and the dragon is defeated.")
    } else {
        println("The incantation fails and the dragon wins.")
    }
}
//4
fun main() {
    var num1 = 8
    var num2 = 9
    // Write your code below
    if (num1 % 2 == 0) {
        println("$num1 is even.")
    }

    if (num2 % 2 != 0) {
        println("$num2 is odd.")
    }
}
//5
fun main() {
    var rewardsPoints = 17
    var memberType: String
    // Write your code below
    if (rewardsPoints >= 50) {
        memberType = "Platinum"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }
    println("You are a $memberType type member.")
}
//6
fun main() {
    var a = true
    var b = false
    var c = true
    var d = false

    if (a || b) {
        println("Hoorah!")
    }

    if (!b && c) {
        println("Woohoo!")
    }

    if (a || d) {
        println("Yay!")
    }

    if (!(!d && b)) {
        println("Wow!")
    }


}
//7
fun main() {
    var expressionValue: Boolean

    if (!true && (false && true || !false)) {
        println("Hello")
    } else {
        println("Goodbye")
    }

    // Write your code below
    expressionValue = false
    println(expressionValue)
}
//8
fun main() {
    var orbitsStar = true // Rule 1
    var hydrostaticEquilibrium = true // Rule 2
    var clearedOrbit = false // Rule 3

    // Write your code below
    if (orbitsStar && hydrostaticEquilibrium) {
        if (clearedOrbit) {
            println("Celestial body is a planet.")
        } else {
            println("Celestial body is a dwarf planet.")
        }
    }
}
//9
fun main() {
    var season = "Fall"
    // Write your code below

    when (season) {
        "Winter" -> println("Grow kale.")
        "Spring" -> println("Grow lettuce.")
        "Summer" -> println("Grow corn.")
        "Fall" -> println("Grow pumpkins.")
        else -> println("Not a valid season.")
    }
}
//10
fun main() {
    var sHU = 17000
    var pungency: String

    // Write your code below
    if (sHU in 0..699) {
        pungency = "very mild"
    } else if (sHU in 700..2999) {
        pungency = "mild"
    } else if (sHU in 3000..24999) {
        pungency = "moderate"
    } else if (sHU in 25000..69999) {
        pungency = "high"
    } else {
        pungency = "very high"
    }

    println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")
}
//Collections start
//1
fun main() {
    // Write your code below 🏊‍♀️
    val waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing")
    println(waterSports)
}
//2
fun main() {
    // Write your code below 🏃‍♀️
    val unitedStatesMarathons = listOf("Boston Marathon", "Bank of America Chicago Marathon", "TCS NYC Marathon", "Marine Corps Marathon")

    println(unitedStatesMarathons[1])
}
//3
fun main() {
    // Write your code below 🎭
    var openBroadwayShows = mutableListOf("The Lion King", "Chicago", "The Cher Show", "Les Miserables")
    openBroadwayShows[2] = "Wicked"
    println(openBroadwayShows)
}
//4
fun main() {
    // Write your code below 🍎
    var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry")
    println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
}
//5
fun main() {
    val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    // Write your code below 🪐
    planets.remove("Pluto")
    planets.add("Earth")
    println(planets.random())
}
//6
fun main() {
    // Write your code below 💾
    var obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex")
    println(obsoleteTech)
}
//7
fun main() {
    // Write your code below
    val islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")
    println(islandsOfHawaii.elementAt(2))
    println(islandsOfHawaii.elementAtOrNull(6))
}
//8
fun main() {
    // Write your code below 👩‍🚀
    val apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")

    println(apolloLandingSites)

}
//9
fun main() {

    var uniqueParticipants = mutableSetOf<String>()
    var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

    // Write your code below 🎤
    uniqueParticipants.addAll(participants)
    println("The talent show has ${uniqueParticipants.size} unique participants.")
    uniqueParticipants.clear()
    println(uniqueParticipants)
}
//10
fun main() {
    // Write your code below 📝
    var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)
    val sum = testGrades.sum()
    val numStudents = testGrades.size
    val average = sum / numStudents
    if (average < 65) {
        println("Failed")
    } else {
        println("Passed")
    }
}
//11
fun main() {
    // Write your code below 🏞
    val codeysMap = mapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears")
    println(codeysMap)
}
//12
fun main() {
    var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")

    // Write your code below 🚜
    println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
    println(uniqueTransport.keys)
    println(uniqueTransport.values)
}
//13
fun main() {
    // Write your code below 📺
    var tvShows = mutableMapOf("The Big Bang Theory" to 278, "Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)
    tvShows["The Big Bang Theory"] = 279
    println(tvShows)
}
//14
fun main() {
    // Write your code below 🖼

    var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")

    if (!momaPaintings.containsValue("Claude Monet")) {
        // Write your code for Step 1 here
        momaPaintings.put("Water Lillies", "Claude Monet")
    }
    // Write your code for Step 2 here
    momaPaintings.remove("Mona Lisa")
    println(momaPaintings)
}
//End
