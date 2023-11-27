A simple keyboard character generator app made in core Java with IntelliJ IDEA Community edition. 

The purpose of this app is to generate random symbols based on the length input by the user.

The app is made of four classes - Constants, Generator, UserInterface and Main. The Generator class relies heavily on Constants class, making it tightly coupled. However, the values in Constants class are final, i.e immutable.
