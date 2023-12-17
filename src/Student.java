public class Student {
    private String vards;
    private String uzvards;
    private String email;
    private String grupa;

    String getvards() {
        return vards;
    }

    String getuzvards() {
        return uzvards;
    }

    String getemail() {
        return email;
    }

    String getgrupa() {
        return grupa;
    }

    String setvards(String vards) {
        return this.vards = vards;
    }

    String setuzvards(String uzvards) {
        return this.uzvards = uzvards;
    }

    String setemail(String email) {
        return this.email = email;
    }

    String setgrupa(String grupa) {
        return this.grupa = grupa;
    }
}
