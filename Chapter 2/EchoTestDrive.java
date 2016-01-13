public class EchoTestDrive {
    public static void main(String [] args) {
        // create objects
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        
        // declare an integer variable 'x' and give it the value 0
        int x = 0;

        // loop while 'x' is less than 4
        while ( x < 4 ) {
            e1.hello();
            // add 1 to the value of the "count" variabe in the "e1" object
            e1.count = e1.count + 1;
            // if 'x' is equal to 3, do this
            if ( x == 3 ) {
                // add 1 to the value of the "count" variable in the "e2" object
                e2.count = e2.count + 1;
            }
            // if 'x' is greater than 0, do this
            if ( x > 0 ) {
                // add the values of the "count" variables in objects "e1" and "e2"
                // and set that as the new value of the "e2" object
                e2.count = e2.count + e1.count;
            }
            // add 1 to the value of 'x'
            x = x + 1;
        }
        // print the value of the "count" variable of the "e2" object 
        System.out.println(e2.count);
    }
}

class Echo {

    // declare an integer variable named "count" and give it the value 0
    int count = 0;
    // create a method named "hello" and do this
    void hello() {
        System.out.println("helloooo... ");
    }
}
