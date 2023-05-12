package k_03_lambdas


// Remember kotlin function type syntax.
// (...ArgumentTypes) -> ResultType



// Let's get into high as balls functions!
// This beautiful mess is fine!
// (A function taking a boolean that returns a function that takes an int and a string that returns a set of functions that take int as argument and returns a string.)
val myCrazyFunction : (Boolean) -> (Int, String) -> List<(Int) -> String> = fun (aBool : Boolean) : (Int, String) -> List<(Int) -> String> {

    if (aBool) {
        // returns a function "as promised"
        return fun (anotherInt : Int, aString : String) : List<(Int) -> String> {

            var listOfFunctions : MutableList <(Int) -> String> = mutableListOf()

            // Generate a list of functions
            for(i in 1..anotherInt) {
                listOfFunctions.add(
                    fun (yetAnotherInt:  Int) : String {
                        return ("$aString ").repeat(yetAnotherInt)
                    }
                )
            }


            return listOfFunctions.toList() // simply freezes the set
        }




    } else {
        // does the same as aBool == true except...
        return fun (anotherInt : Int, aString : String) : List<(Int) -> String> {
            var listOfFunctions : MutableList <(Int) -> String> = mutableListOf()
            for(i in 1..anotherInt) {
                listOfFunctions.add(
                    fun (yetAnotherInt:  Int) : String {
                        return ("${aString.reversed()} ").repeat(yetAnotherInt) // ...this is different (reversed)
                    }
                )
            }
            return listOfFunctions.toList()
        }
    }


}


fun main() {
    val setOfFunctions = myCrazyFunction(true)(10, "Kotlin!")
    for ((index, function) in setOfFunctions.withIndex()) {
        println(function(index))
    }

    val setOfFunctionsBackwards = myCrazyFunction(false)(5, "!tsäb rÄ")
    for ((index, function) in setOfFunctionsBackwards.withIndex()) {
        println(function(index))
    }
}


// Now do this in java. I dare you all!