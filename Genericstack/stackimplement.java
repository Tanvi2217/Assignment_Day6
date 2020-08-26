package Genericstack;

public class stackimplement <T extends Object>{
	private T[] stackarr;
	private int stacksize;
	private int top;
	
	public stackimplement(int i) {
		// TODO Auto-generated constructor stub
		this.stacksize = i;
		this.stack();
	}

	@SuppressWarnings("unchecked")
	public void stack() {
		this.stackarr = (T[]) new Object[stacksize];
		this.top = 0;
		
		
	}
	
	public void push(T element) {
		System.out.println("Adding..........");
		this.stackarr[++top]= element;
		System.out.println(this.stackarr[top]);
	}
	
	public T pop(T element1) {
		System.out.println("Removing..........");
		element1 = this.stackarr[top--];
		System.out.println("Removed "+ element1);
		System.out.println(stackarr[top]);
		return element1;
	}
	
	public static void main(String a[]){
        stackimplement<String> stringStack = new stackimplement<String>(7);
        stringStack.push("java");
        stackimplement<Integer> integerStack = new stackimplement<Integer>(7);
        integerStack.push(23);
    }

}
