package JavaBasics;



public class ReservedWords {

	private enum month {

		JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;

	};

	// Java has 53 reserved words :  50 keywords(associated functionality) and 3 reserved literals(Only value)

	// 3 Literals :  true, false and null

	// In 50 reserved words: Used keywords are 48 and unsused(2) :  goto and const



	// Keywords for Data Types: byte, short,int,long,float,double,boolean,char = 8

	// Keywords for flow control: If, else, switch: case,default, while, do, for, break, continue, return = 11

	// Keywords for Modifiers: public, private, protected, static, final,abstract,synchronized,native,strictfp, transient,volatile = 11

	// Keywords for Exception Handling : try,catch,finally,throw,throws, assert = 6

	// Keywords Class related : class,interface,extents,implements,package,import = 6

	// Keywords Object related: new instanceof,super,this = 4

	// Keywords for Return type: void // In Java return type is mandatory

	// Unused : goto: Usage of goto created problems so it is not used,  and const: use final instead // compile time errors

	// Reserved literals: true false and null -null is the default value for object reference

	// enum : Group of named constants



	// Conclusion:

	// All 53 Reserved words must always contain smaller case alphabets

	// delete keyword is not a part o Java because destruction of useless objects is the responsibility of Garbage collector

	// strictfp , assert and enum are relatively new keywords in Java



	// Common mistakes to avoid:

	// strictfp not strictFp

	//instaceof not instanceOd

	// synchronized not synchronize

	// extends not extent

	// implements not implement

	// String is name of predefined class not a reserved word





	public static void main(String args[]) {

		ReservedWords r = new ReservedWords();



		byte a = 1;

		short sh = 2;

		String s = "OCT";

		if (sh == 2) {

			System.out.println(a);

		} else {

//			System.out.println(enum[0]);

		}

	}





}
