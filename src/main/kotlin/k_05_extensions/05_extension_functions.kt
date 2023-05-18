package k_05_extensions

import k_05_extensions.person.Person // Import from another package


val erik = Person("Erik", mutableSetOf())
val andreas = Person("Andreas", mutableSetOf())
val puma = Person("Puma", mutableSetOf())


// This adds the function "addFriend" to be used on any object with the Person type!
fun Person.addFriend(newFriend : Person) {
    this.friends.add(newFriend)
}

// In Java you would probably do something like:
// private static void int addFriendToPerson(Person person, Person friend) {
//     ...
// }

// Problems:
// Who's the target? First argument? That's just convention.
// You need to be more specific with naming or cause confusion.




// We're cool kids, so we can extend standard lib if we wish
fun Int.isEven() : Boolean {
    return this % 2 == 0
}


// Extensions also works for generics!
fun Set<Person>.calcNumFriends() : Int {
    return this.sumOf {
        it.friends.size
    }
}



fun main() {
    val people = setOf(erik, andreas, puma)

    erik.addFriend(andreas)
    andreas.addFriend(erik)
    erik.addFriend(puma)
    puma.addFriend(erik)

    println("number of friendships ${people.calcNumFriends()}")
}