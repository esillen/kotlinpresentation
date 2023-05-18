package k_01_syntax






// Everything can be declared top-level!

val theTruth : String = "KOTLIN IS AWESOME" // immutable String
var counter : Int = 0 // mutable Int

// theTruth = "KOTLIN IS A COOL LANGUAGE" // Would not be allowed! val's cannot be re-assigned
// counter++  // This would be fine






// Function declaration
fun login(input : String) : String {

    val secretPassword = "kotlinkotlinkotlin"

    // If-statements have return values and can be part of an expression
    val result = if (input === secretPassword) { // === for reference equality
        "user access!"
    } else if (input == "superOverridePassword") { // == for equality
        "admin access!"
    } else {
        "denied!"
    }

    return result
}





// main() is the entry point function for a kotlin file
fun main() {
    println("Hello there!")
}

