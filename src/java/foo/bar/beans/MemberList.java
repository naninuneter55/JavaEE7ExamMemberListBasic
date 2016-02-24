package foo.bar.beans;

import foo.bar.ejb.MemberFacade;
import foo.bar.entity.Member;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class MemberList {

    @EJB
    MemberFacade memberFacade;
    
    public List<Member> getData() {
        return memberFacade.findAll();
    }

}
