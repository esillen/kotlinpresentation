package k_01_syntax

import java.lang.IllegalStateException


// Everything can be declared top-level!

val theTruth : String = "KOTLIN IS AWESOME" // Declaring an immutable String, setting its value
var counter : Int = 0 // Declaring a mutable Int, this can be altered

val myName = "Erik Sillén" // If type can be inferred, type is not required to be written out.



// Function declaration. Type (Boolean) comes last after colon.
fun functionThatDoesStuffAndReturnsABoolean() : Boolean {
    counter -= 1

    // THE_TRUTH = "KOTLIN IS A COOL LANGUAGE" // Not allowed! val's cannot be re-assigned
    counter++  // This is fine because counter is a var.


    // If-statements have return values and can be part of an expression
    val result = if (counter == 0) {
        "still zero"
    } else {
        "no longer zero!"
    }

    // == comparison is like .equal in java (equality).
    // === is like java's == (same reference)
    return if (result == "still zero") {
        false
    } else if (result == "no longer zero!"){
        true
    } else {
        throw IllegalStateException("you messed up!")
    }


}

// main is the point function for a kotlin file
fun main() {
    val returnValue = functionThatDoesStuffAndReturnsABoolean()
    print(returnValue)
}



