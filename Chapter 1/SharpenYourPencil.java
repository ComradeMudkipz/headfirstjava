// Chapter 1 - Sharpen Your Pencil
// Guess what each line of code is doing in a comment

// declare an integer variable named 'size' and give it the value 27
int size = 27;
// declare a string of characters variable named 'name' and give it the value "Fido"
String name = "Fido";
// declare a new Dog variable 'myDog' and make the new Dog using 'name' and 'size'
Dog myDog = new Dog(name, size);
// subtract 5 from 27 (value of 'size') and assign it to a variable named 'x'
x = size - 5;
// if x (value of 22) is less than 15, tell the dog to bark 8 times
if (x < 15) myDog.bark(8);

// keep looping as long as x is greater than 3
while (x > 3) {
    // tell the dog to play (whatever THAT means to a dog...)
    myDog.play();
// this looks like the end of the loop -- everything in {} is done in the loop
}

// declare a list of integers variable 'numList', and put 2,4,6,8 into the list
int [] numList = {2,4,6,8};
// print out "Hello"... probably at the command-line
System.out.print("Hello");
// print out "Hello Fido" (the value of 'name' is "Fido") at the command-line
System.out.print("Dog: " + name);
// declare a character string variable 'num' and give it the value of "8"
String num = "8";
// convert the string of characters "8' into an actual numeric value 8
int z = Integer.parseInt(num);

// try to do something... maybe the thing we're trying isn't guaranteed to work...
try {
    // read the text file named "myFile.txt" (or at least TRY to read the file...)
    readTheFile("myFile.txt");
// must be the end of the "things to try", so I guess you could try many things...
}
// this must be where you find out if the thing you tried didn't work...
catch(FileNotFoundException ex) {
    // if the thing we tried failed, print "File not found" out at the command-line
    System.out.print("File not found.");
// looks like everything in the {} is what to do if the 'try' didn't work...
}
