package zadaci_02_09_2016;

public class Zadatak_5_MyStackRevised {

	public static void main(String[] args) {
		//Creates MyStack object
		MyStack stack1 = new MyStack();
        
		//Adds numbers to stack
		for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
		
		//Creates second MyStack object cloned
        MyStack stack2 = (MyStack) stack1.clone();
        
        // Remove two items
        stack1.pop();
        stack1.pop();

        // Prints size for both stacks to make sure they are different
        System.out.println("Stack 1 size is: " + stack1.getSize());
        System.out.println("Stack 2 size is: " + stack2.getSize());
	}

}
