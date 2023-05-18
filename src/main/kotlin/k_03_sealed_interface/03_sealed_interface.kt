package k_03_sealed_interface

// This interface is sealed, telling the compiler it only has implementations within the package
sealed interface Result




data class Failure(val error : String) : Result
data class Success(val data : String) : Result









fun fetchSecretData(code : Int) : Result {
    // Actually do something complicated like fetching data from backend or something
    // This is just a toy example
    return if (code == 123) {
        Success("The ex president's tax returns are in the box labeled \"boring stuff\"!")
    } else {
        Failure("Wrong code!")
    }
}







fun main() {
    val result = fetchSecretData(4321)

    // When is like a more powerful switch statement.
    // Note that it smart casts the result to the proper type.
    val data : String = when (result) {
        is Failure -> "Something went wrong with error: ${result.error}"
        is Success -> "You got in! Data: ${result.data}"
        // else -> println("Huh? This is not possible!") // else not needed for sealed interface!
    }
}


// NOTE: add this and watch the "when" clause break
// data class AnotherTypeOfResult(val errorCode : String, val moreData : String) : Result

