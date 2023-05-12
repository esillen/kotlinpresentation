package k_02_nullable





fun main() {

    class Person(val firstName : String, val middleName : String?, val lastName : String) {

        /*fun processMiddleName() {
            val middleNameRef : String = middleName // Does not work!
            // ... Do stuff ...
        }*/

        fun processFirstName() {
            val nullableFirstNameRef : String? = firstName // Does work but IntelliJ complains
            if (firstName == null) { // Does work but IntelliJ complains
                // ... Do stuff ...
            }
        }

    }

    val pelle = Person("Pelle", null, "Plutt")
    val jossan = Person("Jossan", "Marit", "Svensson")
    val bosse = Person("Bosse", "Fredrik", "Karlsson")


    fun getAllMiddleNames(people : Set<Person>) : Set<String> {
        val middleNames : MutableSet<String> = mutableSetOf()

        // This can be neatified, but we're making a point here
        for (person in people) {
            if (person.middleName != null) {
                middleNames.add(person.middleName) // Can never result in a NullPointerException
            }
        }

        return middleNames
    }


    val people = setOf(pelle, jossan, bosse)
    val middleNames = getAllMiddleNames(people)
    println("All middle names:")
    middleNames.forEach {
        println(it) // "it" is the default name assigned to single argument lambdas
    }


    fun printPerson(person : Person) {
        val middlePart = if (person.middleName != null) {
            " ${person.middleName} "
        } else {
            " "
        }
        val presentableName = "${person.firstName}${middlePart}${person.lastName}"
        println("this is $presentableName")
    }

    printPerson(pelle)
    printPerson(jossan)
    printPerson(bosse)


    // And last, if you want to you can get the null pointer exception with the !! (bang-bang) operator:
    println(pelle.middleName!!)
    // This is recommended to avoid and is often possible and easy to work around with the language.
}

// TODO:
// Try changing middleName to var, why no compile?