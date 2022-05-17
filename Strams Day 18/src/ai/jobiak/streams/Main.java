package ai.jobiak.streams;

//Step 1: Create an example class containing at least one member.
class Main{
public void show(){
System.out.println("We are inside A class");
}


//Step 2: Create the Main class which contains the main method.

public static void main(String [] args){

// Step 3: Create simple object and call the show() method
Main obj1 = new Main();
obj1.show();
System.out.println("====================================");

// Step 4: Create anonymous object
  Main obj = new Main(){
  
  @Override
  public void show(){
   
    System.out.println("Anonymous class has been created");
    
  } 
  };

// Step 5 : Use your anonymous object.

 obj.show();
    
}
}

