I feel like I meet all the requirements of this assignment but I did want to give a walkthrough of what happens

When the app loads, the main activity layout has containers that holds the custom view for the hangman image and a
container that essentially the playing field.  There is also a Start button that goes invisible when pressed.

When the start button is pressed, the fragment container holds the the custom keyboard as well as the text view that
shows the phrase as its guessed.  The keyboard sends the letter to the model, the model processes it and updates the
the view.

Using the back button seemed to be what I have the most uncertainty if its what you wanted.

I override the back button function and if its on the "start" screen then you can exit fully from the app but if its on
the game play screen, you cannot.

For notifications, i call the create notification via onStop() so I think that starts the clock when the app ends.
Seems to function correctly when the back button or a force close.    I do have a bug if someone goes right back into
the game before the notification displays, they can get the notification.  I tried a few different ways to have
the notification cancel but none worked.

I was trying to use suggestions from https://stackoverflow.com/questions/2665634/how-to-clear-a-notification-in-android

I could not solve the notificaiton issue and turning in as is.





