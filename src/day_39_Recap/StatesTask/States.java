package day_39_Recap.StatesTask;

public class States {

    private String name,abbreviation,politicalParty,governor,senator;
    private long population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {

        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {


        if (abbreviation == null || abbreviation.isBlank() || abbreviation.isEmpty()) {
            System.err.println("Invalid abbreviation");
            System.exit(1);

        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null || politicalParty.isBlank() || politicalParty.isEmpty()){
            System.err.println("Invalid Political Party");
            System.exit(1);

    }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isBlank() || governor.isEmpty()) {
            System.err.println("Invalid Governor");
            System.exit(1);

        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isBlank() || senator.isEmpty()) {
            System.err.println("Invalid Senator");
            System.exit(1);

        }
        this.senator = senator;
    }

    public long getPopulation() {


        return population;
    }

    public void setPopulation(long population) {
        if (population <= 0) {
            System.err.println("Invalid Population " + population);
            System.exit(1);

        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0 ){
            System.err.println("Tax rate cannot be less than 0");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
