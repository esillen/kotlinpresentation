package k_01_syntax

// Class declaration with primary constructor (this is enough)
class User(val username : String, val email: String, val id: Long)

// Instantiating a new User object
val user = User("esillen", "esillen@mail.com", 1337)




// Beefier class declaration
// Default parameter
class Monster(val health : Int = 100, val name : String) {

    // Non-constructor fields go here
    var healthLeft : Int = health


    // A secondary constructor can be added (very seldom needed, try to avoid)
    constructor(health: Int, name : String, healthLeft: Int) : this(health, name) {
        this.healthLeft = healthLeft
    }


    // init block(s) is a constructor appendix
    init {
        println("Let me present myself, I am $name!") // String interpolation
    }


    // "member function"
    fun takeDamage(damage : Int) {
        println("$name takes $damage damage.")
        healthLeft -= damage
        if (healthLeft < 0) {
            die()
        } else {
            println("$name is still alive!")
        }
    }

    // functions are public by default
    private fun die() {
        println("Urrrrgh... Tell my children that I love them!")
    }

}


// Instantiate Monsters
val seal = Monster(health = 10, "Seal")
val ox = Monster(name = "Ox") // health = 100 by default
val damagedLion = Monster(1000, "Lion", 10) // Using the secondary constructor



// Interface declaration, just like Java
interface Hero {
    fun attack(monster : Monster) // <-- implementing class must implement or be abstract

    fun impress() {
        println("I've killed two birds with one stone!") // <-- default implementation
    }
}




// Define and instantiate an object implementing the Hero interface
val hero =  object : Hero {
    override fun attack(monster : Monster) {
        println("take that!!")
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



// Like Java's public static void main(String[] args) {...}
fun main() {

    World.presentToUser()

    hero.attack(seal)
    hero.attack(ox)


    println(seal.healthLeft)
}
