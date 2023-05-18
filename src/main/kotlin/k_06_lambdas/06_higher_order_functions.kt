package k_06_lambdas

import java.util.*

fun main() {

    // Function type syntax: (...ArgumentTypes) -> ResultType


    fun mapListOfStrings(listOfStrings : List<String>, mapFunction: (String) -> Any): List<Any> {
        val newList = mutableListOf<Any>()
        for (item in listOfStrings) {
            newList.add(mapFunction(item))
        }
        return newList
    }


    val strings = listOf("1", "hello", "kotlin!")

    val mapped = mapListOfStrings(strings) {// "it" is the default variable name
        when (it){
            in "1234567890" -> it.toInt()
            "kotlin!" -> "KOTLINKOTLINKOTLIN!!!"
            else -> it
        }
    }




    // Function that generates function - note the return type
    fun generateMapFunction() : (String) -> Any {
        return fun (argument : String) : Any {
            return argument.lowercase(Locale.getDefault())
        }
    }




    val mappedAgain = mapListOfStrings(strings, generateMapFunction())



}

