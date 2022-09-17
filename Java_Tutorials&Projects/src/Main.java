import java.util.Scanner;	// Trong java thì là package còn như trong C là thư viện
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
// util = utility
import javax.swing.JOptionPane;	// Thư viện GUI
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;

import java.util.Random;	// Thư viện tạo hàm Random

import java.util.ArrayList;	// lesson 19

import java.util.*;	// lesson 20

import java.util.List;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.sampled.*;

enum Planet{
	MERCURY(1),
	VENUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	URANUS(7),
	NEPTUNE(8),
	PLUTO(9);
	
	int number;
	
	Planet(int number) {
		this.number = number;
	}
}

public class Main {
	
	//		83------------------------
	//		81 / (-2) new / use this index from here-----
	
	public static <Thing> void displayArray(Thing[] array) {
		
		for(Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}
	
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
	
	//		78------------------------
	
	static void checkAge(int age) throws AgeException{
		if(age < 18) {
			throw new AgeException("\nYou must be 18+ to sign up");
		}
		else {
			System.out.println("You are now signed up!");
		}
	}
	
	//		77------------------------
	
	static void HelloWorld(int n) {
		if(n > 0) {
			System.out.println("Hello World! " + n);
			n--;
			HelloWorld(n);
		}
	}
	
	static void takeAStep(int i, int distance) {
		if(i <  distance) {
			i++;
			System.out.println("*You take a step* :" + i + " meter/s");
			takeAStep(i, distance);
		}
		else System.out.println("You are done walking! :)");
	}
	
	//		75------------------------
	
	static void canILiveHere(Planet myPlanet) {
		switch (myPlanet) {
		case EARTH:
			System.out.println("You can live here :)");
			System.out.println("This is planet #" + myPlanet.number);
			break;
		default:
			System.out.println("You can't live here...yet");
			System.out.println("This is planet #" + myPlanet.number);
			break;
		}
	}

	//		22------------------------
	
	static void hello(String name, int age) {
		System.out.println("Hello " + name + ". You are " + age + " years old");
	}
	
	static int add(int x, int y) {
		return x + y;
	}
	
	static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	static double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
		//	1-------------------------
		
		System.out.print("I love Pizza\n");
		System.out.println("\\Hello World\\");	//	println = print + \n
		System.out.println("\"It's great\"\n");
		System.out.println("***\tGood night\t***");
		
		//	2-------------------------
		
		int x = 123;
		long y = 17246821937104296L;	//	Kiểu long phải thêm L ở cuối
		boolean z = true;
		char symbol = '@';
		String name = "Ngọc Anh";
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("symbol = " + symbol);	//	Ctrl + Space for auto-complete
		System.out.println("name = " + name);
		System.out.println((char)97);
		System.out.println((char)65);
		System.out.println((float)'x');
		
		// Tạo ra đối tượng sc thuộc lớp Scanner để nhập dữ liệu
		/*
		Scanner sc = new Scanner(System.in);
		String namee = sc.next();
		String space = sc.nextLine();
		System.out.println("Hello " + namee);	//	namee không được có dấu cách
		System.out.println(space);
		*/
		
		//	3-------------------------
		
		int a = 123, b = 321, temp;
		System.out.println("a = " + a + "\nb = " + b + "\n---After swap---");
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + "\nb = " + b);
		
		//		4-------------------------
		
		/*	Hiển thị kí tự kế tiếp
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		System.out.println(sc.next().charAt(0));	// vừa là lệnh đọc vừa là lệnh in ra, muốn đúng chỉ cần bỏ dòng này đi là được
		System.out.println((char)((int)c + 1));		// note lại để nhớ
		//char c = (char)(sc.next().charAt(0) + 1);
		//System.out.println(c);
		 */
		
		/*Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("What is your name? ");
		  String name2 = scanner.nextLine();
		  
		  System.out.println("How old are you? ");
		  int age = scanner.nextInt();
		  scanner.nextLine();
		  
		  System.out.println("What is your favorite food?");
		  String food = scanner.nextLine();
		  //	String food = scanner.next();	có thể dùng dòng này để thay dòng trên và dòng scanner.nextLine();
		   
		  System.out.println("Hello " + name2);
		  System.out.println("You are " + age + " years old");
		  System.out.println("You like " + food);
		  
		scanner.close();*/
		
		//		5-------------------------
		
		int friends = 10;
		friends++;
		friends *= 2;
		friends--;
		friends /= 3 ;
		System.out.println(friends);
		
		
		//		6-------------------------

		// 6 is on Lesson6.java
		
		//		7-------------------------
		
		double d = 3.14;
		double e = -10;
		
		double f = Math.max(d, e);
		System.out.println(f);
		
		System.out.println(Math.sqrt(Math.abs(e)));	// sqrt: căn 2
		
		System.out.println(Math.round(d)); // làm tròn
		System.out.println(Math.round(3.96));
		
		System.out.println(Math.ceil(d)); // đưa ra số int nhỏ nhất mà lớn hơn số này
		
		System.out.println(Math.floor(d)); // đưa ra số int lớn nhất mà nhỏ hơn số này
		
		//		8-------------------------
		
		Random random = new Random();
		
		int r1 = random.nextInt(6) + 1;
		System.out.println("Mặt xúc sắc mới: " + r1);
		
		double r2 = random.nextDouble();
		System.out.println("Random double value: " + r2);
		
		boolean r3 = random.nextBoolean();
		System.out.println("Random Boolean value: " + r3);
		
		//		9-------------------------
		
		int age = random.nextInt(100) + 1;
		if (age >= 18) {
			System.out.println("You are an adult because you are " + age + " years old!");
		}
		else if (age > 12 && age <= 18) {
			System.out.println("You are a teenager because you are " + age + " years old!");
		}
		else {
			System.out.println("You are not an adult because you are " + age + " years old!");
		}
		
		//		10------------------------
		
		String day = "Monday";
		
		switch (day) {
			case "Sunday": System.out.println("It's Sunday");
							break;
			case "Monday": System.out.println("It's Monday");
							break;
			case "Tuesday": System.out.println("It's Tuesday");
							break;
			case "Wednesday": System.out.println("It's Wednesday");
							break;
			case "Thursday": System.out.println("It's Thursday");
							break;
			case "Friday": System.out.println("It's Friday");
							break;
			case "Saturday": System.out.println("It's Saturday");
							break;
			default: System.out.println("Please type gain correctly!");
		}
		
		//		11------------------------
		//		&&	||	!
		int temperature = 30;
		
		if (temperature > 30) System.out.println("It's hot outside bescause the temperature is " + temperature + " degree Celcius");
		else if (temperature >= 20 && temperature <= 30) System.out.println("It's warm outside bescause the temperature is " + temperature + " degree Celcius");
		else System.out.println("It's cold outside bescause the temperature is " + temperature + " degree Celcius");
		
		//------------------------------------------
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing the game!\nPress q or Q to quit the game!");
		String response = scanner.next();
		
		if (!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still in the game!");
		} else {
			System.out.println("You successfully quit the game!");
		}
		
		//		12------------------------
		
		String string = "";
		
		while (string.isBlank()) {
			System.out.print("Enter your name: ");
			scanner.nextLine();
			string = scanner.nextLine();
		}
		
		System.out.println("Hello " + string);
		
		//		13------------------------
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("Happy new year!");
		
		//		14------------------------
		
		int rows, columns;
		
		String symbol2 = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol2 = scanner.next();
		
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol2);
			}
		}
		System.out.println();
		
		//		15------------------------
		
		//String[] cars = new String[];
		String[] cars = {"Camaro", "Convette", "Tesla", "123"};
		
		cars[0] = "Mustang";
		
		int k = 0;
		while (1==1) {	
			System.out.print(cars[k]);
			if(k == cars.length - 1) break;
			System.out.print(", ");
			k++;
		}
		
		System.out.println();
		
		//		16------------------------
		
		String[][] car_type = new String[3][3];
		
		car_type[0][0] = "Camaro";
		car_type[0][1] = "Convette";
		car_type[0][2] = "Silverado";
		car_type[1][0] = "Mustang";
		car_type[1][1] = "Ranger";
		car_type[1][2] = "F1-150";
		car_type[2][0] = "Ferrari";
		car_type[2][1] = "Lambo";
		car_type[2][2] = "Tesla";
		
		for(int i = 0; i < car_type.length; i++) {
			System.out.println();
			for(int j = 0; j < car_type[i].length; j++) {
				System.out.print(car_type[i][j] + " ");
			}
		}
		System.out.println();
		
		//		17------------------------
		
		//name = "Bro";
		
		//boolean result = name.equalsIgnoreCase("bro");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("o");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();
		//String result = name.replace('o', 'a');
		//System.out.println(result);
		
		//		18------------------------
		
		Boolean wrapper_a = true;
		Character wrapper_b = '@';
		Integer wrapper_c = 123;
		Double wrapper_d = 3.14;
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		//		19------------------------
		
		ArrayList<String> food = new ArrayList<String>(); //Specialized List
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		food.remove(2);
		food.clear();
		
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println(food);
		
		//		20------------------------
		
		ArrayList<String> bakeryList = new ArrayList();	//Object Lists
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		System.out.println(bakeryList);
		System.out.println(bakeryList.get(2));
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));
		
		//		21------------------------
		
		//String[] animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for (String i : animals) {
			System.out.println(i);
		}
		
		//		22 + 23------------------------
		
		hello(name, 20);
		System.out.println(add(4, 5));
		System.out.println(add(3.14, 5));
		
		//		24------------------------
		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
		
		System.out.printf("This is a format string %d\n", 123);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bé Na";
		int myInt = 50;
		double myDouble = 1000;
		
		System.out.printf("%b\n", myBoolean);
		System.out.printf("%c\n", myChar);
		System.out.printf("%10s\n", myString);
		System.out.printf("%-10s\n", myString);
		System.out.printf("%d\n", myInt);
		System.out.printf("%.2f\n", myDouble);
		System.out.printf("%,f\n", myDouble);
		System.out.printf("%020f\n", myDouble);
		System.out.printf("%+f\n", myDouble);
		System.out.printf("%-20f\n", myDouble);
		
		//		25------------------------
		
		final double PI = 3.141519;
		
		System.out.println(PI);
		
		//		26------------------------
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		
		myCar1.drive();
		myCar1.brake();
		
		//		27------------------------
		
		Human human1 = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty", 16, 50);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human2.eat();
		human1.drink();
		
		//		28------------------------
		
		DiceRoller diceRoller = new DiceRoller();
		
		//		29------------------------
		
		Pizza pizza = new Pizza("thicc crust", "tomato"/*, "mozzerella", "pepperoni"*/);
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		//		30------------------------
		
		AuCar aucar = new AuCar();
		
		System.out.println(aucar.toString());
		System.out.println(aucar); // Implicitly = ngầm hiểu phải dùng toString()
		
		//		31------------------------
		
		//int[] numbers = new int[3];
		//char[] characters = new char[4];
		//String[] strings = new String[5];
		
		//Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
		Food[] refrigerator = {food1, food2, food3};
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
		//		32------------------------
		
		Garage garage = new Garage();
		
		CarType carType1 = new CarType("BMW");
		CarType carType2 = new CarType("Tesla");
		
		garage.park(carType1);
		garage.park(carType2);
		
		//		33------------------------
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
		System.out.println(Friend.numberOfFriends);
		System.out.println(friend1.numberOfFriends); //Nên dùng tên class thay vì tên biến
		
		Friend.displayFriends();
		
		//		34------------------------
		
		CarInfo carInfo = new CarInfo();
		carInfo.go();
		
		Bicycle bicycle = new Bicycle();
		bicycle.stop();
		
		System.out.println("carInfo.speed = " + carInfo.speed);
		System.out.println("bicycle.speed = " + bicycle.speed);
		
		System.out.println("carInfo.doors = " + carInfo.doors);
		System.out.println("bicycle.pedals = " + bicycle.pedals);
		
		//		35------------------------
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.speak();
		dog.speak();
		
		//		36------------------------
		
		Hero hero1 = new Hero("Batman", 42, "$$$");
		Hero hero2 = new Hero("Superman", 43, "everything");
		
		System.out.println(hero2.toString());
		
		//		37------------------------
		
		//AbsVehicle absVehicle = new AbsVehicle();
		AbsCar absCar = new AbsCar();
		absCar.go();
		
		// 1. Can an abstract class have a normal (non-abstract) method?
		// 1. An abstract class will need static methods since we cannot create an instance of an abstract class / abstract class can hove normal method
		// 2. Can a normal class have an abstract function?
		// 2. A normal class cannot have abstract methods
		
		//		38------------------------
		
		//					Access Level
		// Modifier		| Class | Package | Subclass | World
		//---------------------------------------------------
		// public		|Y		|Y		  |Y		 |Y
		// protected	|Y		|Y		  |Y		 |N
		// no modifier	|Y		|Y		  |N		 |N
		// private		|Y		|N		  |N		 |N
		
		/*
		public: visible in all classes in all packages
		protected: visible to all classes in the same package or classes in other packages that are a subclass
		default: visible to all classes in the same package 
		private: visible only in the same class
		*/
		
		//		39------------------------
		
		EncapCar encapCar = new EncapCar("Chervolet", "Camaro", 2021);
		encapCar.setYear(2022);
		
		System.out.println(encapCar.getMake() + "\n" + encapCar.getModel() + "\n" + encapCar.getYear());
		
		//		40------------------------
		//		Reused 39
		
		EncapCar encapCar1 = new EncapCar("Chevrolet","Camaro",2021);
		EncapCar encapCar2 = new EncapCar("Ford","Mustang",2022);
		EncapCar encapCar3 = new EncapCar(encapCar1);
		
		// encapCar2 = encapCar1; // Lệnh này copy địa chỉ encapCar1 và cho bằng encapCar2
		
		encapCar2.copy(encapCar1);
		
		System.out.println(encapCar1);	// print địa chỉ của encapCar1
		System.out.println(encapCar2);	// print địa chỉ của encapCar2
		System.out.println(encapCar3);	// print địa chỉ của encapCar3
		System.out.println();
		System.out.println(encapCar1.getMake());
		System.out.println(encapCar1.getModel());
		System.out.println(encapCar1.getYear());
		System.out.println();
		System.out.println(encapCar2.getMake());
		System.out.println(encapCar2.getModel());
		System.out.println(encapCar2.getYear());
		System.out.println();
		System.out.println(encapCar3.getMake());
		System.out.println(encapCar3.getModel());
		System.out.println(encapCar3.getYear());
		
		//		41------------------------
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
		
		//		42------------------------
		
		PolyCar polyCar = new PolyCar();
		PolyBicycle polyBicycle = new PolyBicycle();
		PolyBoat polyBoat = new PolyBoat();
		
		PolyVehicle[] racers = {polyCar, polyBicycle, polyBoat}; // Có thể để kiểu là Object[] vì Object là kiểu của tất cả các kiểu (kiểu lớn nhất)
		
		//polyCar.go();
		//polyBicycle.go();
		//polyBoat.go();
		
		for(PolyVehicle xx : racers) {	// để tên biến chạy là x thì bị trùng vs 1 thằng đã tạo ở trên (Không nhớ rõ ở đâu)
			xx.go();					// code này tương đương 3 cmt code trên
		}
		
		//		43------------------------
		
		Scanner scanner1 = new Scanner(System.in);
		DPAnimal dpAnimal;
		
		System.out.println("What animal do you want?");
		System.out.print("(1=dog) or (2=cat): ");
		int choice = scanner1.nextInt();
		
		if(choice == 1) {
			dpAnimal = new DPDog();
			dpAnimal.speak();
		}
		else if(choice == 2) {
			dpAnimal = new DPCat();
			dpAnimal.speak();
		}
		else {
			dpAnimal = new DPAnimal();
			System.out.println("That choice was invalid");
			dpAnimal.speak();
		}
		System.out.println();
		//scanner1.close();
		
		//		44------------------------
		
		try {
			System.out.print("Enter a whole number to divide: ");
			int X = scanner1.nextInt();
		
			System.out.print("Enter a whole number to divide by: ");
			int Y = scanner1.nextInt();
		
			int Z = X/Y;
			System.out.println("Result: " + Z);
		}
		catch(ArithmeticException E) {
			System.out.println("You can't divide number by 0! IDIOT!");
		}
		catch(InputMismatchException E) {
			System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
		}
		catch(Exception E) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("This will always print");
			//scanner.close();
			//scanner1.close(); // Thằng close nó đóng luôn các thao tác nhập đằng sau -> nên để ở cuối file 
		}
		
		//		45------------------------
		
		//File file = new File("C:/Users/Admin/eclipse-workspace/MyFirstProgram/src/secret_message.txt");
		File file = new File("secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists :D!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("That file doesn't exist :(");
		}
		
		//		46------------------------
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red\nViolets are blue\nBooty booty booty booty\nRockin' everywhere!");
			writer.append("\n(A poem by Nabingx)");
			writer.close();
		}
		catch (IOException E) {
			// TODO Auto-generated catch block
			E.printStackTrace();
		}
		
		//		47------------------------
		
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		}
		catch (FileNotFoundException E) {
			// TODO Auto-generated catch block
			E.printStackTrace();	// print the exception that occurs
		}
		catch (IOException E) {
			// TODO Auto-generated catch block
			E.printStackTrace();
		}
		
		System.out.println("\nHello");
		
		//		48------------------------
		
		/*File wavFile = new File("Campfire - Telecasted.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(wavFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String clipResponse = "";
		
		while(!clipResponse.equals("Q")) {
			System.out.println("\nP = Play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");
			
			clipResponse = scanner1.next();
			clipResponse = clipResponse.toUpperCase();	// đổi hết cả string sang chữ in hoa
			
			long clipPosition;
			
			switch (clipResponse) {
				case "P": clip.start();
				break;
				case "S": clip.stop();
				break;
				case "R": clip.setMicrosecondPosition(0);
				break;
				case "L": clip.loop(clip.LOOP_CONTINUOUSLY);
				break;
				case "Q": clip.close();
				break;
				default: System.out.println("Not a valid response");
			}
		
		}
		
		System.out.println("You closed the clip");*/
		
		//		49------------------------
		
		/*JFrame frame = new JFrame(); // creates a frame
		frame.setTitle("Fate Grand Order"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of application
															  //ấn vào nút x thì tắt hẳn, ko chạy ngầm
											// HIDE_ON_CLOSE - tắt nhưng vẫn chạy ngầm
											// DO_NOTHING_ON_CLOSE - ấn vào x nhưng ko tắt
		frame.setResizable(false); // prevent the frame from being resized
		frame.setSize(420, 420); // sets the x-dimension, y-dimension of the frame in integers
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("FGO_logo.jpg"); // creates an ImageIcon
		frame.setIconImage(image.getImage()); // changes icon of frame
		//frame.getContentPane().setBackground(Color.BLUE); // changes color of background
		//frame.getContentPane().setBackground(new Color(31, 161, 216));
		frame.getContentPane().setBackground(new Color(0x1220a3));*/
		
		//FGOFrame fgoFrame = new FGOFrame();
		
		//		50------------------------
		
		/*ImageIcon image = new ImageIcon("person_coding.jpg");
		Image imageResized = image.getImage(); // transform it 
		Image newimg = imageResized.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		image = new ImageIcon(newimg);  // transform it back
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); // create a label
		label.setText("Bro, do you even code?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 40)); // set font of text
		label.setIconTextGap(5); // set gap of text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical postion of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set vertical postion of icon + text within label
		//label.setBounds(125, 0, 250, 250); // set x, y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500, 500); // chiều rộng, chiều cao
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack(); // dùng lệnh add ở dòng trên trước khi dùng pack - lệnh pack thay thế cho 3 lệnh cmt trên - auto chỉnh kích thước cửa sổ
		*/
		//		51------------------------
		
		/*
		ImageIcon icon = new ImageIcon("thumbsup.png");
		Image imageResized2 = icon.getImage(); // transform it 
		Image newimg = imageResized2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		
		JLabel label2 = new JLabel();
		label2.setText("Hi");
		label2.setIcon(icon);
		label2.setVerticalAlignment(JLabel.BOTTOM);
		label2.setHorizontalAlignment(JLabel.RIGHT);
		label2.setBounds(0, 0, 200, 75); // muốn dùng lệnh này thì phải setLayout của panel sẽ dùng lệnh này là null
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout()); // hoặc null nếu ko muốn có layout nào đc hiển thị
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750); // chiều rộng, chiều cao
		frame.setVisible(true);
		greenPanel.add(label2);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		*/
		
		//		52------------------------
		
		//new MyFrame();
		
		//		53------------------------
		
		/*JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.pink);
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
		//------------sub panel----------------------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.blue);
		
		panel5.setLayout(new BorderLayout());
		
		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.WEST);
		panel5.add(panel9, BorderLayout.EAST);
		panel5.add(panel10, BorderLayout.CENTER);
		
		//------------sub panel----------------------------
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);*/
		
		//		54------------------------
		
		/*JFrame flowFrame = new JFrame();
		flowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flowFrame.setSize(500, 500);
		flowFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel flowPanel = new JPanel();
		flowPanel.setPreferredSize(new Dimension(150, 200));
		flowPanel.setBackground(Color.lightGray);
		flowPanel.setLayout(new FlowLayout());
		
		flowPanel.add(new JButton("1"));
		flowPanel.add(new JButton("2"));
		flowPanel.add(new JButton("3"));
		flowPanel.add(new JButton("4"));
		flowPanel.add(new JButton("5"));
		flowPanel.add(new JButton("6"));
		flowPanel.add(new JButton("7"));
		flowPanel.add(new JButton("8"));
		flowPanel.add(new JButton("9"));
		
		flowFrame.add(flowPanel);
		flowFrame.setVisible(true);*/
		
		//		55------------------------
		
		/*JFrame gridFrame = new JFrame();
		gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridFrame.setSize(500, 500);
		gridFrame.setLayout(new GridLayout(3, 3, 10, 10)); // số hàng, số cột, khoảng cách chiều ngang,khoảng cách chiều dọc (đơn vị pixels)  
		
		gridFrame.add(new JButton("1"));
		gridFrame.add(new JButton("2"));
		gridFrame.add(new JButton("3"));
		gridFrame.add(new JButton("4"));
		gridFrame.add(new JButton("5"));
		gridFrame.add(new JButton("6"));
		gridFrame.add(new JButton("7"));
		gridFrame.add(new JButton("8"));
		gridFrame.add(new JButton("9"));
		gridFrame.add(new JButton("10"));
		
		gridFrame.setVisible(true);*/
		
		//		56------------------------
		
		/*JLabel layerLabel1 = new JLabel();
		layerLabel1.setOpaque(true); // to be able to see the label
		layerLabel1.setBackground(Color.RED);
		layerLabel1.setBounds(50, 50, 200, 200);
		
		JLabel layerLabel2 = new JLabel();
		layerLabel2.setOpaque(true); // to be able to see the label
		layerLabel2.setBackground(Color.GREEN);
		layerLabel2.setBounds(100, 100, 200, 200);
		
		JLabel layerLabel3 = new JLabel();
		layerLabel3.setOpaque(true); // to be able to see the label
		layerLabel3.setBackground(Color.BLUE);
		layerLabel3.setBounds(150, 150, 200, 200);
		
		JLayeredPane layerPane = new JLayeredPane();
		layerPane.setBounds(0, 0, 500, 500);
		
		//layerPane.add(layerLabel1, JLayeredPane.DEFAULT_LAYER);
		//layerPane.add(layerLabel2, JLayeredPane.DEFAULT_LAYER);
		//layerPane.add(layerLabel3, JLayeredPane.DRAG_LAYER);
		
		layerPane.add(layerLabel1, Integer.valueOf(0));
		layerPane.add(layerLabel2, Integer.valueOf(1));
		layerPane.add(layerLabel3, Integer.valueOf(2));
		
		JFrame layerFrame = new JFrame("JLayerFrame");
		layerFrame.add(layerPane);
		layerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layerFrame.setSize(new Dimension(500, 500));
		layerFrame.setLayout(null);
		layerFrame.setVisible(true);*/
		
		//		57------------------------
		
		// In folder "HowToOpenANewWindow"
		
		//		58------------------------
		
		/*final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true); 
		JOptionPane.showMessageDialog(dialog, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Your computer has A VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);
		// Bình thường để chỗ tham số thứ 1 trong hàm showMessageDialog là null nhưng vì JOptionPane ko pop up lên nên phải gọi lên đầu
		
		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		// YES = 0, NO = 1, CANCEL = 2, X = -1
		name = JOptionPane.showInputDialog("What's your name?");
		
		ImageIcon icon = new ImageIcon("thumbsup.png");
		Image imageResized3 = icon.getImage(); // transform it 
		Image newimg = imageResized3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		
		String[] responses = {"No, you're awesome!", "Thank you", "*Blush*"};
		
		JOptionPane.showOptionDialog(
				null, 
				"You're awesome!", 
				"Secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
		*/
		
		//		59------------------------
		
		//MyFrameVer2 frameVer2 = new MyFrameVer2();
		
		//		60------------------------
		
		//new CheckBoxFrame();
		
		//		61------------------------
		
		//new MyFrameVer3();
		
		//		62------------------------
		
		//new ComboBoxFrame();
		
		//		63------------------------
		
		//SliderDemo sliderDemo = new SliderDemo();
		
		//		64------------------------
		
		//ProgressBarDemo demo = new ProgressBarDemo();
		
		//		65------------------------
		
		//new MenuBarFrame();
		
		//		66------------------------
		
		//new SelectFileFrame();
		
		//		67------------------------
		
		//new ColorChooserFrame();
		
		//		68------------------------
		
		//new KeyListenerFrame();
		
		//		69------------------------
		
		//new MouseListenerFrame();
		
		//		70------------------------
		
		//new DragDropFrame();
		
		//		71------------------------
		
		//new Game();
		
		//		72------------------------
		
		//new TwoDGraphicsFrame();
		
		//		73------------------------
		
		//new TwoDAnimationFrame();
		
		//		74------------------------
		
		String myName = "  bro";
		
		//myName = myName.concat(" code      "); // method nối chuỗi
		//myName = myName.toUpperCase();
		//myName = myName.trim();
		
		myName = myName.concat(" code      ").toUpperCase().trim();
		
		System.out.println(myName);
		
		//		75------------------------
		
		Planet myPlanet = Planet.EARTH;
		
		canILiveHere(myPlanet);
		
		//		76------------------------
		
		HashMap<String, String> countries = new HashMap<String, String>();
		
		//add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		
		//countries.remove("USA");
		//System.out.println(countries.get("Russia"));
		//countries.clear();
		//System.out.println(countries.size());
		//countries.replace("USA", "Detroit");
		//System.out.println(countries.containsKey("England"));
		//System.out.println(countries.containsValue("Beijing"));
		//System.out.println(countries);
		
		for(String i : countries.keySet()) {
			System.out.println(i + "\t= " + countries.get(i));
		}
		
		//		77------------------------
		
		HelloWorld(3);
		
		int distance = 5;
		takeAStep(0, distance);
		
		//		78------------------------
		
		int myAge = 17;
		
		try {
			checkAge(myAge);
		}
		catch(Exception e1) {
			System.out.println("A problem occured: " + e1);
		}
		
		//		79------------------------
		
		/*JFrame cardFrame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		//ImageIcon AC = new ImageIcon("PNG-cards-1.3\\2_of_clubs.png");
		//Image imageResized1 = AC.getImage().getScaledInstance(150, 218,  java.awt.Image.SCALE_SMOOTH);   
		//ImageIcon AC = new ImageIcon(new ImageIcon("PNG-cards-1.3\\2_of_clubs.png").getImage().getScaledInstance(150, 225,  java.awt.Image.SCALE_SMOOTH));
		//JLabel ACLabel = new JLabel(new ImageIcon(new ImageIcon("PNG-cards-1.3\\2_of_clubs.png").getImage().getScaledInstance(150, 225,  java.awt.Image.SCALE_SMOOTH)));
		
		for(int i = 0; i < 67; i++) {
			deck.add(new JLabel(new ImageIcon(new ImageIcon("PNG-cards-1.3\\" + i + ".png").getImage().getScaledInstance(100, 146,  java.awt.Image.SCALE_SMOOTH))));
			cardFrame.add(deck.get(i)); // bắt đầu add vào deck từ index 0 
		}
		
		cardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardFrame.setSize(600,600);
		cardFrame.setLayout(new FlowLayout());
		cardFrame.setVisible(true);*/
		
		//		80------------------------
		
		Outside out = new Outside();
		Outside.Inside in = out.new Inside();
		//System.out.println(out.x + in.y);
		in.Greeting();
		
		//		81------------------------
		
		Greeting greeting = new Greeting() {

			@Override
			public void Welcome(){
				System.out.println("Yo bro!");
			}
			
		};
		Greeting greeting2 = new Greeting();
		greeting.Welcome();
		greeting2.Welcome();
		
		//AnoInnerFrame anoInnerFrame = new AnoInnerFrame();
		
		//		82------------------------
		
		/*name = "Bro";
		symbol = '!';
		
		MyInterface myInterface = (X, Y) -> {
			System.out.println("Heeloo World!");
			System.out.println("It is a nice day " + X + Y); // biến x đã tồn tại nên lambda ko redeclare đc
		};
		
		MyInterface myInterface2 = (X, Y) -> {
			System.out.println("Hello " + X + Y);
		};
		
		myInterface2.message(name, symbol);*/
		
		//LambdaFrame lambdaFrame = new LambdaFrame();
		
		//		83------------------------
		//		81 / (-2) new / use this index from here-----
		
		Integer[] intArray = {1, 2, 3, 4, 5};
	    Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
	    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
	    String[] stringArray = {"B","Y","E"};
	    
	    
	    displayArray(intArray);
	    displayArray(doubleArray);
	    displayArray(charArray);
	    displayArray(stringArray);
	    System.out.println(getFirst(intArray));
	    System.out.println(getFirst(doubleArray));
	    System.out.println(getFirst(charArray));
	    System.out.println(getFirst(stringArray));
	    
	    
	    MyIntegerClass myInt1 = new MyIntegerClass(1);
	    MyDoubleClass myDouble1 = new MyDoubleClass(3.14);
	    MyCharacterClass myChar1 = new MyCharacterClass('@');
	    MyStringClass myString1 = new MyStringClass("Hello");
	    System.out.println(myInt1.getValue());
	    System.out.println(myDouble1.getValue());
	    System.out.println(myChar1.getValue());
	    System.out.println(myString1.getValue());
	    
	    
	    MyGenericClass<Integer, Integer> myVal1 = new MyGenericClass<>(1, 9);
	    MyGenericClass<Double, Double> myVal2 = new MyGenericClass<>(3.14, 1.01);
	    System.out.println(myVal1.getYValue());
	    System.out.println(myVal2.getYValue());
		
	}
}