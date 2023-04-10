package k_05_extensions.extension_functions

class Person (val name : String, friends: Set<Person>) {
    val friends : MutableSet<Person> = friends.toMutableSet()
}