import java.util.*;
    public class genericstack <E> 
   { 
       Stack <E> stk = new Stack <E>();	public void push(E obj) 
        { 
           stk.push(obj);
	}
	public E pop()
        {
            E obj = stk.pop();
	    return obj;
	}
    } 