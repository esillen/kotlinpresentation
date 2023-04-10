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
        Vector2 start = new Vector2(0,0);
        Vector2 roundTrip = start.add(new Vector2(4,0)).add(new Vector2(-4, 5)).add(new Vector2(0, -5));

        // Our formula tells us to do (1,1) * 5 + (1,1) * 7 + (1,1) * 9

        Vector2 ones = new Vector2(1,1);
        Vector2 wrongResult = ones.multiply(5).add(ones).multiply(7).add(ones).multiply(9); // Wrong!! Method calls doesn't respect multiplication precedence
        Vector2 correctResult = ones.multiply(5)
                .add(ones.multiply(7))
                .add(ones.multiply(9)); // Correct but can get sweaty with parentheses

        System.out.println(wrongResult);
        System.out.println(correctResult);
    }
}
