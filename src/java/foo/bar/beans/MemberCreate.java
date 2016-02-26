package foo.bar.beans;

import foo.bar.entity.Member;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class MemberCreate extends AbstractMemberForm{
    
    public MemberCreate() {
    }

    public String create() {
        Member m = new Member(getName(), getBirthday(), getGender());
        memberFacade.create(m);
        return "list.xhtml";
    }
}
