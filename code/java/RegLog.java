package Login;

public class RegLog {
    private String nama;
    private String email;
    private String password;

    public RegLog(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password =  password;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password =  password;
    }

}