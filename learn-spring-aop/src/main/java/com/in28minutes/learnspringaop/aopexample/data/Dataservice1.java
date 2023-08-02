package com.in28minutes.learnspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dataservice1 {
	
	public int[] retrieveData() {
		return new int [] {1,2,3,4,5};
	}

}
