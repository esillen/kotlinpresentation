package k_03_lambdas


fun main() {

    // Kotlin has a function type.
    // Syntax: (...ArgumentTypes) -> ResultType


    fun doStuffWithTwoInts(first: Int, second: Int, doStuff: (Int, Int) -> Int): Int {
        println("Uh-oh $first and $second are gonna get it now!")
        return doStuff(first, second)
    }


    val resultFromEvilExperimentWithInts = doStuffWithTwoInts(8, 2) { x, y ->
        println("Evil addition and multiplication")
        (x + y) * 3 // Last line of code is return value in lambda
    }

    println(resultFromEvilExperimentWithInts)

    // You can also return functions - note the return type is a function type
    fun addAndMultiplyNumberFunctionGenerator(toAdd: Int, multiplier: Int): (Int) -> Int {
        return fun(number: Int): Int {
            return (number + toAdd) * multiplier
        }
    }

    val generatedFunction = addAndMultiplyNumberFunctionGenerator(5, 3)

    val resultFromGeneratedFunction = generatedFunction(7)

    println(resultFromGeneratedFunction)
}

