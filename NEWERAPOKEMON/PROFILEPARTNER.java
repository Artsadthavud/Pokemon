package NEWERAPOKEMON;

public class PROFILEPARTNER extends NEWERAPOKEMON {

        protected String url;
        protected String surl;
        protected String s1;
        protected String s2;
        protected String Atk;
        protected String details1;
        protected String details2;
        protected String detailAtk;

        protected boolean getAEGIS = false ;
        protected boolean getTB = false ;

        public void setgetAEGIS(boolean getAEGIS) {
            this.getAEGIS = getAEGIS;
        }

        public void setgetTB(boolean getTB){
            this.getTB = getTB;
        }

        public void setProfilePic(String url) {
            this.url = url;
        }
        public void setsProfilePic(String surl) {
            this.surl = surl;
        }
        public void setS1Pic(String s1) {
            this.s1 = s1;
        }
        public void setS2Pic(String s2) {
            this.s2 = s2;
        }

        public void setAtkPic(String Atk) {
            this.Atk = Atk;
        }

        public void setDetailAtk(String detailAtk) {
            this.detailAtk = detailAtk;
        }

        public void setDetailS1(String details1){
            this.details1 = details1;
        }

        public void setDetailS2(String details2){
            this.details2 = details2;
        }

        public String getProfilePic() {
            return url;
        }

        public String getsProfilePic() {
            return surl;
        }

        public String getS1Pic(){
            return s1;
        }

        public String getS2Pic(){
            return s2;
        }

        public String getAtkPic(){
            return Atk;
        }

        public boolean getAEGIS(){
            return getAEGIS;
        }

        public boolean getTB(){
            return getTB;
        }
}