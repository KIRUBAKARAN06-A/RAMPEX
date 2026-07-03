package Day_10.ClassTask;
public class House {
    String color="skyblue";
    String owner;
    int doors=3;
    int rooms=4;
    int windows=10;
    int bhk=2;
    public void opendoors() {
        System.out.print("door opened");
    }
    public static void main(String [] args){
        House sHome = new House();
        House yHome = new House();
        System.out.print(sHome.rooms);
        sHome.owner="kiruba";
        System.out.print(yHome.owner);
        yHome.owner="y";
        yHome.color="pink";
        sHome.color=yHome.color;
        System.out.print("the HouseOwner: "+ sHome.owner
                   + " and the house color is "+sHome.color);



    }
}
