package foo.bar.beans;

import foo.bar.ejb.MemberFacade;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

abstract public class AbstractMemberForm  implements Serializable{

    private Integer id;
    @NotNull @Size(min=1, max=64)
    private String name;
    @Temporal(TemporalType.DATE) @Past
    private Date birthday;
    private int gender;

    @EJB
    MemberFacade memberFacade;
    
    public AbstractMemberForm() {
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
