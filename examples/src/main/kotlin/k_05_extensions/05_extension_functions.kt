package k_05_extensions

import k_05_extensions.extension_functions.Person

val erik = Person("Erik", emptySet())
val andreas = Person("Andreas", emptySet())
val puma = Person("Puma", emptySet())


// This adds the function "addFriend" to be used on any object with the Person type!
fun Person.addFriend(newFriend : Person) {
    println("A new friendship was formed between ${this.name} and ${newFriend.name}!")
    println("This means ${this.name} got a new friend AND ${newFriend.name} also got a new friend!!")
    this.friends.add(newFriend)
    newFriend.friends.add(this)
}


fun Person.befriendFriendsOfFriend(person : Person) {
    val newFriends = person.friends
    this.friends.addAll(newFriends)
}

fun Person.countLettersOfFriends() {
    this.friends.sumOf {
        it.name.count()
    }
}

// We're cool kids so we can extend stdlib
fun Int.isEven() : Boolean {
    return this % 2 == 0
}


// Can also be used for more interesting types
fun Set<Person>.calcNumFriends() : Int {
    return this.sumOf {
        it.friends.size
    }
}
// In java-land you would probably do something like
// private void int calcNumFriends(Set<Person> people)  <-- ewww disgusting!! Because you actually want to do this on the type, not pass as argument!


fun main() {
    val people = setOf(erik, andreas, puma)

    erik.addFriend(andreas)
    erik.addFriend(puma)

    println("number of friendships ${people.calcNumFriends()}")
}