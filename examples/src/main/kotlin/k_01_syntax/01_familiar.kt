package k_01_syntax



class Monster(val health : Int = 100, val name : String) {
    var healthLeft : Int = health
        get
        private set // property getter and setter. SUPER COOL FEATURE: These can also be declared later when needed!


    // This always runs, similar to a constructor
    init {
        println("Let me present myself, I am $name!") // String interpolations
    }

    // Functions inside classes are called "member functions"
    fun takeDamage(damage : Int) {
        println("$name takes $damage damage.")
        healthLeft -= damage
        if (healthLeft < 0) {
            die()
            if (healthLeft < -30) {
                // Overkill
                println("The epic blow from the hero splatters body parts everywhere")
            }
        } else {
            println("$name still lives!")
        }
    }

    // functions are public by default
    private fun die() {
        println("Urrrrgh... Tell my children that I love them!")
        // ... some more logic
    }

}


// Instantiate Monsters (note we don't use "new" to instantiate Monster objects)
val seal = Monster(health = 10, "Seal")
val ox = Monster(name = "Ox") // health = 100 by default




// Interface declaration, just like Java
interface Hero {
    fun attack(monster : Monster) // <-- implementing class must implement

    fun impress() {
        println("I've killed two birds with one stone!") // <-- default implementation
    }
}




// Define and instantiate an object "Hero"
object OurHero : Hero {
    override fun attack(monster : Monster) {
        println("take that!!")
        monster.takeDamage(50);
    }
}




// Name a function main() to make it the entry point of your program
// In Java: public static void main(String[] args) {...}
fun main() {
    OurHero.attack(seal)
    OurHero.attack(ox)
    println(seal.healthLeft)
}
