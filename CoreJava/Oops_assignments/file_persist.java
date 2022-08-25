abstract class Persistence {
  
 
  public abstract void methodInvoke();

  
}



class FilePersistence extends Persistence {
 
  public void methodInvoke() {
    System.out.println("Invoking the file method");
  }

  
}


class DatabasePersistence extends Persistence {
 
  public void methodInvoke() {
    System.out.println("Invoking the database method");
  }

 
}


class Client {
  public static void invoke(Persistence[] list) {
    for (int i = 0; i < list.length; i++) {
    
      list[i].methodInvoke(); 
    }
  }

 
}

public class file_persist {
  public static void main(String[] args) {
    
	  Persistence[] obj = new Persistence[2]; 
    obj[0] = new FilePersistence(); 
    obj[1] = new DatabasePersistence(); 

   
    Client.invoke(obj);

     
   
  }
}