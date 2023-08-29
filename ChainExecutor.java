class ChainExecutor{
public static void main(String args[]){

Chain chain = new Chain();
chain.nameOfChain = "Silver Link Chain";
chain.typeOfChain = "Silver";
chain.costOfChain = 1200;
chain.madeWith = "925 SILVER";
chain.length = 17;
chain.thickness = "12mm";
System.out.println("Name of Chain is "+ chain.nameOfChain);
System.out.println("Type of Chain is "+ chain.typeOfChain);
System.out.println("Cost of Chain is "+ chain.costOfChain);
System.out.println("Made of Chain is "+ chain.madeWith);
System.out.println("Length of Chain is "+ chain.length);
System.out.println("Thickness of Chain is "+ chain.thickness);
chain.wearingToShine();
}
}
