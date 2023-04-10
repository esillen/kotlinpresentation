package k_01_syntax


// Everything can be declared top-level!

val theTruth : String = "KOTLIN IS AWESOME" // Declaring an immutable String, setting its value
var counter : Int = 0 // Declaring a mutable Int, this can be altered

fun main() {
    // THE_TRUTH = "SOME NON-TRUTH" // Not allowed! val's cannot be re-assigned
    counter++  // This is fine because counter is a var.
}


val is_equal : Boolean = theTruth == "KOTLIN IS AWESOME"        // <-- same as java's .equals(), is actually syntactic sugar.
val points_to_same : Boolean = theTruth === "KOTLIN IS AWESOME" // <-- same as java's ==  (probably true here due to JVM's string pool)


// Function declaration. Like var/val assignment, type (Boolean) comes last after colon.
// Functions declared here (outside classes) are called "top level functions"
fun checkIfLargerThanPi(number : Double) : Boolean {
    return number > 3.1415
}
// class functions (methods) are closed by default (no overload possible)
// fields and functions are public by default






