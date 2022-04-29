package A;

class Person {
    // The String class should start with capital letter "S".
    String name;
    // There should be a semicolon at the end of the line "int age".
    int age; // age in years4
    int height; // height in centimeter
    // The data type of method parameter "height" is missing. Should be "int height".
    // The constructor of a class cannot have a return type like "void".
    Person(String name, int age, int height) {
        this.name = name;
        this.age = age;

        // The assignment of the "this.height" to the value "height" should be done with a sing equals sign "=".
        this.height = height;

    }
}