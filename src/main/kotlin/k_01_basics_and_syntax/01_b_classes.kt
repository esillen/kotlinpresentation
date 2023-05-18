package k_01_basics_and_syntax

// CLASSES



// Class declaration with primary constructor
class User(val username : String, val email: String, val id: Long)


// Instantiating a new User object
val user = User("esillen", "esillen@mail.com", 1337)


// All classes are final by default.
// class SuperUser() : User("asdf", "sdf",123)  // Not allowed!








// Beefier class declaration
class Monster(val health : Int, val name : String) {


    // Non-constructor fields go here
    var healthLeft : Int = health


    // More (secondary) constructors can be added
    constructor(health: Int, name : String, healthLeft: Int) : this(health, name) {
        this.healthLeft = healthLeft
    }


    // init block runs like a constructor appendix
    init {
        println("Let me present myself, I am $name!") // String interpolation
    }


    // member function
    fun takeDamage(damage : Int) {
        healthLeft -= damage
        if (healthLeft <= 0) {
            die()
        }
    }

    // member functions are public and closed by default
    private fun die() {
        println("Urrrrgh... Tell my children that I love them!")
    }

}


// Instantiate Monsters
val seal = Monster(10, "Seal") // Normal positional assignment

val ox = Monster(name = "Ox", health = 100) // By naming variables (I prefer this style). Can change position

val damagedLion = Monster(1000, "Lion", 10) // Using the secondary constructor









// Interface declaration, just like Java
interface Hero {
    fun attack(monster : Monster)
}




// Define and instantiate an object implementing the Hero interface
val hero =  object : Hero {
    override fun attack(monster : Monster) {
        monster.takeDamage(50);
    }
}




// We can also create an object that doesn't implement anything.
object World {
    val name = "Narnia"

    fun presentToUser() {
        println("Welcome to $name!")
    }
}


fun main() {
    World.presentToUser() // Use the object immediately!
}


// data class. Gives toString(), equals(), hashcode().
// Like java's record but
// - can have mutable fields
// - has copy()
// - can extend other classes
// - can have instance variables and complex logic (domain object candidate?)
data class Player(val name: String, val score: Int)
