
public class OOPs1 extends OOPs2 implements Myinterface{


		// TODO Auto-generated method stub
		
	    public void prnt(){
	        System.out.println("Im in OVerride child method");
	    }

	
	    void prnt(String s){
	        System.out.println("Automation"+ s);
	    }

	    public static void main(String args[]){
	        OOPs1 oOPs1 = new OOPs1();
	        oOPs1.prnt("XYZ");
	        OOPs2 OOPsb = new OOPs1();
	        OOPsb.prnt("ABC");
	        OOPs2 OOPsc = new OOPs2();
	        OOPsc.prnt(12, 15);
	       
	    }


		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void hello1() {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void hello2() {
			// TODO Auto-generated method stub
			
		}
		
	}
