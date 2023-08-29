class LenskartExecutor{
public static void main(String args[]){
Lenskart lenskart = new Lenskart();
lenskart.lenskartID = 87363;
lenskart.modelNumber = "762GG55";
lenskart.typeOfGlass = "Sunglass";
lenskart.frameSize = "15mm";
lenskart.suitedFor = 12-15;
lenskart.manfacturedYear = 2023;

System.out.println("LenskartID is "+ lenskart.lenskartID);
System.out.println("modelNumber is "+ lenskart.modelNumber);
System.out.println("typeOfGlass is "+ lenskart.typeOfGlass);
System.out.println("frameSize is "+ lenskart.frameSize);
System.out.println("suitedFor is "+ lenskart.suitedFor) ;
System.out.println("manfacturedYear is "+ lenskart.manfacturedYear);
lenskart.caringEye();
}
}