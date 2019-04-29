package edu.eric.goodwin.hangman

class HangManModel {

    private var selectedPhrase:String = ""

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
    private var usedCharacters = ArrayList<Char>()

    private var currentBodyParts = 0;

    private fun selectPhrase(){
        val randomNumber = (0..10).random()
        selectedPhrase = phrases[randomNumber]
    }

    private fun addToUsedCharacterArray(character: Char){
        usedCharacters.add(character)
    }

    private fun checkCharacter(character: Char): Boolean{
        return selectedPhrase.contains(character, true)
    }

    private fun getLengthOfPhrase(): Int{
        return selectedPhrase.length
    }

}