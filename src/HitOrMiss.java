public class HitOrMiss {

    private int [] locationCells = new int[7];

    public int numOfHits = 0;
    private int guesses = 0;

    void setLocationCells(int [] locations){
       for(int i = 0; i<locations.length; i++){
           locationCells[locations[i]] = 1;
       }
    }

    String sunkOrNot(String userGuess){
        guesses++;
        int userGuessIndex = Integer.parseInt(userGuess);
        if(userGuessIndex >= 7 || userGuessIndex < 0){
            return "Invalid location, try again";
        }
        if(locationCells[userGuessIndex] == 1){
            numOfHits++;
            locationCells[userGuessIndex] = 0;
            if(numOfHits == 3){
                return "Killed!" + " It took you " + guesses + " guesses.";
            }
            else{
                return "hit";
            }
        }
        else{
            return "miss";
        }
    }


}
