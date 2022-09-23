package by.home.maxzzzit;

public class ProstieDvyhznachnieChislaVDiapazone {
	
	// Надо найти и вывести на экран все простые двухзначные числа!
	public static void main(String[] args) {
		int count = 0;
		for (int num=10; num<100; num++) {
			for (int i=2; i<=(num/2); i++)
				if (num%i==0)
					count++;
				if (count==0)
					System.out.println("Это простое двухзначное число: "+num);			
					count=0;
				}
			}
		}