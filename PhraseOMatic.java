public class PhraseOMatic {
    public static void main (String[] args) {

        //  make three sets of words to choose from. Add your own!
        String[] wordListOne = {"stupid", "fucking", "dumbass", "dumb", "dumbfounded"};

        String[] wordListTwo = {"retarded", "pile of", "stack of", "piece of"};

        String[] wordListThree = {"garbage", "shit", "asshole", "dickhead", "assmunch",
        "fuckface", "cunt", "fucker", "pussy", "assface", "cocksucker", "faggot",
        "dickface", "disappointment", "abomination", "tard", "fucktard", "retard"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
