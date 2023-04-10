package k_06_programming_patterns

// This interface is sealed, telling the compiler it only has a certain amount of implementations
sealed interface Result

data class Failure(val error : String) : Result
data class Success(val data : String) : Result
//data class AnotherTypeOfFailure(val errorCode : String, val moreData : String) : Result


fun fetchSecretData(code : Int) : Result {
    // Actually do something complicated like fetching data from backend or something
    // This is just a toy example
    return if (code == 123) {
        Success("The president's diary is in his drawer!")
    } else {
        Failure("Wrong code!")
    }
}

fun main() {
    val result = fetchSecretData(4321)

    // When is like a more powerful switch statement.
    // Note that it understands if we have not emptied all possible paths at compile time
    // It also automatically knows which type "result" will be at compile time
    when (result) {
        is Failure -> println("Something went wrong with the following error: ${result.error}")
        is Success -> println("You got in! Here's your secret data: ${result.data}")
        // else -> println("Huh? This is not possible!") // else not needed for sealed interface!
    }
}

