public static String concatenateToLower(String str1, String str2) {
        String result = str1 + str2;
        return result.toLowerCase();
    }

    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";

        String concatenated = concatenateToLower(first, second);
        System.out.println("Concatenated lowercase string: " + concatenated);
    }
}
