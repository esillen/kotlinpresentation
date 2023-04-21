package k_02_nullable

class Person(val firstName : String, val middleName : String?, val lastName : String)


fun printPersonSloppily(person : Person) {
    println("this is ${person.firstName} ${person.middleName} ${person.lastName}")
}



fun getAllMiddleNames(people : Set<Person>) : Set<String> {
    val middleNames : MutableSet<String> = mutableSetOf()

    // This can be made more neat, but we're making a point here
    for (person in people) {
        if (person.middleName != null) {
            middleNames.add(person.middleName) // Can never result in a NullPointerException
        }
    }

    return middleNames
}



fun printPersonNeatly(person : Person) {
    // If-statements have return values and can be part of an expression
    val middlePart = if (person.middleName != null) {
        " ${person.middleName} "
    } else {
        " "
    }
    val presentableName = "${person.firstName}${middlePart}${person.lastName}"
    println("this is $presentableName")
}





fun main() {

    val pelle = Person("Pelle", null, "Plutt")
    val jossan = Person("Jossan", "Marit", "Svensson")
    val bosse = Person("Bosse", "Fredrik", "Karlsson")



    printPersonSloppily(pelle)
    printPersonSloppily(jossan)
    printPersonSloppily(bosse)



    val people = setOf(pelle, jossan, bosse)
    val middleNames = getAllMiddleNames(people)
    println("All middle names:")
    middleNames.forEach {
        println(it) // "it" is the default name assigned to single argument lambdas
    }



    printPersonNeatly(pelle)
    printPersonNeatly(jossan)
    printPersonNeatly(bosse)


    // And last, if you want to you can get the null pointer exception with the !! (bang-bang) operator:
    println(pelle.middleName!!)
    // This is basically never recommended.
}

// TODO:
// Try changing middleName to var, why no compile?