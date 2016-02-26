package foo.bar.beans;

import foo.bar.ejb.MemberFacade;
import foo.bar.entity.Member;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class MemberEdit implements Serializable{

    private Member member;
    
    @EJB
    MemberFacade memberFacade;
    
    public MemberEdit() {
    }
    
    @PostConstruct
    public void init(){
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        Integer id = (Integer)flash.get("memberId");
        member = memberFacade.find(id);
    }
    
    public String edit() {
        memberFacade.edit(member);
        return "list.xhtml";
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

}
