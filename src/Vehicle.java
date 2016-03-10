public abstract class Vehicle { 
public Vehicle(){
	
}

public String Run() {
   return "A vehicle cannot fly.";
}

public String Stop() {
    return "A vehicle cannot fly.";
}

public String Accelerate() {
    return "A vehicle cannot fly.";
}

public String cantFly() {
    return "A vehicle cannot fly.";
}

public String centFloat() {
    return "A vehicle cannot float.";
}

public String cantHaul() {
    return "A vehicle cannot haul 10 tons of gravel.";
}

abstract String NoIdeaWhatThisFor(); //an abstract method

}