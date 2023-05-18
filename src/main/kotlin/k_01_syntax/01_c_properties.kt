package k_01_syntax

import java.lang.IllegalArgumentException

// NOTE:
// Compare with JavaBuilding.java







class Building {

    var owner : LegalPerson = LegalPerson("The state")

    var name : String = "unnamed"
        private set // Makes the setter private

    var color : String = "Gray"
        set(value) {
            if (value == "UltraUgly") {
                throw IllegalArgumentException("too ugly")
            }
            field = value
        }

}




fun main() {
    val building = Building()
    building.color = "UltraNice™"
}






















class LegalPerson(val name: String)
class Thing(val name: String)