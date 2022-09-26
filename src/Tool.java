public class Tool {
    public int length;
    public int width ;
    public String name;
    //constructor
    public Tool( String pName, int pWidth,int pLength){
        name=pName;
        length=pLength;
        width=pWidth;
    }
    public void printInfo(){
        System.out.println("The name of the tool is "+ name +".");
        System.out.println("It is "+ length +" inches long and "+width+" inches wide.");

    }

}
