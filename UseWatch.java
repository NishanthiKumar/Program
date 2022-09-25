package day7_objectwithconditions;

public class UseWatch {
	public static void main(String[] args) {
		Watch w1=new Watch();
		w1.brand="TITAN";
		w1.isWarrantyAvailable=true;
		w1.price=999;
		w1.strapMaterial="leather";
		w1.strapColor="black";
		
		Watch w2=new Watch();
		w2.brand="FAST TRACK";
		w2.isWarrantyAvailable=false;
		w2.price=1500;
		w2.strapMaterial="metal";
		w2.strapColor="white";
		
		Watch w3=new Watch();
		w3.brand="ROLAX";
		w3.isWarrantyAvailable=true;
		w3.price=5000;
		w3.strapMaterial="metal";
		w3.strapColor="silver";
		
		Watch w4=new Watch();
		w4.brand="FOSSILE";
		w4.isWarrantyAvailable=false;
		w4.price=2500;
		w4.strapMaterial="leather";
		w4.strapColor="red";
		
		/*
		 * if((w1.brand).contains("A")||(w1.brand).contains("E")||(w1.brand).contains(
		 * "I")||(w1.brand).contains("O")||(w1.brand).contains("U")) {
		 * System.out.println((w1.brand).substring(1,(w1.brand).length()-1)); } else {
		 * System.out.println(w1.brand.charAt(0)+" "+w1.brand.charAt(w1.brand.length()-1
		 * )); }
		 */		
		
//		if(w1.price>w2.price&&w1.price>w3.price&&w1.price>w4.price) {
//			System.out.println(w1.brand.toUpperCase());
//		}
//		else if(w2.price>w1.price&&w2.price>w3.price&&w2.price>w4.price) {
//			System.out.println(w2.brand.toUpperCase());
//		}
//		else if(w3.price>w1.price&&w3.price>w2.price&&w3.price>w4.price) {
//			System.out.println(w3.brand.toUpperCase());
//		}
//		else {
//			System.out.println(w4.brand.toUpperCase());
//		}
		
		
//		if(w1.price<w2.price&&w1.price<w3.price&&w1.price<w4.price) {
//			System.out.println(w1.brand+" "+w1.strapColor);
//		}
//		else if(w2.price<w1.price&&w2.price<w3.price&&w2.price<w4.price) {
//			System.out.println(w2.brand+" "+w2.strapColor);
//		}
//		else if(w3.price<w1.price&&w3.price<w2.price&&w3.price<w4.price) {
//			System.out.println(w3.brand+" "+w3.strapColor);
//		}
//		else {
//			System.out.println(w4.brand+" "+w4.strapColor);
//		}
		
		
		if(w1.isWarrantyAvailable==true) {
			System.out.println(w1.price+(w1.price*15/100));
		}
		else {
			System.out.println(w1.price-(w1.price*10/100));
		}
		if(w2.isWarrantyAvailable==true) {
			System.out.println(w2.price+(w2.price*15/100));
		}
		else {
			System.out.println(w2.price-(w2.price*10/100));
		}
		if(w3.isWarrantyAvailable==true) {
			System.out.println(w3.price+(w3.price*15/100));
		}
		else {
			System.out.println(w3.price-(w3.price*10/100));
		}
		if(w4.isWarrantyAvailable==true) {
			System.out.println(w4.price+(w4.price*15/100));
		}
		else {
			System.out.println(w4.price-(w4.price*10/100));
		}
		
		
	}

}
