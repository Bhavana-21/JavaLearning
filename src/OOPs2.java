
public class OOPs2 {

	 
		// TODO Auto-generated method stub
	//Method overloading
	int i = 10;

    void prnt(){
        System.out.println("in parent method");
    }

    void prnt(String s){
        System.out.println("in Parent "+ s);
    }

    void prnt(int s){
        System.out.println("Java" + s);
    }

    void prnt(int s, int b){
        System.out.println("in Parameterized method integer");
    }

    public void parentMethod(){
      System.out.println("Im in Child Class");
   }
    public static void main(String args[]){
    	
    	System.out.println("This is parent method");
    }

}
		
	


