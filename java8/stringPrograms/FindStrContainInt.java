package stringPrograms;

class FindStrContainInt {
    public static void main(String args[]) {
        String str = "asfdg5";

        boolean containsInteger = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                containsInteger = true;
           // break;
            }
        }

        if (containsInteger) {
            System.out.println("The string contains an integer.");
        } else {
            System.out.println("The string does not contain an integer.");
        }
    }
}
