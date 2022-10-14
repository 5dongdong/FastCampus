package ch14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;


public class MemberHashMapTest {

    public static void main(String[] args) {


        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이동현");
        Member memberKim = new Member(1002, "김동현");
        Member memberKang = new Member(1003, "강동현");

        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);

        memberHashMap.showAllMember();

        HashMap<Integer, String > hashMap = new HashMap<Integer, String>();
        hashMap.put(1001, "kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap);


    }

}
