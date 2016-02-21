package foo.bar.beans.member;

import foo.bar.ejb.MemberFacade;
import foo.bar.entity.Member;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "memberIndex")
@RequestScoped
public class Index {

    @EJB
    MemberFacade memFacade;
    
    public List<Member> getData() {
        return memFacade.findAll();
    }

}
