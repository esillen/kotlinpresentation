package k_01_syntax


// Everything can be declared top-level!

val theTruth : String = "KOTLIN IS AWESOME" // Declaring an immutable String, setting its value
var counter : Int = 0 // Declaring a mutable Int, this can be altered


// Function declaration. Type (Boolean) comes last after colon.
fun functionThatDoesStuffAndReturnsTrue() : Boolean{
    // THE_TRUTH = "SOME NON-TRUTH" // Not allowed! val's cannot be re-assigned
    counter++  // This is fine because counter is a var.
    return true
}




