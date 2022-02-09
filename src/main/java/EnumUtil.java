package main.java;

public class EnumUtil {
    public static void main(String[] args) {
        ENUM2 enumData= ENUM2.text2;
        System.out.println(ENUM2.getText2Enum(enumData));
        System.out.println(ENUM2.("text0"));

    }



    enum ENUM1{
        _0, _1, _2, _3,_4,
        _5,
        _6,
        _7,
        _8,
        _9;

        public static ENUM1 getBasedOnIndex(int index){
            if(index==0) return _0;
            if(index==1) return _1;
            if(index==2) return _2;
            if(index==3) return _3;
            if(index==4) return _4;
            if(index==5) return _5;
            if(index==6) return _6;
            if(index==7) return _7;
            if(index==8) return _8;
            if(index==9) return _9;
            return _0;
        }
    }

    enum ENUM2{
        text0,
        text1,
        text2,
        text3,
        text4,
        text5,
        text6,
        text7,
        text8,
        text9;




        public static int getIndexNo(ENUM2 enumData){
            if(enumData==text0) return 0;
            if(enumData==text1) return 1;
            if(enumData==text2) return 2;
            if(enumData==text3) return 3;
            if(enumData==text4) return 4;
            if(enumData==text5) return 5;
            if(enumData==text6) return 6;
            if(enumData==text7) return 7;
            if(enumData==text8) return 8;
            if(enumData==text9) return 9;

            //when no case match - error block
            return 0;
        }
        public static ENUM1 getText2Enum(ENUM2 enumData){
            return ENUM1.getBasedOnIndex(ENUM2.getIndexNo(enumData));
        }







    }

}
