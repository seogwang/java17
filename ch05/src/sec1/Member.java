package sec1;

public class Member {
    private String id;
    private String email;
    private String pw;
    private String name;
    private String phone;

    public Member() { }

    public Member(String id) {
        this.id = id;
    }

    public Member(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public Member(String id, String email, String pw) {
        this.id = id;
        this.email = email;
        this.pw = pw;
    }

    public Member(String id, String email, String pw, String name) {
        this.id = id;
        this.email = email;
        this.pw = pw;
        this.name = name;
    }

    public Member(String id, String email, String pw, String name, String phone) {
        this.id = id;
        this.email = email;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

