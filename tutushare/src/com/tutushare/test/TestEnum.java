package com.tutushare.test;

import java.util.EnumMap;
import java.util.EnumSet;

public class TestEnum {
	enum Test {
		OFF, ON
	};

	public static void main(String[] args) {
		// 直接变量enum
		for (Test s : Test.values()) {
			System.out.println(s.name());
		}

		// switch与enum的结合使用
		Test switchState = Test.OFF;
		switch (switchState) {
			case OFF:
				System.out.println("OFF");
				break;
			case ON:
				System.out.println("ON");
				break;
		}
		
		  //EnumSet的使用    
        EnumSet<Test> testSet = EnumSet.allOf(Test.class);    
        for (Test s : testSet) {    
            System.out.println(s);    
        }    
        
        //EnumMap的使用    
        EnumMap testMap = new EnumMap(Test.class);    
        testMap.put(Test.ON, "is On");    
        testMap.put(Test.OFF, "is off");  
        for (Test s : Test.values()) {    
            System.out.println(s.name() + ":" + testMap.get(s));    
        }  
	}

}
