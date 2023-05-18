public class Vector2 {
    final double x;
    final double y;
    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(x + other.x, y + other.y);
    }

    public Vector2 subtract(Vector2 other) {
        return new Vector2(x - other.x, y - other.y);
    }

    public Vector2 multiply(double other) {
        return new Vector2(x * other, y * other);
    }

    public boolean equals(Vector2 other) {
        return x == other.x && y == other.y;
    }

    public String toString() {
        return "" + x + " " + y;
    }


    public static void main(String[] args) {

        Vector2 ones = new Vector2(1,1);

        // Our formula tells us to do (1,1) * 4 + (1,1) * 5 + (1,1) * 6
        Vector2 wrongResult = ones.multiply(4).add(ones).multiply(5).add(ones).multiply(6);
        // Wrong!! Method calls doesn't respect multiplication precedence over addition

        Vector2 correctResult = ones.multiply(4)
                .add(ones.multiply(5))
                .add(ones.multiply(6)); // Correct but can get messy with parentheses

        System.out.println(wrongResult);
        System.out.println(correctResult);
    }
}
