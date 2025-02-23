# Password Generator (I didn't write String Encryption/Decryption on the list, someone did and I don't know how to change it)  ¯\_(ツ)_/¯
 
If you are reading this I am very glad because even though it shouldn’t be as lengthy as c++ projects I did, it should still be quite long. I am at the very start so I don’t know for sure. 
By the way I tried intelij idea and then Vscode, both are troublesome, I will use online compiler at times I don’t want to waste time by trying to fix problems with my programms.
Haha,  I am joking, this whole project is just me copy pasting my code from online compiler to Vscode to make it look readable.
import java.util.Scanner;


class Main {
    public static void meow(String[] args) {
        System.out.println("Specify desired password length.");
        System.out.println("Note that passwords with length less then 8 are easier to crack.");


        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char c = line.charAt(0);


        System.out.println("Do you want to include your own key word/words? (Keywords are used to make remembering passwords easier.)");
        System.out.println("1) Yes");
        System.out.println("2) No");


        String yesno = scanner.nextLine();


        char y = yesno.charAt(0);
        if(y == '1'){
            System.out.println("Input your keywords.");


        }


        if( c >= '6') {
            System.out.println("What kind of character types should be included?");
            System.out.println("1) lowercase ");
            System.out.println("2) UPPERCASE ");
            System.out.println("3) 9436325 ");
            System.out.println("4) !@#$%^&*()_-+={[}]<>.?/ ");


        }else{
            System.out.println("Password shouldn't contain less then 6 characters.");
        }
    }
}

The basic things, then there will be code. I used char c but since there could be double digits I fixed it later.
Don’t judge right now please I am just going to draft what I want to see first 😪

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
                System.out.println("Specify desired password length.");
            System.out.println("Note that passwords with length less then 8 are easier to crack.");
            
       Scanner scanner = new Scanner(System.in);
       int length;
       int randomness;
////////////////////////////////////////


    while(true){
            String input = scanner.nextLine();


        if(length < 6){
        length = Integer.parseInt(input);


//parse to convert


        System.out.println("Password shouldn't contain less then 6 characters. PLease input valid number between 6-64.");
        return;
        }else if(length > 64){
            System.out.println("Password shouldn't contain more then 64 characters. Please input valid number between 6-64.");
        }else{
            break;
        }
    }


///////////////////////////////////////


    System.out.println("Do you want to include your own key word/words?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        
            String yesno = scanner.nextLine();
            
            char y = yesno.charAt(0);
                if(y == '1'){
                    System.out.println("Input your keywords.");
                      String keywords = scanner.nextLine();
                }else if(y == '2'){
                    
                    //skip if 2 
                    
                }else if (y != '1'|| y != '2'){
                    System.out.println("This will default to NO.");
                }


////////////////////////////////////
    boolean useLower = false, useUpper = false, useNumbers = false, useSymbols = false;
    while (true) {
    //boolean maybe?
    
    System.out.println("What kind of character types should be included?");
            System.out.println("1) lowercase ");
            System.out.println("2) UPPERCASE ");
            System.out.println("3) 9436325 ");
            System.out.println("4) !@#$%^&*()_-+={[}]<>.?/ ");
            
        String[] chooosealready = scanner.nextLine().split(" ");
        // numbers split by space


        }


    String password = passwordGenerator3000(length);
    System.out.println("Generated Password: " + password);


    }


    public static String passwordGenerator3000 (int length){


        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String capslock = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+={[}]<>.?/";
    
        Random random = new Random();
        StringBuilder password = new StringBuilder();


    }



More fixed version
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
        return;
        }else if(length > 64){
            System.out.println("Password shouldn't contain more then 64 characters. Please input valid number between 6-64.");
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
            
        String[] chooosealready = scanner.nextLine().split(" ");
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
///
    System.out.println("Enter your key word. (Enter - skip)");
                String keyword = scanner.nextLine().trim();


/////////////////////////////////////////////////////////////////////////////////
    }
}
    String password = passwordGenerator3000 (length, keyword, useLower, useUpper, useNumbers, useSymbols, random);
    System.out.println("Generated Password: " + password);


////////////////////////////////////////////////////////////////////////////////
    public static String passwordGenerator3000 (int length, String keyword, boolean useLower, boolean useUpper, boolean useNumbers, boolean useSymbols, Random random){
        
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String capslock = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+={[}]<>.?/";
        //symbols used


        Random random = new Random();
        StringBuilder password = new StringBuilder();
        if (useLower) password.append(lowerCase);
        if (useUpper) password.append(upperCase);
        if (useNumbers) password.append(numbers);
        if (useSymbols) password.append(symbols);
    }

There is also on the below another thing but it is kinda just blabbering
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


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
        return;
        }else if(length > 64){
            System.out.println("Password shouldn't contain more then 64 characters. Please input valid number between 6-64.");
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
            
        String[] chooosealready = scanner.nextLine().split(" ");


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
}


/////////////////////////////////////////////////////////////////////////////////


public static String passwordGenerator3000 (int length, String keyword, boolean useLower, boolean useUpper, boolean useNumbers, boolean useSymbols, Random random){
        
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String capslock = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+={[}]<>.?/";
        //character type used


        Random random = new Random();
        StringBuilder characters = new StringBuilder();
        if (useLower) characters.append(lowerCase);
        if (useUpper) characters.append(capslock);
        if (useNumbers) characters.append(numbers);
        if (useSymbols) characters.append(symbols);
    
        StringBuilder password = new StringBuilder();


        if (!keyword.isEmpty()) {
            password.append(mixKeyword(keyword, random));
        }


        while (password.length() < length) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }


        return shuffleString(password.toString(), random);
}

In c++ I tried doing one function to another. It still is my favourite way to do it, but I think this way of drafting logic and then troubleshooting is also interesting.
I learned a lot while doing project but I am not sure it will stick in my head, unfortunately without repetition even if you underestand, it is unlikely to remember. 
About repetition, I tried doing exercises but I would be lying, if I say that I had any kind of satisfaction from getting things right. It is said that it is hard to start but easy to continue, but from my perspective nothing holds me from starting something the hardest part is actually making my brain pay attention or just not fall asleep while trying to continue something. It is not that I am not even interested, I just need constant stimulation, music, fear and adrenaline somehow works best. 
From what I heard it maybe quite many reasons for this, maybe I will figure it out eventually, I am not sure. 
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
        return;
        }else if(length > 64){
            System.out.println("Password shouldn't contain more then 64 characters. Please input valid number between 6-64.");
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
    }




By the end of it programiz stopped responding and it is one of the only online compilers that can get input while executing no Vscode mo IntelijIdea no Programiz I am so tired why is it always when I need to check.  

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

I fixed intelij, half of my day gone.  To be honest I took this project as soon as I saw it because I use 10+ accounts that I change passwords of once a month, I never write it down, so it is a struggle not only to remember but also to come up with new ones.
The key word was to remember it easier, but code shuffles it too much and it doesn’t matter what key word I used, but I still take it as a win.
Thank you for reading this step by step struggle.  Contents might be not as serious as my other projects, but from the way I write I think it is easy to catch on.
Figured that it is much more easier to pay attention on something I consider as a pleasure, like a joke then super documental project (even though it is).


