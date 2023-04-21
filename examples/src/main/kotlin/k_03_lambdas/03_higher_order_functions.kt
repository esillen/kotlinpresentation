package k_03_lambdas


// The type of the "stuffDoer" argument is a function type!
fun doStuffWithTwoInts(first : Int, second : Int, stuffDoer : (Int, Int) -> Int) : Int {
    println("Uh-oh $first and $second are gonna get it now!")
    return stuffDoer(first, second)
}


val resultFromEvilExperiment = doStuffWithTwoInts(8, 2) { x, y ->
    println("Evil addition and multiplication")
    (x + y) * 3 // Last line of code is return value in lambda
}


// You can also return functions - note the return type is a function type
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






