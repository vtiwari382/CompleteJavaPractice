package DataTypes;

public class DataTypesExample {

	double d = 89765439.98;        // sequence is : double>float>long>int>short>byte>char>boolean
	float f = 9878.923f;
	long l = 1111111111111111111L;
	int i = 1111111111;
	short s;
	byte by;
	char c = 'A';
	boolean b;
	
	
	
	double  doubledefaultvalue;
	float   floatdefaultvalue;
	long    longdefaultvalue;
	int     intdefaultvalue;
	short   shortdefaultvalue;
	byte    bytedefaultvalue;
	char    chardefaultvalue;
	boolean booleandefaultvalue;
	
	public static void main(String[] args) {
		                                              // to print the assigned value of data type
		DataTypesExample obj = new DataTypesExample();
		System.out.println("double value is:- " +obj.d);
		System.out.println("float value is:- " +obj.f);
		System.out.println("long value is:- " +obj.l);
		System.out.println("int value is:-" +obj.i);
		System.out.println("char value is:- " +obj.c);
		System.out.println("-------------------------------");
		
		 // to print the default value of each data type
		
		System.out.println("double default value is:-" +obj.doubledefaultvalue);
		System.out.println("float default value is:- " +obj.floatdefaultvalue);
		System.out.println("long deafult value is:- " + obj.longdefaultvalue);
		System.out.println("int default value is:- " +obj.intdefaultvalue);
		System.out.println("short default value is:- " +obj.shortdefaultvalue);
		System.out.println("byte default value is:- " +obj.bytedefaultvalue);
		System.out.println("char default value is:- " +obj.chardefaultvalue);
		System.out.println("boolean default value is:- " +obj.booleandefaultvalue);
		System.out.println("-------------------------------");
		
		// To print the default size of each data type
		
		System.out.println("double default size is:-" +Double.SIZE);
		System.out.println("float default size is:- " +Float.SIZE);
		System.out.println("long deafult size is:- "  +Long.SIZE);
		System.out.println("int default size is:- "   +Integer.SIZE);
		System.out.println("short default size is:- " +Short.SIZE);
		System.out.println("byte default size is:- "  +Byte.SIZE);
		System.out.println("char default size is:- "  +Character.SIZE);
		System.out.println("-----------------------------------------");
		
		// To Print Minimum Value and maximum value of data type
		
		System.out.println("double Max value is:-" +Double.MAX_VALUE);
		System.out.println("double min value is:-" +Double.MIN_VALUE);
		
		System.out.println("float Max value is:- " +Float.MAX_VALUE);
		System.out.println("float Min value is:- " +Float.MIN_VALUE);
		
		System.out.println("long Max value is:- "  +Long.MAX_VALUE);
		System.out.println("long Min value is:- "  +Long.MIN_VALUE);
		
		System.out.println("int Max value is:- "   +Integer.MAX_VALUE);
		System.out.println("int Min value is:- "   +Integer.MIN_VALUE);
		
		System.out.println("short Max value is:- " +Short.MAX_VALUE);
		System.out.println("short Min value is:- " +Short.MIN_VALUE);
		
		System.out.println("byte Max value is:- "  +Byte.MAX_VALUE);
		System.out.println("byte Min value is:- "  +Byte.MIN_VALUE);
		
		System.out.println("char Max value is:- "  +Character.MAX_VALUE);
		System.out.println("char Min value is:- "  +Character.MIN_VALUE);
		
		System.out.println("-----------------------------------------");
		

	}

}
