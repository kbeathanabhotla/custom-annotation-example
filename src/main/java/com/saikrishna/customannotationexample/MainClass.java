package com.saikrishna.customannotationexample;
import java.lang.reflect.Field;


public class MainClass
{
	public static void main(String[] args) 
	{
		int noFieldsPresent = 0;
		
		POJOClass instance = new POJOClass();
	
		Class<?> clazz = instance.getClass();
		
		Field[] fields = clazz.getDeclaredFields();
		
		if(fields.length == 0)
		{
			System.out.println("There are no fields in the class");
		}
		else
		{
			for(Field f: fields) 
	        {
	            if(f.isAnnotationPresent(CustomAnnotation.class)) 
	            {
	            	CustomAnnotation ca = f.getAnnotation(CustomAnnotation.class);
	            	System.out.println("The field "+f.getName()+" has the annotation and the values are value1 : "+ca.value1()+"\t value2 : "+ca.value2());
	            }
	            else
	            {
	            	noFieldsPresent++;
	            }
	        }
		}
		
		if(noFieldsPresent == fields.length)
		{
			System.out.println("There are no fields with the annotation @CustomAnnotation");
		}
        
	}
}
