package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dibas.food.Meal;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

//		Meal myMenu = new Meal();
//		System.out.println("*** Dibas Restaurant ***\n"+myMenu.whatsInTodaysMeal());
		
		
		//Meal mySpringMeal = (Meal) appContext.getBean("meal");
		//System.out.println("Spring Meal : "+mySpringMeal.whatsInTodaysMeal());
		
		
		Meal mymealAutowiredbyType = appContext.getBean("mealAutowiredbyType",Meal.class);
		System.out.println("mealAutowiredbyType :\n "+mymealAutowiredbyType.whatsInTodaysMeal());
 		

		Meal mymealAutowiredbyName = appContext.getBean("mealAutowiredbyName",Meal.class);
		System.out.println("mealAutowiredbyName :\n "+mymealAutowiredbyName.whatsInTodaysMeal());
 		
		
		((FileSystemXmlApplicationContext) appContext).close();

	}

}
