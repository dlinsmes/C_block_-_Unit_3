public class ArrayPractice {

    public static void main(String [] args) {
        //redo the million die roll problem,
        // but now use an array to track the results
        //-after the million rolls, print the
        //total of each result

        int [] rolls = new int [6];

        for (int i = 0; i < 1000000; i++) {
            //don't need to add 1 because we can use die
            //as an index for the array [0, 5]
            int die = (int)(Math.random() * 6);
            rolls[die]++;
        }

        for (int i = 0; i < rolls.length; i++)
            System.out.println((i+1) + "s: " + rolls[i]);

        System.out.println();

        int [] nums = {5, 4, 10, 2, 8, 1, 3, 9};

        //enhanced for loop aka for-each loop
        //-iterate through each value in an array sequentially
        //-don't want to use when you need the index
        // number of a value
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //can't use for-each loops to assign/change values
        for (int num: nums)
            num = 0;

        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        //swap the elements at index 0 and index 3

        //nums[3] = nums[0];
        //nums[0] = nums[3];
        //won't work because we need to save the old value
        //at index 3

        int temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        for (int num: nums)
            System.out.print(num + " ");
        System.out.println();
        System.out.println();

        //sorting algorithms - selection sort
        //moving from left to right, build the sorted section
        //on the left by finding the smallest value in the
        //unsorted section (on right). Once that smallest value
        //is found, swap it into position at the next place in
        //the sorted section

        //i is the index that we want to swap the next
        //smallest value to
        for (int i = 0; i < nums.length; i++) {

            //track the index of the next smallest value
            // so you can swap later
            int nextSmallestI = i;

            //look at all positions after i for a value
            //that's smaller than the one at nextSmallestI
            //-if a smaller value is found, update nextSmallestI
            for (int j = i+1; j < nums.length; j++) {

                if (nums[j] < nums[nextSmallestI]) {
                    nextSmallestI = j;
                }

            }

            //after the j loop, nextSmallestI will be the index
            //to swap with i

            int swap = nums[nextSmallestI];
            nums[nextSmallestI] = nums[i];
            nums[i] = swap;

            for (int num: nums)
                System.out.print(num + " ");
            System.out.println();

        }

        //use arrays to print a deck of cards
        //print each individual card combo on its own line
        String [] suits = {"spades", "diamonds", "hearts", "clubs"};
        String [] ranks = {"ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "jack", "queen", "king"};

        for (String suit: suits) {
            for (String rank: ranks) {
                System.out.println(rank + " of " + suit);
            }
        }

        for (int i = 0; i < suits.length; i++)
            for (int j = 0; j < ranks.length; j++)
                System.out.println(ranks[j] + " of " + suits[i]);

        //pick a random card from the deck
        int rankI = (int)(Math.random() * 13);
        int suitI = (int)(Math.random() * 4);
        System.out.println("you drew the " + ranks[rankI] + " of " + suits[suitI] );
    }

}
