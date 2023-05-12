package k_01_syntax

class ShoppingBag {

    var name : String = "unnamed"
        private set // property setter is private, getter public by default.

    private val _things = mutableListOf<Thing>()

    val things : List<Thing>
        get() = _things.toList() // property getter.

    // getters/setters can also be declared later when needed. No need to always add getters/setters pre-emptively.

    fun addThing(thing: Thing) {
        _things.add(thing)
        name = "bag with ${thing.name}"
    }
}



class Thing(val name: String)

fun test() {
    val bag = ShoppingBag()
    bag.addThing(Thing("toothbrush"))
    bag.addThing(Thing("grocery"))

    println(bag.name)

    val thingsInTheBag  = bag.things // Yes! No bag.getThings() in my codebase!

    // bag.things = listOf() // Does not work! val doesn't have setter

    // bag.name = "bag that got messed with" // Does not work! setter is private


}
