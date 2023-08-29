class FastTrackExecutor{
public static void main(String args[]){

FastTrack fasttrack = new FastTrack();
fasttrack.brandName = "FastTrack";
fasttrack.bandMaterial = "Silicone";
fasttrack.cost = 1500;
fasttrack.thickness = "25mm";
fasttrack.weihgt = "125gram";
fasttrack.displayType = "Analog";

System.out.println("Name of watch is "+ fasttrack.brandName);
System.out.println("Name of bandMaterial is "+ fasttrack.bandMaterial);
System.out.println("cost is "+ fasttrack.cost);
System.out.println("Thickness  is "+ fasttrack.thickness);
System.out.println("Weight is "+ fasttrack.weihgt);
System.out.println("DisplayType is "+ fasttrack.displayType);
fasttrack.wearingInHand();
}
}