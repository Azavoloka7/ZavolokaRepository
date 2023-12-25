package genericClasses;

public class MyGenericClass <T1 extends Number, T2 > {
	T1 x;
	T2 y;
	
	
	
    MyGenericClass(T1 x, T2 y){
		this.x = x;
		this.y = y;
	}
    
    public T2 getValue() {
    	return y;
    }
		
}

