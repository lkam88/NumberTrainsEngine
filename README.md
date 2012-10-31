This project is a game based off the popular mobile game Trainyard Express
created by Matt Rix (http://itunes.apple.com/us/app/trainyard-express/id348724199?mt=8).


This was an assignment for one my undergraduate classes at UCI entitled Software Design.  I took 
the class back in Janurary of 2011 and the project has always kind of stuck with me.  So, I have
decided to re-implement the game with a slight variation.  Instead of making a game, I will be
focusing on the "engine" of the game with the idea that the "engine" contains just the bussines
logic of the game and can be "dropped" into any sort of Java implementation (like an Android app).
Thus, no framework or libraries (besides the Java api) will be used.  Everything will be pure Java.
The engine will provide a service layer that will allow an application to create the game, run
the game and receive event messages to update the application's UI.

Of course the engine will need some sort of implementation to run the engine.  So, included will
be a command line interface that will allow the player to load a level from file, run the game
and receive textual output that describe events as they happen.