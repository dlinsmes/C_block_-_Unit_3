import java.util.Scanner;

public class Arrays {
    public static void main(String [] args) {

        //an array is a collection of data
        //-arrays are different from lists because
        //the size (length) needs to be predefined
        //-the size can't change

        //an array needs to be declared as a single
        //data type and only hold values of that type

        String [] words = new String[4];
        //declare a string array called words that
        //has a length of 4

        //to refer to a value in an array, use an
        //index (position)
        //-indexing starts at 0
        //-last possible index is always length-1

//        words[0] = "apple";
        words[1] = "banana";
        words[2] = "minion";
        words[3] = "gru";

        System.out.println("element at index 1 is " + words[1]);
        System.out.println("length of words is " + words.length);

        System.out.println("element at index 0 is " + words[0]);
        //for arrays - any uninitialized values will default to
        //strings: null (nothing)
        //int: 0
        //double: 0.0
        //booleans: false

        String word;
        //System.out.println(word);
        //values will only default in arrays, not variables

        System.out.println(words);
        //if you try to print out all values in an array like this,
        //it doesn't work - this prints the memory location (not useful)

        //to efficiently print all values in a list, use a loop
        //that iterates through all the indices
        for (int i = 0; i < words.length; i++) {
            //for iterating through arrays, it's best practice to
            //set the condition to the array length instead of a
            //hardcoded value so that the loop will still work if
            //the length of the array changes later on
            System.out.println(words[i]);
        }

        //words[4]= "sdfasd";
        //if you try to use an index that's not valid, the program
        //will crash with an out of bounds error

        int [] nums = {3, 6, 8, 5};
        //if you know the values ahead of time, you can declare and
        //initialize values at the same time
        //-length will be 4

        int [] nums2;
        //nums2 = {1, 2, 3, 4, 5};
        //this only works if you do it in the declaration step

        //still need to set the length of nums2
        nums2 = new int[10];

        nums2[0] = 7;

        //no value defaults to 0
        System.out.println(nums2[3]);

        //assign random numbers between 1 and 10 to all values of nums2
        System.out.println("nums2:");
        for (int i = 0; i < nums2.length; i++) {
            //each postion will get a newly generated random number
            nums2[i] = (int)(Math.random() * 10 + 1);
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        //ask the user for how many items to add to their shopping cart,
        //then ask for each item and place it into an array
        Scanner s = new Scanner(System.in);
        System.out.println("how many items to add?");
        int numItems = s.nextInt();
        s.nextLine();
        String [] cart = new String[numItems];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("what the thing is?");
            cart[i] = s.nextLine();
        }

        System.out.println("your cart:");
        for (int i = 0; i < cart.length; i++) {
            System.out.println(i + " - " + cart[i]);
        }

        //prompt the user for the index of the item they want
        //printed and keep going until they enter -1
        System.out.println("enter the index of the item you want"
         + " or enter -1 to stop");
        int index = s.nextInt();
        while(index != -1) {
            if ( index >= 0 && index < cart.length)
                System.out.println(cart[index]);
            else
               System.out.println("invalid index");

            System.out.println("enter the index of the item you want"
                    + " or enter -1 to stop");
            index = s.nextInt();
        }

    }
}
