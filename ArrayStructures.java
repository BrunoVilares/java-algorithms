//Java algorithms tutorial
public class ArrayStructures{

	private int[] theArray = new int[50];
	private int arraySize = 10; // storing array size

	public void generateRandomArray(){
		for(int i = 0; i < arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10; //genrate numbers bewteen 10 19		
		}
	}

	public void printArray(){
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++){
			System.out.print("| " + i + " |");
			System.out.println(theArray[i] + " |");

			System.out.println("----------");
		}
	}
	
	public int getValueAtIndex(int index){
		if(index < arraySize) return theArray[index];	
		return 0;
	}

	public boolean doesArrayContainThisValue(int searchValue){
		boolean valueIntArray = false;

		for(int i = 0; i < arraySize; i++){
			if(theArray[i] == searchValue){
				valueIntArray = true;
			}
			
		}
		return valueIntArray;
	}

	public void deleteIndex(int index){

		if(index < arraySize){
			for(int i = index; i < (arraySize -1); i++ ){
				theArray[i] = theArray[i+1]; //move up the values
			}
			arraySize--;

		}

	}

	public static void main(String[] args){
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		
		System.out.println("the value is " + newArray.getValueAtIndex(3));
		System.out.println(newArray.doesArrayContainThisValue(18));
		newArray.deleteIndex(4);
		newArray.printArray();
	}

}
