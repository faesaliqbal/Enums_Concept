package package1;

	/*
	 * An enum is a special type used to define collections of constants.
	 * values in enum are comma separated.
	 * Basically, enums define variables that represent members of a fixed set.
	 * You can refer to the constants in the enum with the dot syntax.
	 * Days day = Days.Monday;
	 * You should always use enums when a variable (specially a method parameter) can only take one out of a small set of possible values.
	 * If you use enums instead of integers or string, you increase compile-time checking and avoid errors from passing in invalid constants, and you document which values are legal to use.
	 * Some sample enum uses include month names, days of the week, deck of cards etc.
	 */

public enum Days {
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday,
	Sunday
}
