

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Double;
import java.util.*;
public class DataSet {
	
	
	
	static List<Double> arrayList;
	static Double possionarry[];
	static Double array[];
	static Double lemda=500.0;
	static Double epsolon = 2.71828;
	
	public static Double nogenerator(){
		
		Random Randomno = new Random();
       Double L = 1/Math.pow(epsolon,lemda);
       Double u;
       Double k = 0.0;
       Double p = 1.0;
        
       do{
        k = k +1;
        u =  Randomno.nextDouble();
         p = p*u;
        
       }
   while(p > L);
       
   return (k-1);
	}
	
	
	
	public   Double[] possionNo(int range){
		Double dataset[] =new Double[range];
		DataSet D2 = new DataSet();
		Double bin[] = new Double[range];
		System.out.println("in possion");
		for (int trial = 0; trial < range; trial++) {
			bin[trial] =  (double)nogenerator(); 
		}
		System.out.println(Arrays.toString(bin));
	    
		
		return bin;
		}
		
		
	
	public static Double[] random(int range){
		 array = new Double[range];
		 Random Randomno = new Random();

	      
	      Randomno.setSeed(1015);
		for(int i = 0;i<range;i++){
			array[i] = Randomno.nextDouble() * range;
			
		}
		
		return array;
	}
	
	public static Double[] sorted(int range){
		 array = new Double[range];
		
		 for(int i = 0;i<range;i++){
			array[i] = (double)(i+100);
			
		}
		return array;
		
	}
	
	
	public static Double[] onefourth(int range){
		 array = new Double[range];
		 Random Randomno = new Random();
		 
		 for(int i = 0;i<range;i++){
			if(i%4==0)
				 array[i] = (double)(i);
			 else
			array[i] = Randomno.nextDouble()*range;;
			
		}
		 System.out.println(Arrays.toString(array));
		return array;
	}
	
	
	/*public static void main(String[] args) {
		
		DataSet D2 = new DataSet();
		Double array1[] = new Double[100];
		
		array1 = D2.sorted(20);
		System.out.println(Arrays.toString(array1));
		
	}*/
	
	
	
}
