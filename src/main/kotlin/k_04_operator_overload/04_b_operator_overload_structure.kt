package k_04_operator_overload
// MyStruct:
// set size of items
// can get and set items at indicies inside the array bounds
// Has method for checking if item is in the structure
// setting and getting outside bounds throws some exception
// getting unset item throws some exception
// does not allow setting item to null



// New Kotlin feature! data class gives us immutability, toString, hash and equals!
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
    struct[1] = "Har"
    struct[2] = "Många"
    struct[3] = "Bra"
    struct[4] = "Features"

    if ("Kotlin" in struct) {
        println("Bra språk!")
        struct[1] = struct[0]
    }

}

// More here!
// https://kotlinlang.org/docs/operator-overloading.html
