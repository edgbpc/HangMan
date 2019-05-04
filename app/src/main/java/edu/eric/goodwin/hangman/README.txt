Main Page - Title Screen1.

User is presented with a “Title” screen to start the game
1. start button to start the game - DONE
2. A Large title for the game, possibly a graphic if you can make one - DONE but with text
3. A drawn image of “hangman” - DONE

Game Page
1. User is presented with the keyboard and blank spaces where the letters will go for the phrase
(this cannot be a single word for the round)  - DONE
2. When a phrase is given, the words should be spaced out so that it does not look like one long word. - DONE
3. When the user selects an incorrect letter, a body part is drawn - DONE
4. sed letters are displayed on the screen - DONE VIA GREYED OUT SELECTED BUTTONS ON KEYBOARD
5. If the hangman is completed, the user loses the game and is presented with an opportunity to play again.
        - DONE via TOASTS.  NEW GAME BUTTON BECOMES ACTIVE
    1.The phrase should be filled out in the blanks if the user did not complete the phrase within the allowed
    number of attempts  - DONE
    2.There needs to be some indication that the user failed.  - DONE via TOASTS.  NEW GAME BUTTON BECOMES ACTIVE
6.The user should be taken back to the Main Page when the game is over if they choose not to play again. - ????
    1. If the user chooses to play again, you should immediately take them into the game and not back to the Main Page.
    -- THE NEW GAME BUTTON DOES THIS
7.The user is allowed to end the game at any point and be taken back to the Main Page
    1.If a user chooses to do this they need to be “chicken tested” aka: “Are you sure you want to quit?” - DONE
    2.They should not be taken back until they answer the “Chicken Test" - DONE


Notifications --- NOT DONE
1.You must implement local notifications.
2.Setup a local notification that can be generated within 1 minute (5 if the system does not allow) of closing the application.
3.Create a message in this to “convince” the user they should return to your app.
Additional Requirements
4.The stick figure hangman needs to be drawn with either a Canvas/View, or with drawables. NO PREDEFINED IMAGES!! - DONE
5.Orientation is not necessary. However, if it is not supported, it must be locked (can be portrait or landscape locked) - DONE
6.Good MVC design patterns of course  - I HOPE DONE
7. The app should not continue to add to the View Stack (I should only be able to hit back twice to completely close this app) - I GUESS?
8.Your “phrase bank” must have at least 10 phrases - DONE