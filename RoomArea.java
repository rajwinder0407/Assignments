class Room{
    float length;
    float breadth;
    void getdata(float a,float b){
        length=a;
        breadth=b;
    }
}

public class RoomArea {
    public static void main(String [] args){
        float area;
        Room room1=new Room();
        room1.getdata(4,10);

        area=room1.length*room1.breadth;
        System.out.println("Area="+area);
    }

}
