// Chapter 1 - Sharpen Your Pencil
// Guess what each line of code is doing in a comment

// declare an integer variable named 'size' and give it the value 27
int size = 27;
// declare a string variable named 'name' and give it the value 'Fido'
String name = "Fido";
//
Dog myDog = new Dog(name, size);
// declare a variable 'x' and give it the value of the 'size' variable subtracted
// by 5
x = size - 5;
// sets the conditional that if the variable 'x' is less than 15 under the 'myDog'
// class calling the 'bark' method with a parameter of 8, execute below
if (x < 15) myDog.bark(8);

//
while (x > 3) {
    // calls the 'play' method in the 'myDog' class
    myDog.play();
// end block
}

// gives the integers '2,4,6,8' in a new array named 'numList'
int [] numList = {2,4,6,8};
// prints the string "Hello"
System.out.print("Hello");
// prints the string "Dog:" concatenated with the 'name' variable
System.out.print("Dog: " + name);
// declares a string variable named 'num' and give it the value "8"
String num = "8";
// declares an integer variable named 'z' and calls the 'parseInt' method with a
// parameter 'num' in the 'Integer' class
int z = Integer.parseInt(num);

//
try {
    //
    readTheFile("myFile.txt");
// end block
}
//
catch(FileNotFoundException ex) {
    //
    System.out.print("File not found.");
// end block
}
