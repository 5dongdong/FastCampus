package ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이동현");
        Member memberKim = new Member(1002, "김동현");
        Member memberKang = new Member(1003, "강동현");
        Member memberHong = new Member(1004, "홍동현");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberID());
        memberArrayList.showAllMember();
    }

}
