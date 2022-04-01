package structural;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private  Set<HealthcareServiceable> members;
    public HealthcareWorkerTeam() {
        if (members == null) {
            members = new LinkedHashSet<>();
        }
    }
    public void addMember(HealthcareServiceable user){
        members.add(user);
        return ;
    }

    public void removeMember(HealthcareServiceable user){
        members.remove(user);
        return ;
    }
    public void service(){
        Iterator<HealthcareServiceable> it = this.members.iterator();
        while (it.hasNext()) {
            HealthcareServiceable healthcareServiceable = it.next();
            healthcareServiceable.service();
        }
    }
    public double getPrice(){
        double totalPrice = 0.0;
        for (HealthcareServiceable member : this.members) {
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }
}
