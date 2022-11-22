public class Medic extends Hero  {
    @Override
    public void applySuperAbility() {System.out.println("cure everyone");
    }

    public int healPoint  = 100;


    public String increseExperinance(){
        double tenPercetn  = (((20*healPoint)/100 )+ healPoint);

        return "Heal points: " +healPoint+" увеличелся на 10% стало: "+ tenPercetn;
    }

}
