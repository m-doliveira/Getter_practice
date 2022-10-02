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
        Hammer.available(true);
            Hammer.getWidth();
            Hammer.getLength();
            Parts Rod= new Parts();

            Rod.partInfo();

    }


    //public int square(int x) {
       // return x*x;
    }

//}
