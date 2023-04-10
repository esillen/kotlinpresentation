package k_03_lambdas

import java.util.*

// Notice the type of the "stuffDoer" argument
fun doStuffWithTwoInts(first : Int, second : Int, stuffDoer : (Int, Int) -> Int) : Int {
    println("Uh-oh $first and $second are gonna get it now!")
    return stuffDoer(first, second)
}

val resultFromEvilExperiment = doStuffWithTwoInts(5, 17, { x, y ->
    println("Evil addition and multiplication")
    (x + y) * 3 // Last line of code is return value in lambda
})

// If the lambda method is last, you don't pass it in as parameter. This is allowed and endorsed basically because it feels better.
val resultFromSecondEvilExperiment = doStuffWithTwoInts(3, 5) { x, y ->
    println("Evil multiplication")
    x*y
}






// A more advanced example.
// Join a list of strings with an arbitrary function that returns the next string in the sequence.
fun joinStringsButPowerful(strings: List<String>, nextString : (String, String) -> (String)) : String {
    if (strings.isEmpty()) {
        return ""
    } else if (strings.size == 1) {
        return strings[0]
    }

    var result = strings.first()
    var lastString = strings.first()

    for (string in strings.drop(1)) {
        val joined = nextString(lastString, string)
        result += joined
        lastString = string
    }

    return result
}

val resultFromJoinStrings = joinStringsButPowerful(listOf("A", "Simple", "Example")) {first, second ->
    " $second" // This simply joins together with a blank space
}


// Again, extending stdlib because we're radical
fun String.capitalize() : String {
    return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

fun String.decapitalize() : String{
    return replaceFirstChar { it.lowercase(Locale.getDefault()) }
}


val resultFromJoinStrings2 = joinStringsButPowerful(listOf("A", "More", "Cool", "Example.", "We're", "Starting", "To", "Love", "Kotlin!")){first, second ->
    // This capitalizes or decapitalize depending on the last character
    if (first.endsWith(".")) {
         " ${second.capitalize()}"
    } else {
        " ${second.decapitalize()}"
    }
}



// You can also return funtions - note the return type is a function type
fun addAndMultiplyNumberByFunctionGenerator(toAdd : Int, multiplier : Int) : (Int) -> Int {
    return fun (number : Int) : Int{
        return (number + toAdd) * multiplier
    }
}



fun main() {
    val generatedFunction = addAndMultiplyNumberByFunctionGenerator(5, 3)

    val result = generatedFunction(7)

    println(result)
}






