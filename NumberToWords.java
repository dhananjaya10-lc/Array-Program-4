public class NumberToWords {

    static String one[] = {"", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};

    static String ten[] = {"", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"};

    static String convert(int n) {
        if (n < 20)
            return one[n];

        if (n < 100)
            return ten[n / 10] + " " + one[n % 10];

        if (n < 1000)
            return one[n / 100] + " hundred " + convert(n % 100);

        return one[n / 1000] + " thousand " + convert(n % 1000);
    }

    public static void main(String[] args) {
        int num = 2917;
        System.out.println(convert(num));
    }
}