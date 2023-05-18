package k_01_basics_and_syntax



// BASIC SYNTAX AND FEATURES


// Function declaration.
// Typing syntax backwards compared to Java
fun login(password : String) : String {


    // Immutability
    val secretPassword : String = "KOTLIN IS AWESOME" // immutable String
    var counter : Int = 0                       // mutable Int

    // secretPassword = "KOTLIN IS A COOL LANGUAGE" // Not allowed! (at compile time)
    // counter++                                    // This is fine



    // If-statements have return values and can be part of an expression
    val result = if (password == secretPassword) { // == for equality
        "user access!"
    } else if (password === "superOverridePassword") { // === for reference equality
        "admin access!"
    } else {
        "denied!"
    }

    return result
}





// Everything can be declared top-level!
// Compare to Java's requirement of class {}

val hello = "Hello Kotlin!"



// main() is the entry point function for a kotlin file
fun main() {
    println(hello)
}

