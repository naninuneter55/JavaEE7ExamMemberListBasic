package foo.bar.beans;

import foo.bar.entity.Member;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class MemberCreate extends AbstractMemberForm{

    public MemberCreate() {
    }

    public String create() {
        Member mem = new Member(getName(), getBirthday(), getGender());
        memberFacade.create(mem);
        return "list.xhtml";
    }
}
