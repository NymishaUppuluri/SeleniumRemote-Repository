package Oops;

public class Address {


    String DoorNumber;
 String StreetNumber;
 String City;
 int PinCode;

 Address() {
     DoorNumber = "1-103";
     StreetNumber = "1";
     City = "Visakhapatnam";
     PinCode = 531173;
 }
 void  printAddress(){


     System.out.println(DoorNumber);
     System.out.println(StreetNumber);
     System.out.println(City);
     System.out.println(PinCode);
 }
 public static void main(String[]args) {
     Address address = new Address();
Address address1 = new Address();
System.out.println("Initial values of Address in address");
address.printAddress();
System.out.println("Initial Address values in address1");
address1.printAddress();
System.out.println("Updated Address values in address1");
address1.DoorNumber = "1-203";
address1.StreetNumber = "23";
address1.City = "Hyd";
address1.PinCode = 5300089;
     address1.printAddress();





 }





}





