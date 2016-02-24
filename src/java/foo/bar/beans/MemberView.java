package foo.bar.beans;

import foo.bar.ejb.MemberFacade;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class MemberView {

    private Integer id;
    private String name;
    private Date birthday;
    private int gender;

    @EJB
    MemberFacade memberFacade;
    
    public MemberView() {
    }

    public String view(int id) {
        System.out.println("##### id : " + id + " #####");
        return "list.xhtml";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }



}
