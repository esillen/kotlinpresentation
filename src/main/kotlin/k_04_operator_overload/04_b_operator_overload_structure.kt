package k_04_operator_overload

class MyStruct<T>(size : Int) {

    private val items  = Array<Any?>(size){}

    operator fun get(index : Int) : T {
        if (items[index] == null) {
            throw IllegalAccessException("Not yet populated!")
        }
        return items[index] as T
    }

    operator fun set(index : Int, item : T) {
        items[index] = item
    }

    operator fun contains(item : T) : Boolean {
        return items.contains(item)
    }

}

fun main() {
    val struct = MyStruct<String>(5);
    struct[0] = "Kotlin"
    struct[1] = "Has"
    struct[2] = "Many"
    struct[3] = "Good"
    struct[4] = "Features"

    if ("Kotlin" in struct) {
        println("Good stuff!")
        struct[1] = struct[0]
    }

}

// More here!
// https://kotlinlang.org/docs/operator-overloading.html
