package NEWERAPOKEMON;


public class PROFILEFOES extends NEWERAPOKEMON {

    protected String urlf;
    protected String surlf;
    protected String s1f;
    protected String s2f;
    protected String Atkf;
    protected String details1f;
    protected String details2f;
    protected String detailAtkf;
    protected String call ;

    public void setProfilePic(String urlf) {
        this.urlf = urlf;
    }

    public void setCall(String call){
        this.call = call;
    }

    public  void setsProfilePic(String surlf) {
        this.surlf = surlf;
    }

    public void setS1Pic(String s1f) {
        this.s1f = s1f;
    }

    public  void setS2Pic(String s2f) {
        this.s2f = s2f;
    }

    public void setAtkPic(String Atkf) {
        this.Atkf = Atkf;
    }

    public void setDetailAtk(String detailAtkf) {
        this.detailAtkf = detailAtkf;
    }

    public  void setDetailS1(String details1f) {
        this.details1f = details1f;
    }

    public void setDetailS2(String details2f) {
        this.details2f = details2f;
        }

        public String getProfilePic() {
            return urlf;
        }

        public String getsProfilePic() {
            return surlf;
        }

        public String getS1Pic(){
            return s1f;
        }

        public String getS2Pic(){
            return s2f;
        }

        public String getAtkPic(){
            return Atkf;
        }

        public String getCall(){
            return call;
        }

       
}