public class Tool {

    private int length = 3;
    private int width=7;
    public boolean a =true;
    public String name;
    //constructor
    public Tool( String pName){
        name=pName;

    }
    public void printInfo(){
        System.out.println("The name of the tool is "+ name +".");
        System.out.print("It is "+ length +" inches long and "+width+" inches wide");

    }
    public void available(int time){
       System.out.println("available at "+time);
    }
    public void available(boolean a){
       if((a)=true){
        System.out.println(" (available now).");
    }}


        public int getWidth (){
        return  width;
    }
    public int getLength (){
        return length;
    }

}
