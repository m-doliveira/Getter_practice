public class Tool {
    private int length = 3;
    private int width = 7;
    public String name;
    //constructor
    public Tool( String pName){
        name=pName;

    }
    public void printInfo(){
        System.out.println("The name of the tool is "+ name +".");
        System.out.println("It is "+ length +" inches long and "+width+" inches wide.");

    }
    public int getWidth (){
        return  width;
    }
    public int getLength (){
        return length;
    }

}
