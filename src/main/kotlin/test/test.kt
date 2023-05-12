package test

var counter : Int = 0

fun functionThatDoesStuffAndReturnsABoolean() : Boolean {
    counter--
    counter++

    val result = if (counter == 0) {
        "still zero"
    } else {
        "no longer zero!"
    }

    return if (result == "still zero") {
        false
    } else if (result == "no longer zero!"){
        true
    } else {
        throw IllegalStateException("you messed up!")
    }
}

fun main() {
    val returnValue = functionThatDoesStuffAndReturnsABoolean()
    print(returnValue)
}

