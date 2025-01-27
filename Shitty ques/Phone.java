import java.util.Scanner;

class NavalVessel {
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;
    
    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }
    
    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }
    
    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }
    
    public String getPurpose() {
        return purpose;
    }
    
    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    public String getVesselName() {
        return vesselName;
    }
    
    public String getClassification() {
        return classification;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] vessels = new NavalVessel[4];
        
        // Reading 4 vessel objects
        for (int i = 0; i < 4; i++) {
            int vesselId = sc.nextInt();
            sc.nextLine();  // Consume newline
            String vesselName = sc.nextLine();
            int planned = sc.nextInt();
            int completed = sc.nextInt();
            sc.nextLine();  // Consume newline
            String purpose = sc.nextLine();
            vessels[i] = new NavalVessel(vesselId, vesselName, planned, completed, purpose);
        }

        int percentage = sc.nextInt();
        sc.nextLine();  // Consume newline
        String purpose = sc.nextLine();

        // Call methods
        double avgVoyages = findAvgVoyagesByPct(vessels, percentage);
        if (avgVoyages > 0) {
            System.out.println(avgVoyages);
        } else {
            System.out.println("0");
        }

        NavalVessel vessel = findVesselByGrade(vessels, purpose);
        if (vessel != null) {
            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }

    public static double findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        double totalCompleted = 0;
        int count = 0;
        for (NavalVessel vessel : vessels) {
            double pct = (vessel.getNoOfVoyagesCompleted() * 100.0) / vessel.getNoOfVoyagesPlanned();
            if (pct >= percentage) {
                totalCompleted += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }
        return count == 0 ? 0 : totalCompleted / count;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                double pct = (vessel.getNoOfVoyagesCompleted() * 100.0) / vessel.getNoOfVoyagesPlanned();
                if (pct == 100) {
                    vessel.setClassification("Star");
                } else if (pct >= 80) {
                    vessel.setClassification("Leader");
                } else if (pct >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null;
    }
}