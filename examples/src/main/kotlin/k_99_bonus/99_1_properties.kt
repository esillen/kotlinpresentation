package k_99_bonus

class ShoppingBag {
    val things : List<Thing>
        get() = _things.toList()
    // property getter.

    var name : String = "unnamed"
        private set
    // property setter is private, getter public by default.

    // getters/setters can also be declared later when needed. No need to always add getters/setters pre-emptively.


    private val _things = mutableListOf<Thing>()

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


    // bag.things = listOf() //Does not work! val doesn't have setter :D

    // bag.name = "boring bag" // Does not work! setter is private


}