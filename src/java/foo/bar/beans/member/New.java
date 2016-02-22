package foo.bar.beans.member;

import foo.bar.ejb.MemberFacade;
import foo.bar.entity.Member;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Named(value = "memberNew")
@RequestScoped
public class New {

    private Integer id;
    @NotNull @Size(min=1, max=64)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private int gender;

    @EJB
    MemberFacade memFacade;
    
    public New() {
    }

    public void regist() {
        Member mem = new Member(getName(), getBirthday(), getGender());
        memFacade.create(mem);
        
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
