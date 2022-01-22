package day_35_Encapsulation.DinnerTasks.Scrum;

import day_31_Constructors.ScrumTask.Developer;
import day_31_Constructors.ScrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO,BA,SM;
    private ArrayList<day_31_Constructors.ScrumTask.Tester> testersList = new ArrayList<>();
    private ArrayList<day_31_Constructors.ScrumTask.Developer> developersList=new ArrayList<>();
    private int daysOfSprint;

    public ScrumTeam() {
        setPO(PO);
        setBA(BA);
        setSM(SM);

    }

    public void addTester(day_31_Constructors.ScrumTask.Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers ){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(day_31_Constructors.ScrumTask.Developer developer){
        developersList.add(developer);

    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID == employeeID);
    }
    public void removeDeveloper(int employeeID){
        developersList.removeIf(p-> p.employeeID == employeeID);
    }




    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers = " + testersList.size() +
                ", total number of developers = " + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }

    public ArrayList<Developer> getDevelopersList() {
        return developersList;
    }

    public void setDevelopersList(ArrayList<Developer> developersList) {
        this.developersList = developersList;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }
}
