class ApartmentExecutor{
public static void main(String args[]){
//creating multiple copy of objects
//ClassName ref = new ClassName();
Apartment apartment = new Apartment();
apartment.apartmentID = 1;
apartment.apartmentName = "Sathva";
apartment.noOfFloors = 6;
apartment.location = "kengeri";
apartment.noOfTwoBhkFlats = 35;
apartment.noOfThreeBhkFlats = 22;

System.out.println("ApartmentID is "+ apartment.apartmentID);
System.out.println("ApartmentName is "+ apartment.apartmentName);
System.out.println("Apartment Floors is "+ apartment.noOfFloors);
System.out.println("Apartment Type of Flates "+ apartment.noOfTwoBhkFlats);
System.out.println("Apartment Type of Flates "+ apartment.noOfThreeBhkFlats);
apartment.provideAccomadation();
}
}
