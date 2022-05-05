package B;

class Main {
    public static void main(String args[]) {

        // The object "person" must have its class name "Person" in front of it.
        // The order in which the parameters of the class constructor "Person" are given in this instance
        // is wrong. The right order is the person's name, age and then height.
        Person person = new Person("Maxi Musterperson", 42, 176);

        // The method "println" should have System.out. infront of it.
        // The string "is" should be written inside quotes "".
        // heigth is a typo. Should be height
        System.out.println(person.name + " is " + person.height + " cm tall.");
    } // There should be a closing curly bracket "}" instead of a regular bracket ")".
}