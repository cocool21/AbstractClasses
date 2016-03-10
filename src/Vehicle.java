public abstract class Vehicle { 
public Vehicle(){
	
}

public String Run() {
   return "A vehicle can run.";
}

public String Stop() {
    return "A vehicle can stop.";
}

public String Accelerate() {
    return "A vehicle can accelerate.";
}


abstract String NoIdeaWhatThisFor(); //an abstract method

}