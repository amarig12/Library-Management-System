package Assignment3;

public class Member {
    private int memberID;
    private String name;
    private int memberPoints;

    //constructor
    public Member(int memberID, String name, int memberPoints){
        this.memberID = memberID;
        this.name = name;
        this.memberPoints = memberPoints;
    }

    //accessor
    public String getName(){
        return name;
    }

    //mutator
    public void setMemberPoints(int memberPoints){
        this.memberPoints = memberPoints;
    }

    //to string
    public String toString(){
        return "Member ID: "+memberID+"\nMember Name: "+name+"\nMember Points: "+memberPoints+"\n";
    }
}
