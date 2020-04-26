package NEWERAPOKEMON;


public class PROFILEPARTNER extends NEWERAPOKEMON {

        protected static String url;
        protected static String s1;
        protected static String s2;
        protected static String Atk;

        protected static String details1;
        protected static String details2;
        protected static String detailAtk;

        public static void setProfilePic(String url) {
            PROFILEPARTNER.url = url;
        }
        public static void setS1Pic(String s1) {
            PROFILEPARTNER.s1 = s1;
        }
        public static void setS2Pic(String s2) {
            PROFILEPARTNER.s2 = s2;
        }

        public static void setAtkPic(String Atk) {
            PROFILEPARTNER.Atk = Atk;
        }

        public static void setDetailAtk(String detailAtk) {
            PROFILEPARTNER.detailAtk = detailAtk;
        }

        public static void setDetailS1(String details1){
            PROFILEPARTNER.details1 = details1;
        }

        public static void setDetailS2(String details2){
            PROFILEPARTNER.details2 = details2;
        }

        public static String getProfilePic() {
            return url;
        }

        public static String getS1Pic(){
            return s1;
        }

        public static String getS2Pic(){
            return s2;
        }

        public static String getAtkPic(){
            return Atk;
        }
}