package foo.bar.beans.member;

import foo.bar.ejb.MemberFacade;
import foo.bar.entity.Member;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "memberNew")
@RequestScoped
public class New {

    private Integer id;
    private String name;

    @EJB
    MemberFacade memFacade;
    
    public New() {
    }

    public void regist() {
        Member mem = new Member(getName());
//        Member mem = new Member(getId(), getName());
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


}
