package k_05_extensions.person

class Person (val name : String, friends: Set<Person>) {
    val friends : MutableSet<Person> = friends.toMutableSet()
}