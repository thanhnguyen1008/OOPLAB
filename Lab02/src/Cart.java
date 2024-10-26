public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_ORDERED){
            System.out.println("THe cart is almost full");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added");
        }
    }
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; i < qtyOrdered - 1; i++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("The disc has been removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
}