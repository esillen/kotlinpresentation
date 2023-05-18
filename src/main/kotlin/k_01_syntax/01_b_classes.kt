package k_01_syntax

// Class declaration with primary constructor (this is enough)
class User(val username : String, val email: String, val id: Long)

// Instantiating a new User object
val user = User("esillen", "esillen@mail.com", 1337)










// Beefier class declaration
class Monster(val health : Int, val name : String) {


    // Non-constructor fields go here
    var healthLeft : Int = health


    // A secondary constructor can be added (very seldom needed, try to avoid)
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
        if (healthLeft < 0) {
            die()
        }
    }

    // functions are public but closed by default
    private fun die() {
        println("Urrrrgh... Tell my children that I love them!")
    }

}


// Instantiate Monsters
val seal = Monster(10, "Seal")
val ox = Monster(name = "Ox", health = 100) // Can change position by naming variables
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




// We can also create an arbitrary object that doesn't implement anything.
object World {
    val name = "Narnia"

    fun presentToUser() {
        println("Welcome to $name!")
    }
}


fun main() {

    World.presentToUser() // Use the object immediately!

}
