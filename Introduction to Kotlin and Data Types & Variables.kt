// Add your code below
//Introduction start
// 1
fun main() {
    println("Coding is fun!")
}
//2
fun main() {
    // Write your code below!
    println("Just keep swimming!")
    print(15 * 4)
}
//3
fun main() {
    // Add your code below
    println("11/2 - AU military goes to war against local emus.")
    println("11/4 - Ambush planned by military fails.")
    println("11/8 - AU military withdraws.")
}
//4
fun main() {
    println("Howdy, partner!")
//Code prints "Howdy, partner!" to the terminal.
/* java like language but simpler
*/
}
//5
fun main() {
    println("An error a day keeps the programmer away.")
}
//6
// Add your code below
fun main(){
    println(2022 - 2001)
    println("Dreams are like trees, they're more fun to climb than just gaze at.")
}

//Data Types and Variables start
//1
fun main() {
    // Write your code below ☀️
    val todaysDate = "08/25/2022"
    println(todaysDate)
    val currentWeather: String = "rainy"
    println(currentWeather)
}
//2
fun main() {
    // Write your code below

    val pi: Double = 3.14
    pi = 2.3
}
//3
fun main() {
    var typeTest = "6"
    // Declare your variable above ⬆️
    print("${typeTest::class.simpleName}")
}
//4
fun main() {
    // Write your code below
    var favoriteSong = "Die for you - VALORANT"
    var songDuration = 339
    var currentlyListening = false
    println(favoriteSong)
    println(songDuration)
    println(currentlyListening)
}
//Part 3 start
//1
fun main() {
    val dog = "Toto"
    val state = "Kansas"
    val movie = "The Wizard of Oz"
    // Write your code below 🧙
    println(dog + ",I've a feeling we're not in " + state + " anymore. - "+ movie +", 1939")
}
//2
fun main() {
    val plant = "orchid"
    val potSize = 6 // in inches
    val dayNum = 7

    // Write your code below 🌱
    println("An $plant in a $potSize inch pot must be watered every $dayNum days.")
}
//3
fun main() {
    println("Please type your name and hit Enter.")
    // Write your code below
    var myName = readLine()

    println("Your name is $myName!")

}
//4
fun main() {
    var word = "supercalifragilisticexpialidocious"
    // Write your code below ☂️
    word = word.capitalize()
    var wordSize = word.length
    println("$word has $wordSize letters.")
}
//5
fun main() {

    // Add the correct escape sequences to the text below to achieve the output shown in the instructions

    print("\"Dear Learner 👋, I hope you're enjoying the Learn Kotlin course. You've made tremendous progress. Keep going! And remember, Knowledge is power. (Frances Beacon).\" With love, Codey")
}
//6
fun main() {

    // Appetizer
    val caesarSalad = 8.50

    //  Entree
    val beefStroganoff = 18

    // Dessert
    val cheesecake = 6

    // Add your code below ⬇️
    var total = caesarSalad + beefStroganoff + cheesecake
    var tip = 0.15
    var finalAmount = total * tip + total
    print(finalAmount)
}
//7
fun main() {
    var answer1 = 7 - 5 + 4 * 3
    var answer2 = (9 - 3) / 2
    var answer3 = (6 + 8) + (4 - 7)

    println(answer1)
    println(answer2)
    println(answer3)
}
//8
fun main() {
    var speedOfLight = 186_000
    // Write your code here
    speedOfLight += 282

    var perfectSquare = 32
    // Write your code here
    perfectSquare *= 2

    var sheldonsFavoriteNum = 219
    // Write your code here
    sheldonsFavoriteNum /= 3

    var emergency = 920
    // Write your code here
    emergency -= 9

    var firstCountingNum = 10
    // Write your code here
    firstCountingNum %= 5

    println("The speed of light is ${speedOfLight}.")
    println("A perfect square is ${perfectSquare}.")
    println("Sheldon's favorite number is ${sheldonsFavoriteNum}.")
    println("The emergency number in the United States is ${emergency}.")
    println("The first counting number in programming is ${firstCountingNum}.")

}
//9
fun main() {

    var a = 5
    a += 6

    var b = a * 9
    var c = b / 3
    c++

    var d = c + 8
    d %= 4
    d--
}
//10
fun main() {

    var ceil = Math.ceil(3.5)
    println(ceil)
    // Add your notes below

    var sqrt = Math.sqrt(25.0)
    println(sqrt)
    // Add your notes below

    var abs = Math.abs(-20)
    println(abs)
    // Add your notes below

    var floor = Math.floor(6.9)
    println(floor)
    // Add your notes below
}
//End

