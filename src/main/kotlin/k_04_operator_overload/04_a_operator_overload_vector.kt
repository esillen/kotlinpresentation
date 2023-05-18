package k_04_operator_overload

data class Vector2(val x : Double, val y: Double) {
    operator fun plus(other : Vector2) : Vector2 {
        return Vector2(x + other.x, y + other.y)
    }

    operator fun minus(other : Vector2) : Vector2 {
        return Vector2(x - other.x, y - other.y)
    }

    operator fun times(other : Double) : Vector2 {
        return Vector2(x * other, y * other)
    }


}

fun main() {

    // Our formula tells us to do (1,1) * 4 + (1,1) * 5 + (1,1) * 6
    val ones = Vector2(1.0, 1.0)
    val result = ones * 4.0 + ones * 5.0 + ones * 6.0

    println(result) // Should be (15, 15)
}
