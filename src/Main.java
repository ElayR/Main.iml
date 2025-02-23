import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Specify desired password length.");
        System.out.println("Note that passwords with length less then 8 are easier to crack.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int length;

////////////////////////////////////////////////////////////////////////////////////////////

        while(true){
            String input = scanner.nextLine();
            length = Integer.parseInt(input);
//parse to convert

            if(length < 6){
                System.out.println("Password shouldn't contain less then 6 characters. PLease input valid number between 6-64.");
                continue;

            }else if(length > 64){
                System.out.println("Password shouldn't contain more then 64 characters. Please input valid number between 6-64.");
                continue;

            }else{
                break;
            }
        }

////////////////////////////////////////////////////////////////////////////////////////////
        boolean useLower = false, useUpper = false, useNumbers = false, useSymbols = false;
        // will be true if selected
        while (true) {

            System.out.println("What kind of character types should be included? (at least 2)");
            System.out.println("1) lowercase ");
            System.out.println("2) UPPERCASE ");
            System.out.println("3) 9436375 ");
            //tried to write numbers with numbers
            System.out.println("4) !@#$%^&*()_-+={[}]<>.?/ ");

            String[] choosealready = scanner.nextLine().split(" ");


// numbers split by space turn into array
            for (String choice : choosealready) {
                switch (choice) {

                    //looks through user input
                    case "1": useLower = true; break;
                    case "2": useUpper = true; break;
                    case "3": useNumbers = true; break;
                    case "4": useSymbols = true; break;

                }
            }

            int count = (useLower ? 1 : 0) + (useUpper ? 1 : 0) + (useNumbers ? 1 : 0) + (useSymbols ? 1 : 0);
            if (count >= 2) break;

            // ? is short for if thing, basically saying if useSomething is true return 1 else return 0
            // if by the end of the count there is less then 2 returned counts, pops the sout bellow

            System.out.println("Select at least 2.");

        }

//////////////////////////////////////////////////////////////////////////////////

        System.out.println("Enter your key word. (Enter - skip)");
        String keyword = scanner.nextLine().trim();

        String password = passwordGenerator3000 (length, keyword, useLower, useUpper, useNumbers, useSymbols, random);
        System.out.println("Generated Password: " + password);
        String strength = ratePasswordStrength(password);
        System.out.println("Password Strength: " + strength);
    }

    /////////////////////////////////////////////////////////////////////////////////

    public static String passwordGenerator3000 (int length, String keyword, boolean useLower, boolean useUpper, boolean useNumbers, boolean useSymbols, Random random){

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String capslock = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+={[}]<>.?/";
        //character type used


        StringBuilder characters = new StringBuilder();
        if (useLower) characters.append(lowercase);
        if (useUpper) characters.append(capslock);
        if (useNumbers) characters.append(numbers);
        if (useSymbols) characters.append(symbols);

        StringBuilder password = new StringBuilder();

        //
        if (!keyword.isEmpty()) {
            password.append(mixKeyword(keyword, random));
        }

        while (password.length() < length) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        return shuffleString(password.toString(), random);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    private static String mixKeyword(String keyword, Random random) {

        StringBuilder mixed = new StringBuilder();

        for (char c : keyword.toCharArray()) {
            mixed.append(Character.isLetter(c) ? random.nextBoolean() ? Character.toUpperCase(c) : Character.toLowerCase(c) : c);
        }
        return mixed.toString();
    }
    private static String shuffleString(String input, Random random) {

        List<Character> characters2 = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters2.add(c);
        }

        Collections.shuffle(characters2, random);

        StringBuilder shuffled = new StringBuilder();

        for (char c : characters2) {
            shuffled.append(c);
        }
        return shuffled.toString();
    }

    public static String ratePasswordStrength(String password) {
        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (password.matches(".*[a-z].*")) {
            score++;
        }

        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        if (password.matches(".*\\d.*")) {
            score++;
        }

        if (password.matches(".*[!@#$%^&*()_+={[}]<>.?/].*")) {
            score++;
        }


        String rating = "Weak";
        if (score == 5) {
            rating = "Very Strong";
        } else if (score == 4) {
            rating = "Strong";
        } else if (score == 3) {
            rating = "Medium";
        } else if (score == 2) {
            rating = "Weak";
        }

        return rating;
    }
}