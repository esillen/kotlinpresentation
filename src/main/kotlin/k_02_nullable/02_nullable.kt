package k_02_nullable




fun main() {

    class Person(val firstName : String, val middleName : String?, val lastName : String) {

        fun doSomething() {

            // val middleNameRef : String = middleName // Does not work!

            // val nullableFirstNameRef : String? = firstName // to nullable assignment works with warning

            // if (firstName == null) { // Null equality works with warning
                // ... Do stuff ...
            //}
        }

    }





    // Example of usefulness
    fun giveBirth(parent: Person, gender : String, middleName: String?) : Person {
        val childFirstName = if (gender == "boy") {
            parent.firstName + "sson"
        } else if (gender == "girl") {
            parent.firstName + "sdotter"
        } else {
            parent.firstName + "sbarn"
        }
        return Person(childFirstName, middleName, parent.lastName)
    }
    // In Java, you would have to make sure that firstName and lastName is never null. Something like this:

    // if (parent.firstName != null && parent.lastName != null) {
    //   ... do stuff ...
    // } else {
    //   ... don't give birth?
    // }

    // But where do you put that logic?
    // What do you do if something is null?
    // What if it becomes null in another thread AFTER your null check?

    // Best answer is to "write good code" but Kotlin avoids this by having non-nullable (and immutable) be the default.
    // Kotlin guards and seeks attention to code not written that way

    // Yes @NotNull etc. exists, but they are weak guards. And they're ugly. And not part of the language.






    // Syntactic sugar example
    fun getAllMiddleNames(people : Set<Person>) : Set<String> {
        val middleNames : MutableSet<String> = mutableSetOf()

        for (person in people) {
            if (person.middleName != null) {
                middleNames.add(person.middleName) // Can never result in a NullPointerException.
                                                   // Notice the smart cast from String? to String.
            }
        }
        return middleNames
    }

    // NOTE:
    // Try changing middleName to var in Person. Why no compile?




    // And last, if you want to, you can get the null pointer exception with the !! (bang-bang) operator:
    val pelle = Person("Pelle", null, "Svensson")
    println(pelle.middleName!!)

    // Use of !! is strongly discouraged.
    // Use of !! is usually avoidable outside core libraries.

}


