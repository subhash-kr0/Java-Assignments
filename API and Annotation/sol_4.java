// We can use enum to define a group of named constants.

// Enums are used to represent a collection of related constants that have a common purpose. Each constant in an 
// enum is an instance of the enum type, and they are typically defined as public static final fields.

// Here's an example of how to define an enum in Java:


// Here we define an enum called "DayOfWeek" that represents the days of the week. The enum has seven 
// constants, each representing a day of the week. The constants are defined in all uppercase letters by convention.

//Example

class sol_4{

public enum DayOfWeek {

    MONDAY,

    TUESDAY,

    WEDNESDAY,

    THURSDAY,

    FRIDAY,

    SATURDAY,

    SUNDAY

}

public static void main(String args[]){

	for(DayOfWeek d:DayOfWeek.values())

		System.out.println(d);

	}

}