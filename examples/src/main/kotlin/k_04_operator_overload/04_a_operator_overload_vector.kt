package k_04_operator_overload

// New Kotlin feature! data class gives us immutability, toString, hash and equals!
data class Vector2(val x : Double, val y: Double) {
    operator fun plus(other : Vector2) : Vector2 {
        return Vector2(x + other.x, y + other.y)
    }

    operator fun times(other : Double) : Vector2 {
        return Vector2(x * other, y * other)
    }
}

fun main() {
    val start = Vector2(0.0, 0.0)
    start + Vector2(4.0, 0.0) + Vector2(-4.0, 5.0) + Vector2(0.0, -5.0)

    // Our formula tells us to do (1,1) * 5 + (1,1) * 7 + (1,1) * 9
    val ones = Vector2(1.0, 1.0)
    val result = ones * 5.0 + ones * 7.0 + ones * 9.0
    println(result)
}
