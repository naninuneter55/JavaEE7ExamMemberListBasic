package foo.bar.beans;

import foo.bar.entity.Member;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class MemberEdit extends AbstractMemberForm{

    public MemberEdit() {
    }

    public String form(int id) {
        System.out.println("###### id : " + id + " #####");
        Member m = memberFacade.find(id);
        setId(m.getId());
        setName(m.getName());
        setBirthday(m.getBirthday());
        setGender(m.getGender());
        return "edit.xhtml";
    }
    

    public String edit() {
        System.out.println("####### id : " + getId() + " #####");
        Member m = new Member(getId(), getName(), getBirthday(), getGender());
        memberFacade.edit(m);
        return "list.xhtml";
    }

}
