package domains.user;

import base.BaseEntity;
import domains.account.Account;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends BaseEntity<Long> {


   /* private String name;
    private String lastName;
    private int age;
    private Date birthDate;
    private String gender;*/

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Account> accounts = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
