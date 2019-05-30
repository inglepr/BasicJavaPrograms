package com.bridgelabz.objectprogram;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Inventery1 {
	Inventery object=new Inventery ();
	
	object.setName("ram");
	object.setPrice(11);
	object.setWeigth(50);
		
try {

}
catch(FileNotFoundException e){
e.fillInStackTrace();

}
catch(IOException e){
	e.fillInStackTrace();
	
}
catch(ParseException e){
	e.fillInStackTrace();
	
}

}}
}
