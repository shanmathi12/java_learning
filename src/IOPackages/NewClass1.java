package IOPackages;

public class NewClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool = false;
		 
        // Creating new FilePermissions("Path", "action")
        FilePermission FP_obj1 = new FilePermission("GEEKS", "read");
        FilePermission FP_obj2 = new FilePermission("ABC", "write");
        FilePermission FP_obj3 = new FilePermission("GEEKS", "read");
 
        // Use of equals method
        bool = FP_obj2.equals(FP_obj1);
        System.out.println("Whether FP_obj1 equals FP_obj2 : " + bool);
 
        bool = FP_obj2.equals(FP_obj3);
        System.out.println("Whether FP_obj2 equals FP_obj2 : " + bool);
 
        bool = FP_obj1.equals(FP_obj3);
        System.out.println("Whether FP_obj3 equals FP_obj1 : " + bool);

	}

}
