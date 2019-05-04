package edu.eric.goodwin.hangman

class HangManModel {

    //region private variables

    private var selectedPhrase:String = ""
    var guess: Boolean = false
    var numIncorrectGuesses = 0
    private var maxGuesses = 6
    var numCharactersInPhrase: Int = 0
    var numCorrectGuesses: Int = 0
    var gameWon: Boolean = false
    var gameLost: Boolean = false

    private var phrases = arrayOf(
        "bury the hatchet",
        "eat like a pig",
        "at odds",
        "read my lips",
        "smarty pants",
        "in your dreams",
        "puppy love",
        "chew the fat",
        "peanut gallery",
        "in a pickle"
    )
    private var correctCharacters = ArrayList<Char>()

    //endregion

    //region public variables
    var obfuscatedPhrase: String = ""
    //endregion


    //region Debug Functions.  Disable in release!
    fun showPhrase(): String{
        return selectedPhrase
    }

    //endregion

    //region public functions

    fun selectPhrase(){
        val randomNumber = (0..9).random()
        selectedPhrase = phrases[randomNumber]
        obfuscatePhrase()
    }

    fun checkCharacter(character: Char){
        if (selectedPhrase.contains(character, true)){
            guess = true
            numCorrectGuesses++
            correctCharacters.add(character)

        } else {
            guess = false
            numIncorrectGuesses++
        }
    }

    fun createDisplayWordAndReturn(): String{
        var displayWord = ""
        selectedPhrase.forEach {
            if (it.isWhitespace()) {
                displayWord += "   "
            } else if (correctCharacters.contains(it)){
                    displayWord += it + "  "
            }
            else {
                displayWord += "_  "
            }
        }

        if (!displayWord.contains("_")){
            gameWon = true
        }

        return displayWord

    }

    //endregion

    //region private functions

    private fun getLengthOfPhrase(): Int{
        return selectedPhrase.length
    }

    private fun obfuscatePhrase(){
        selectedPhrase.forEach {
            if (it.isWhitespace()){
                obfuscatedPhrase += "   "
            } else {
                obfuscatedPhrase += "_  "
            }
        }
    }

    fun countCharactersInPhrase(){
        selectedPhrase.forEach {
            if (!it.isWhitespace()){
                numCharactersInPhrase++
            }
        }
    }

    fun checkLostCondition(){
        if (numIncorrectGuesses == maxGuesses){
            gameLost = true
        }
    }



    //endregion


}