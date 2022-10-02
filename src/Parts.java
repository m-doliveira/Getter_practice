public class Parts {
    public boolean need=true;
    public int part=1;
    public String name;



    public static void Parts(int part, boolean need, String name) {

    }
    public void partInfo(){
        if ((part == 1 && need) == true){
            name="Rod";
            System.out.println("The robot needs a " + name);
        }

    }
}