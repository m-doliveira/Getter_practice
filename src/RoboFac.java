public class RoboFac {
    public static void main(String[] args) {
        RoboFac myapp= new RoboFac();
        //type psvm to create main class out of a regular class
        //System.out.print("hi");
    }
    public RoboFac (){
        //System.out.println(square(5));
        Tool Hammer= new Tool("hammer");
         Hammer.printInfo();
            Hammer.getWidth();
            Hammer.getLength();
    }
    //public int square(int x) {
       // return x*x;
    }

//}
