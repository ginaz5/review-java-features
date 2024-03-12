package review.example.v16.record;

public record Rational(int num, int denom) {
    public Rational{
        int gcd = gcd(num, denom);
        num /= gcd;
        denom /= gcd;
    }

    private int gcd(int num, int denom) {
        return denom == 0 ? num : gcd(denom, num % denom);
    }
}

class TestRational {
    public static void main(String[] args) {
        Rational rational = new Rational(6, 9);

        System.out.println(rational);
    }
}